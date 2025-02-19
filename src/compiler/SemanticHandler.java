package compiler;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import controller.Degree;
import controller.DependencyManager;
import model.yaml.ExamDependency;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import model.compiler.*;

import java.time.format.DateTimeParseException;
import java.util.ArrayList;

/**
 * Analizzatore semantico per compilazione linguaggio GRAD.
 * <br>Dato un file GRAD, ricostruisce la struttura dati in <i>{@link Degree}</i> assicurandone integrità
 * e sfrutta il <i>{@link DependencyManager}</i> per verificare che gli esami siano impostati in maniera coerente coi propri vincoli (ad es. un esame con vincoli <tt>strict</tt> non superati non può essere superato).
 * <br>Sono Supportati i seguenti token di errore:
 * <ul>
 *     <li><tt>INVALID_DATE_FORMAT_ERROR (10)</tt> per errore formattazione data (dev'essere in forma dd-mm-aaaa);</li>
 *     <li><tt>EMPTY_YEAR_ERROR (11)</tt> se un anno risulta senza esami inseriti;</li>
 *     <li><tt>EMPTY_DEGREE_ERROR (12)</tt> se l'intera struttura DEGREE non risulta avere esami;</li>
 *     <li><tt>EXAM_ALREADY_EXISTS_ERROR (13)</tt> se trova un esame duplicato.</li>
 * </ul>
 * Sono supportati i seguenti token di warning (quando individuati, SemanticHandler può agire per correggere il valore compilato):
 * <ul>
 *     <li><tt>INVALID_DATE_RANGE_WARNING (100)</tt> se la data d'appello è oltre 10 anni prima o dopo la data corrente;</li>
 *     <li><tt>INVALID_STUDYHOURS_RANGE_WARNING (101)</tt> se le ore di studio sono meno di 1 o più di 24;</li>
 *     <li><tt>PASSED_AFTER_TODAY_WARNING (102)</tt> se un esame risulta passato in una data successiva rispetto alla data corrente;</li>
 *     <li><tt>STRICT_DEPENDENCY_NOT_PASSED_WARNING (103)</tt> se un esame risulta passato dopo la data corrente.</li>
 * </ul>
 */
public class SemanticHandler {
	/**
	 * Riferimento all'istanza singleton di <i>{@link Degree}</i>
	 */
	private Degree d;
	/**
	 * Riferimento all'istanza singleton di <i>{@link DependencyManager}</i>
	 */
	private DependencyManager dep;
	/**
	 * Variabile per generare in maniera incrementale gli identificativi per gli oggetti <i>{@link Year}</i>
	 */
	private int idYear;

	// ****** codici per i messaggi d'errore
	/**
	 * per errore formattazione data (dev'essere in forma dd-mm-aaaa)
	 */
	public static int INVALID_DATE_FORMAT_ERROR 	= 10;
	/**
	 * se un anno risulta senza esami inseriti
	 */
	public static int EMPTY_YEAR_ERROR = 11;
	/**
	 * se l'intera struttura DEGREE non risulta avere esami
	 */
	public static int EMPTY_DEGREE_ERROR = 12;
	/**
	 * se trova un esame duplicato
	 */
	public static int EXAM_ALREADY_EXISTS_ERROR = 13;
	/**
	 * se la data d'appello è oltre 10 anni prima o dopo la data corrente
	 */
	public static int INVALID_DATE_RANGE_WARNING 	= 100;
	/**
	 * se le ore di studio sono meno di 1 o più di 24
	 */
	public static int INVALID_STUDYHOURS_RANGE_WARNING = 101;
	/**
	 * se un esame risulta passato in una data successiva rispetto alla data corrente
	 */
	public static int PASSED_AFTER_TODAY_WARNING = 102;
	/**
	 * se un esame risulta passato dopo la data corrente
	 */
	public static int STRICT_DEPENDENCY_NOT_PASSED_WARNING = 103;


	ArrayList<String> errors;
	ArrayList<String> warnings;


	/**
	 * Costruttore del SemanticHandler. Inizializza lo stato ai valori iniziali.
	 */
	protected SemanticHandler() {
		d = null;
		idYear=1;
		errors = new ArrayList<String>();
		warnings = new ArrayList<String>();
		DependencyManager.getInstance().loadYAML();
		dep = DependencyManager.getInstance();
	}


	/**
	 * Creazione della struttura <i>{@link Degree}</i>
	 * @param name {@link Token} contenente il nome della struttura <i>Degree</i>
	 */
	public void createDegree(Token name) {
		
		String n = name.getText().replace("\"","");
		d = Degree.getDegree();
		d.reset();
		d.setName(n);
	}

	/**
	 * Imposta il numero di ore di studio giornaliero.
	 * @param hours  {@link Token} contenente ore di studio
	 */
	public void setDailyStudyHours(Token hours) {
		d.setDailyStudyHours(checkDailyStudyHours(hours));
	}

	/**
	 * Crea un anno usando un ID incrementale generato internamente da SemanticHandler.
	 * @return oggetto <i>{@link Year}</i>
	 */
	public Year createYear() {
		return new Year(idYear++);
	}

	/**
	 * Aggiunge l'oggetto <i>{@link Year}</i> a <i>{@link Degree}</i>
	 * @param y  oggetto <i>Year</i>
	 */
	public void addYear(Year y) {d.addYear(y);}

	/**
	 * Crea un nuovo oggetto <i>{@link Exam}</i> con le informazioni essenziali, verificando che:
	 * <ul>
	 *     <li>Non ci siano problemi con la data (tramite metodo <tt>checkDateDeclaration</tt>);</li>
	 *     <li>L'esame non sia già presente in <i>{@link Degree}</i>.</li>
	 * </ul>
	 * Se uno dei due eventi si presenta, possono registrarsi errors (quali INVALID_DATE_FORMAT_ERROR, EXAM_ALREADY_EXISTS_ERROR) o warnings (INVALID_DATE_RANGE_WARNING).
	 * @param name {@link Token} contenente il nome
	 * @param cfu Token contenente i CFU
	 * @param stringdate Token contenente la data
	 * @return
	 */
	public Exam createExam(Token name, Token cfu, Token stringdate) {
		
		String n = name.getText().replace("\"","");
		int c = Integer.parseInt(cfu.getText());
		LocalDate s = checkDateDeclaration(stringdate);
		if(s != null && !checkIfExamExists(name)) {
			Exam x = new Exam(n, c, s);
			Degree.getDegree().addExam(x);
			return x;
		}else
			return null;
	}

	/**
	 * Imposta il valore di <i>{@link Status}</i> in <i>{@link Exam}</i> secondo il {@link Token} ricevuto.
	 * <br>Verifica i seguenti vincoli:
	 * <ul>
	 *     <li>L'esame dev'essere passato entro il giorno corrente e non dopo;</li>
	 *     <li>L'esame può essere passato solo se gli <i>Exam</i> definiti come vincoli <tt>strict</tt> nella <i>Dependency</i> corrispondente in <i>{@link DependencyManager}</i> siano anch'essi passati. </li>
	 * </ul>
	 * Può quindi registrare i warning <tt>PASSED_AFTER_TODAY_WARNING</tt>,<tt>STRICT_DEPENDENCY_NOT_PASSED_WARNING</tt>.
	 * @param e oggetto <i>Exam</i>
	 * @param status Token contenente il valore per <i>Status</i>
	 */
	public void setExamStatus(Exam e, Token status) {
		

		String s = status.getText();
		if(!s.equals("PASSED")){
			e.setStatus(s);
			return;
		}

		boolean correct = true;
		//se l'esame è "PASSED", qui si effettuano dei controlli per valutare se la data dell'esame è dopo LocalDate.now()
		if(LocalDate.now().isBefore(e.getAppello()))
		{
			addWarning(PASSED_AFTER_TODAY_WARNING,status);
			correct = false;
		}
		//se l'esame è passato, tutte le sue dipendenze strict devono essere "PASSED", altrimenti setta a NOT_PASSED
		if(dep.hasDependency(e) && !checkPastStrictDependencies(e)){
			addWarning(STRICT_DEPENDENCY_NOT_PASSED_WARNING,status);
			correct = false;
		}

		if(!correct)
			e.setStatus("NOT_PASSED");
		else
			e.setStatus(s);
	}

	/**
	 * Assegna l'oggetto <i>{@link Exam}</i> ad una <i>{@link Milestone}</i> specificata dal {@link Token} in input.
	 * Se la <i>Milestone</i> non esiste, ne viene creata una nuova usando il nome specificato dal Token e viene assegnata ad <i>Exam</i>.
	 * @param e oggetto <i>Exam</i>
	 * @param milestone  Token contenente il nome della <i>Milestone</i>
	 */
	public void assignExamToMilestone(Exam e, Token milestone) {
		
		String mil = milestone.getText().replace("\"","");
		e.setMilestone(mil);
		
			if(d.getMilestones().keySet().contains(mil))
				d.getMilestones().get(mil).addExam(e);
			else
				createMilestone(mil).addExam(e);		
	}

	/**
	 * Crea una nuova <i>{@link Milestone}</i>.
	 * @param milestone nome della Milestone, formato <i>String</i>
	 * @return oggetto <i>Milestone</i> creato
	 */
	public Milestone createMilestone(String milestone) {
		Milestone m = new Milestone(milestone);
		d.addMilestone(m);
		return m;
	}

	// *********************** gestione degli errori

	/**
	 * Verifica se sono stati registrati errors.
	 * @return <tt>true</tt> se condizione verificata, <tt>false</tt> altrimenti
	 */
	public boolean hasErrors( ) {
		return !errors.isEmpty();
	}

	/**
	 * Verifica se sono stati registrati warning.
	 * @return <tt>true</tt> se condizione verificata, <tt>false</tt> altrimenti
	 */
	public boolean hasWarning( ) {
		return !warnings.isEmpty();
	}

	/**
	 * Restituisce ArrayList errors registrati.
	 * @return <i>ArrayList</i> di <i>String</i>
	 */
	public ArrayList<String> getErrors( ) {
		return errors;
	}

	/**
	 * Restituisce ArrayList waring registrati.
	 * @return <i>ArrayList</i> di <i>String</i>
	 */
	public ArrayList<String> getWarnings( ) {
		return warnings;
	}

	/**
	 * dato il {@link Token} col nome dell'esame, verifica se esiste un <i>{@link Exam}</i> corrispondente in <i>{@link Degree}</i>.
	 * @param t Token col nome dell'esame
	 * @return <tt>true</tt> se condizione verificata, <tt>false</tt> altrimenti
	 */
	public boolean checkIfExamExists(Token t){
		for(Year y : d.getYears())
			if(y.getExams().containsKey(t.getText())){
				addError(EXAM_ALREADY_EXISTS_ERROR,t);
				return true;
			}
		return false;
	}

	/**
	 * Verifica se l'oggetto <i>{@link Exam}</i> abbia delle dipendenze <tt>strict</tt> nella rispettiva <i>Dependency</i> in <i>{@link DependencyManager}</i>.
	 * Quindi, verifica se queste dipendenze abbiano un oggetto <i>Exam</i> corrispondente in <i>{@link Degree}</i> con attributo <i>{@link Status}</i> <tt>PASSED</tt>.
	 * @param e oggetto <i>Exam</i>
	 * @return <tt>true</tt> se condizione verificata, <tt>false</tt> altrimenti
	 */
	public boolean checkPastStrictDependencies(Exam e){
		if(!dep.hasStrictDependencies(e))
			return true;

		for(ExamDependency d : dep.getDependency(e).getStrict_dependencies()){
			if(Degree.getDegree().hasExam(e.getName()) && !Degree.getDegree().getExam(d.getExam()).isPassed()) {
				return false;
			}
		}

		return true;
	}

	/**
	 * Verifica che l'oggetto <i>{@link Year}</i> contenga almeno un <i>{@link Exam}</i>. Nel caso contrario, registra <tt>EMPTY_YEAR_ERROR</tt>.
	 * @param y oggetto <i>Year</i>
	 * @param yt {@link Token} corrispondente al <i>Year</i>
	 * @return oggetto <i>Year</i> se passa il controllo, <tt>null</tt> altrimenti
	 */
	public Year checkYear(Year y, Token yt){
		if(y.getNumExams() == 0)
		{
			addError(EMPTY_YEAR_ERROR,yt);
			idYear--;
			return null;
		}
		return y;
	}

	/**
	 * Verifica che ogni oggetto <i>{@link Year}</i> in <i>{@link Degree}</i> contenga almeno un <i>{@link Exam}</i>. Nel caso contrario, registra <tt>EMPTY_DEGREE_ERROR</tt>.
	 * @param deg {@link Token} col nome del <i>Degree</i>
	 */
	public void checkDegree(Token deg){
		if(d.getYears().isEmpty())
			addError(EMPTY_DEGREE_ERROR,deg);
	}

	/**
	 * Verifica che il numero di ore non sia minore di 1 o maggiore di 24. In caso contrario, registra <tt>INVALID_STUDYHOURS_RANGE_WARNING</tt>.
	 * @param studyhours {@link Token} contenente le ore di studio
	 * @return valore scritto nel Token se tutto ok, oppure il valore di default descritto in <i>{@link Degree}</i>, cioè 4
	 */
	public int checkDailyStudyHours(Token studyhours){
		int hhh = Integer.parseInt(studyhours.getText());
		if(hhh > 24 || hhh < 1)
		{
			addWarning(INVALID_STUDYHOURS_RANGE_WARNING, studyhours);
			return Degree.getDegree().getDailyStudyHours();
		}

		return hhh;
	}

	/**
	 * Controlla che la data nel {@link Token} sia conforme al formato "dd-MM-yyyy" e che sia nel range valido (+10/-10 anni rispetto alla data corrente). Altrimenti, registra rispettivamente <tt>INVALID_DATE_FORMAT_ERROR</tt> ed <tt>INVALID_DATE_RANGE_WARNING</tt>.
	 * @param stringdate Token contenente data
	 * @return oggetto <i>{@link LocalDate}</i> corrispondente
	 */
	public LocalDate checkDateDeclaration( Token stringdate){

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate s = null;
		try{
			s = LocalDate.parse(stringdate.getText(), dtf);
			if(s.plusYears(10L).isBefore(LocalDate.now())){
				addWarning(INVALID_DATE_RANGE_WARNING, stringdate);
				s = LocalDate.now().minusYears(10L);
			}
			if(s.minusYears(10L).isAfter(LocalDate.now())){
				addWarning(INVALID_DATE_RANGE_WARNING, stringdate);
				s = LocalDate.now().plusYears(10L);
			}
		}catch(DateTimeParseException e){
			addError(INVALID_DATE_FORMAT_ERROR, stringdate);
		}

		return s;
	}

	/**
	 * Gestisce l'errore come lessicale o sintattico.
	 * @param tokenNames
	 * @param tk
	 * @param e
	 * @param hdr
	 * @param msg
	 */
	public void handleError(String[] tokenNames, Token tk, RecognitionException e, String hdr, String msg) {

		String coors = "[" + tk.getLine() + ", " + (tk.getCharPositionInLine()+1) + "]";
		if (tk.getType() == GRADLexer.ERROR_TOKEN)
			errors.add("Errore Lessicale in " + coors + ":\t" + msg + "\t" + tk.getText());
		else
			errors.add("Errore Sintattico in " + coors + ":\t" + msg +"\t" + tk.getText());
	}

	// gestore gli errori semantici

	/**
	 * Registra messaggio d'errore.
	 * @param errCode codice d'errore <i>int</i>
	 * @param tk {@link Token} che ha causato l'errore.
	 */
	void addError (int errCode, Token tk) {
		String str = tk.getText();
		String coors = "[" + tk.getLine() + ", " + (tk.getCharPositionInLine()+1) + "]";

		String msg = "Errore Semantico in " + coors + ":\t";
		if (errCode == INVALID_DATE_FORMAT_ERROR)
			msg += "Il formato della data '"+str+"' è errato (dev'essere gg-mm-aaaa)";
		else if(errCode == EMPTY_YEAR_ERROR)
			msg += "YEAR non presenta alcun esame valido in elenco";
		else if (errCode == EMPTY_DEGREE_ERROR)
			msg += "DEGREE '"+str+"' non presenta alcun anno valido in elenco";
		else if (errCode == EXAM_ALREADY_EXISTS_ERROR)
			msg += "EXAM '"+str+"' è stato già inserito precedentemente";

		errors.add(msg);
	}

	/**
	 * Registra messaggio di warning.
	 * @param warnCode codice di warning <i>int</i>
	 * @param tk {@link Token} che ha causato il warning.
	 */
	void addWarning (int warnCode, Token tk) {
		String str = tk.getText();
		String coors = "[" + tk.getLine() + ", " + (tk.getCharPositionInLine()+1) + "]";
		String msg = "Warning in " + coors + ":\t";

		if(warnCode == INVALID_STUDYHOURS_RANGE_WARNING)
			msg += "DAILY_HOURS dev'essere compreso in [1, 24]. Impostato default: "+Degree.getDegree().getDailyStudyHours();
		else if (warnCode == INVALID_DATE_RANGE_WARNING)
			msg += "La data d'appello '"+str+"' supera il range anni consentito ["+LocalDate.now().minusYears(10L).getYear()+", "+LocalDate.now().plusYears(10L).getYear()+"]. Impostato limite più vicino";
		else if (warnCode == PASSED_AFTER_TODAY_WARNING)
			msg += "STATUS è PASSED in un appello futuro. Impostato NOT_PASSED";
		else if (warnCode == STRICT_DEPENDENCY_NOT_PASSED_WARNING)
			msg += "STATUS è PASSED ma gli esami propedeutici sono NOT_PASSED. Impostato NOT_PASSED";
		warnings.add (msg);
	}
// ----------------------- fine gestione degli errori

}
