package controller;

import model.compiler.Exam;
import model.compiler.Milestone;
import model.compiler.Student;
import model.compiler.Year;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;


/**
 * Classe per la gestione della laurea: esami, anni, milestones e attributi della laurea. Usa il pattern <i>singleton</i>.
 */
public class Degree {
    /**
     * Nome della facoltà di laurea
     */
    private String name;
    /**
     * Lista di oggetti <i>{@link Year}</i> corrispondenti agli anni di laurea
     */
    private List<Year> years;
    /**
     * oggetto <i>{@link Map}</i> per estrarre oggetti <i>{@link Milestone}</i> usando il nome
     */
    private Map<String, Milestone> milestones;
    /**
     * oggetto <i>{@link Map}</i> per estrarre oggetti <i>{@link Exam}</i> usando il nome
     */
    private Map<String, Exam> exams;
    /**
     * Numero orde di studio giornaliero
     */
    private int dailyStudyHours;

    /**
     * Dati aggiuntivi per lo studente (vedi <i>{@link Student}</i>)
     */
    private Student s;

    /**
     * istanza per pattern singleton
     */
    private static Degree d;

    /**
     * Metodo statico che restituisce l'oggetto statico <i>Degree</i> (pattern singleton).
     * @return oggetto <i>Degree</i>
     */
	public static Degree getDegree () {
		if (d == null)
			d = new Degree();
		return d;
	}

    /**
     * Costruttore privato (pattern Singleton)
     */
    private Degree() {
        reset();
    }

    //metodi

    /**
     * Resetta l'oggetto Degree alle impostazioni iniziali
     */
    public void reset(){
        	this.years = new ArrayList<Year>();
            this.milestones = new HashMap<String, Milestone>();
            this.dailyStudyHours = 4; //default
            this.exams = new HashMap<String, Exam>();
    }

    /**
     *
     * @param name nome della laurea
     */
    public void setName(String name) {
    	this.name = name;
    }

    /**
     *
     * @return nome della laurea
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param y oggetto <i>Year</i>
     */
    public void addYear(Year y) {
    	years.add(y);
    }

    /**
     *
     * @return <i>List</i> di elementi <i>Year</i>
     */
    public List<Year> getYears() {
        return years;
    }

    /**
     *
     * @param m  oggetto <i>Milestone</i>
     */
    public void addMilestone(Milestone m) {
    	milestones.put(m.getName(), m);
    }

    /**
     *
     * @return <i>Map</i> con chiave <i>String</i> (nome) in riferimento all'oggetto <i>Milestone</i>
     */
    public Map<String, Milestone> getMilestones() {
        return milestones;
    }

    /**
     *
     * @param e oggetto Exam
     */
    public void addExam(Exam e){
        exams.put(e.getName(), e);
    }

    /**
     *
     * @return <i>Map</i> con chiave <i>String</i> (nome) in riferimento all'oggetto <i>Exam</i>
     */
    public Map<String,Exam> getExams(){
        return exams;
    }

    /**
     *
     * @param examName nome esame
     * @return oggetto Exam corrispondente
     */
    public Exam getExam(String examName){
        return exams.get(examName);
    }

    /**
     *
     * @param examName nome esame
     * @return <tt>true</tt> se l'esame è presente nell'oggetto Degree
     */
    public boolean hasExam(String examName){
        return exams.containsKey(examName);
    }

    /**
     *
     * @return ore medie di studio al giorno, attualmente impostate
     */
	public int getDailyStudyHours() {
		return dailyStudyHours;
	}


    /**
     *
     * @param dailyStudyHours numero di ore di studio giornaliere (tipo <tt>int</tt>)
     */
	public void setDailyStudyHours(int dailyStudyHours) {
		this.dailyStudyHours = dailyStudyHours;
	}

    /**
     *
     * @return oggetto <i>{@link Student}</i>
     */
    public Student getStudent(){
        return s;
    }

    /**
     *
     * @param s oggetto student;
     */
    public void setStudent(Student s){
        this.s=s;
    }


	@Override
	public String toString() {
		String s = "Degree [name=" + name + ", dailyStudyHours="+dailyStudyHours+" , years=\n";
		for(Year y : years)
			s += "\t"+y+";\n";
		s += ", Milestones=\n";
		for(Milestone m : milestones.values())
			s += "\t"+m+";\n";
		return s + "]";
	}
    
    
}
