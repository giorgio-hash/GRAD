package myCompilerPackage.util;

import java.util.HashMap;
import java.util.Map;

public class Year {
    private int id; // ID progressivo dell'anno
    //private int numExams; // Numero di esami nell'anno
    private Map<String, Exam> exams; // Lista di esami associati all'anno

    private static int idgen=1;
    
    public Year() {
        this.id = idgen++;
        //this.numExams = 0; // Numero di esami impostato inizialmente a zero
        this.exams = new HashMap<String, Exam>();
    }

    public int getId() {
        return id;
    }

    public int getNumExams() {
        return exams.keySet().size();
    }
    
    public void addExam(Exam exam) {
        exams.put(exam.getName(), exam);
    }

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
