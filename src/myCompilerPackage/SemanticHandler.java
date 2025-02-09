package myCompilerPackage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import myCompilerPackage.util.*;

import java.time.format.DateTimeParseException;
import java.util.ArrayList;

public class SemanticHandler {
	private Degree d;
	private int idYear;

	// ****** codici per i messaggi d'errore
	//public static int LEXICAL_ERROR 		= 0;
	//public static int SYNTAX_ERROR 			= 1;
	public static int INVALID_DATE_FORMAT_ERROR 	= 10;
	public static int EMPTY_YEAR_ERROR = 11;
	public static int EMPTY_DEGREE_ERROR = 12;
	public static int INVALID_DATE_RANGE_WARNING 	= 100;
	public static int INVALID_STUDYHOURS_RANGE_WARNING = 101;

	ArrayList<String> errors;
	ArrayList<String> warnings;


	protected SemanticHandler() {
		d = null;
		idYear=1;
		errors = new ArrayList<String>();
		warnings = new ArrayList<String>();
	}


	public void createDegree(Token name) {
		
		String n = name.getText().replace("\"","");
		d = Degree.getDegree();
		d.reset();
		d.setName(n);
	}
	
	public void setDailyStudyHours(Token hours) {
		d.setDailyStudyHours(checkDailyStudyHours(hours));
	}
	
	public Year createYear() {
		return new Year(idYear++);
	}
	
	
	public void addYear(Year y) {
		d.addYear(y);
	}
	
	
	public Exam createExam(Token name, Token cfu, Token stringdate) {
		
		String n = name.getText().replace("\"","");
		int c = Integer.parseInt(cfu.getText());
		LocalDate s = checkDateDeclaration(stringdate);
		if(s != null)
			return new Exam(n,c,s);
		else
			return null;
	}
	
	public void setExamStatus(Exam e, Token status) {
		
		//se l'esame è "passato", qui si effettuano dei controlli per valutare se LocalDate.now() è dopo la data dell'esame 
		e.setStatus(status.getText());
	
	}
	
	public void assignExamToMilestone(Exam e, Token milestone) {
		
		String mil = milestone.getText().replace("\"","");
		e.setMilestone(mil);
		
			if(d.getMilestones().keySet().contains(mil))
				d.getMilestones().get(mil).addExam(e);
			else
				createMilestone(mil).addExam(e);		
	}
	
	
	public Milestone createMilestone(String milestone) {
		Milestone m = new Milestone(milestone);
		d.addMilestone(m);
		return m;
	}

	// *********************** gestione degli errori

	public boolean hasErrors( ) {
		return !errors.isEmpty();
	}
	public boolean hasWarning( ) {
		return !warnings.isEmpty();
	}
	public ArrayList<String> getErrors( ) {
		return errors;
	}
	public ArrayList<String> getWarnings( ) {
		return warnings;
	}

	public Year checkYear(Year y, Token yt){
		if(y.getNumExams() == 0)
		{
			addError(EMPTY_YEAR_ERROR,yt);
			idYear--;
			return null;
		}
		return y;
	}

	public void checkDegree(Token deg){
		if(d.getYears().isEmpty())
			addError(EMPTY_DEGREE_ERROR,deg);
	}

	public int checkDailyStudyHours(Token studyhours){
		int hhh = Integer.parseInt(studyhours.getText());
		if(hhh > 24 || hhh < 1)
		{
			addWarning(INVALID_STUDYHOURS_RANGE_WARNING, studyhours);
			return 5;
		}

		return hhh;
	}

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

	public void handleError(String[] tokenNames, Token tk, RecognitionException e, String hdr, String msg) {
		// Cominciamo a gestire noi gli errori...
		String coors = "[" + tk.getLine() + ", " + (tk.getCharPositionInLine()+1) + "]";
		if (tk.getType() == GRADLexer.ERROR_TOKEN)
			errors.add("Errore Lessicale in " + coors + ":\t" + msg + "\t" + tk.getText());
		else
			errors.add("Errore Sintattico in " + coors + ":\t" + msg +"\t" + tk.getText());
	}
	// gestore gli errori semantici
	void addError (int errCode, Token tk) {
		String str = tk.getText();
		String coors = "[" + tk.getLine() + ", " + (tk.getCharPositionInLine()+1) + "]";

		String msg = "Errore Semantico in " + coors + ":\t";
		if (errCode == INVALID_DATE_FORMAT_ERROR)
			msg += "Il formato della data '"+str+"' è errato (dev'essere gg-mm-aaaa)";
		else if(errCode == EMPTY_YEAR_ERROR)
			msg += "YEAR non presenta alcun esame valido in elenco";
		else if (errCode == EMPTY_DEGREE_ERROR)
			msg += "DEGREE '"+tk+"' non presenta alcun anno valido in elenco";

		errors.add(msg);
	}

	void addWarning (int warnCode, Token tk) {
		String str = tk.getText();
		String coors = "[" + tk.getLine() + ", " + (tk.getCharPositionInLine()+1) + "]";
		String msg = "Warning in " + coors + ":\t";

		if(warnCode == INVALID_STUDYHOURS_RANGE_WARNING)
			msg += "DAILY_HOURS dev'essere compreso in [1, 24]. Impostato default: 5";
		else if (warnCode == INVALID_DATE_RANGE_WARNING)
			msg += "La data d'appello '"+str+"' supera il range anni consentito ["+LocalDate.now().minusYears(10L).getYear()+", "+LocalDate.now().plusYears(10L).getYear()+"]. Impostato limite più vicino";

		warnings.add (msg);
	}
// ----------------------- fine gestione degli errori

}
