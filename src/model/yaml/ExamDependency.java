package model.yaml;

/**
 * Oggetto che definisce una dipendenza <i>strict</i>/<i>soft</i> per un esame <i>Dependency</i>. In breve, contiene una <i>String</i> col nome dell'esame.
 * <br>Serve principalmente come parte della struttura {@link Dependency} ed è definito in un file YAML sotto le voci <tt>soft_dependencies</tt> o <tt>strict_dependencies</tt> come segue: <br><br>
 * - <tt>exam: </tt> [valore]
 */
public class ExamDependency {
	private String exam;


	/**
	 * Restituisce il nome della dipendenza
	 * @return oggetto <i>String</i>
	 */
	public String getExam() {
		return exam;
	}

	/**
	 * serve a SnakeYAML
	 * @param exam
	 */
	public void setExam(String exam) {
		this.exam = exam;
	}
	
	public String toString() {
		return "ExamDependency [exam=" + exam + "]";
	}
	
}
