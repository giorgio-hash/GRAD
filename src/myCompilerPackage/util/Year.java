package myCompilerPackage.util;

import java.util.ArrayList;
import java.util.List;

public class Year {
    private int id; // ID progressivo dell'anno
    //private int numExams; // Numero di esami nell'anno
    private List<Exam> exams; // Lista di esami associati all'anno

    public Year(int id) {
        this.id = id;
        //this.numExams = 0; // Numero di esami impostato inizialmente a zero
        this.exams = new ArrayList<Exam>();
    }

    public int getId() {
        return id;
    }

    //public int getNumExams() {
      //  return numExams;
    //}
    public void addExam(Exam exam) {
        exams.add(exam);
    }

    public List<Exam> getExams() {
        return exams;
    }

	@Override
	public String toString() {
		String s = "Year [id=" + id + ", exams=\n";
		for(Exam e : exams)
			s +="\t"+e+";\n";
		return s + "]";
	}
    
    
}
