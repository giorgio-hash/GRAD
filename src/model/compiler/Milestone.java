package model.compiler;
import java.util.HashMap;
import java.util.Map;

/**
 * Per diverse realtà accademiche, alcuni esami costituiscono modulo complementare con altri esami; tale vincolo può impropriamente formalizzarsi tramite il concetto di Milestone, trasposto dal mondo del Project Management.
 * <br><br>In GRAD, una Milestone definisce un insieme di esami, tipicamente entro lo stesso anno, per cui la registrazione dell'esito è vincolata dal superamento sommario degli esami entro l'insieme di interesse.
 * <br><br>Ad esempio, la Milestone <i>Fisica</i> può servire a definire l'insieme che vincola <i>Fisica 1</i> e <i>Fisica 2</i>, indicando che c'è un vincolo sulla registrazione dell'esito di entrambi i voti.
 * <br><br>Attualmente, GRAD non applica restrizioni che funzionino tramite questo vincolo: una Milestone non può essere dipendenza <tt>strict</tt> per un esame o per un'altra Milestone. Tali logiche sono delegate alla definizione propria di un file YAML per il DependencyMapper.
 */
public class Milestone {

	/**
	 * nome <i>Milestone</i>
	 */
	private String name;
	/**
	 * <i>{@link Map}</i> per estrarre oggetti <i>{@link Exam}</i> in base al loro nome
	 */
	private Map<String, Exam> exams;
	/**
	 *anno di riferimento per la Milestone
	 */
	private int year;

	/**
	 * Costruttore Milestone
	 * @param name nome della Milestone, formato <i>String</i>
	 */
	public Milestone (String name, int year) {
		this.name = name;
		this.exams = new HashMap<String, Exam>();
		this.year = year;
	}

	/**
	 * Restituisce il nome della Milestone.
	 * @return elemento <i>String</i>
	 */
	public String getName() {
		return name;
	}

	/**
	 * Restituisce la <i>Map</i> nomeEsame->esame associata a questa Milestone.
	 * @return <i>Map</i> con chiavi <i>String</i> ed oggetti <i>Exam</i>
	 */
	public Map<String, Exam> getExams() {
		return exams;
	}

	/**
	 * Aggiunge un <i>Exam</i> alla Milestone.
	 */
	public void addExam(Exam e) {
		exams.put(e.getName(), e);
	}

	/**
	 * @return anno a cui la Milestone appartiene
	 */
	public int getYear(){
		return year;
	}

	@Override
	public String toString() {
		String s = "Milestone [id=" + name + ", exams=\n";
		for(Exam e : exams.values())
			s +="\t"+e+";\n";
		return s + "]";
	}
	
	
}
