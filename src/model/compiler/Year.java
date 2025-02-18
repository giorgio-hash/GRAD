package model.compiler;

import java.util.HashMap;
import java.util.Map;

/**
 * insieme di esami (oggetti {@link Exam}) entro un certo anno.
 */
public class Year {
    private int id; // ID progressivo dell'anno
    private Map<String, Exam> exams; // Lista di esami associati all'anno


    /**
     * Costruttore con identificativo di tipo <i>int</i> in input.
     * @param id identificativo <i>int</i>
     */
    public Year(int id) {
        this.id = id;
        //this.numExams = 0; // Numero di esami impostato inizialmente a zero
        this.exams = new HashMap<String, Exam>();
    }

    /**
     *
     * @return identificativo <i>int</i>
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return numero <i>int</i> di esami contenuti nell'anno
     */
    public int getNumExams() {
        return exams.keySet().size();
    }

    /**
     * Aggiunge un esame alla lista esami dell'anno
     * @param exam elemento <i>Exam</i>
     */
    public void addExam(Exam exam) {
        exams.put(exam.getName(), exam);
    }

    /**
     * Restisuisce la mappa nomeEsame->esame per l'anno
     * @return <i>Map</i> con chiavi <i>String</i> e valori <i>Exam</i>
     */
    public Map<String, Exam> getExams() {
        return exams;
    }


	@Override
	public String toString() {
		String s = "Year [id=" + id + ", exams=\n";
		for(Exam e : exams.values())
			s +="\t"+e+";\n";
		return s + "]";
	}
    
    
}
