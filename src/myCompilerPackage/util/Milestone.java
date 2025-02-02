package myCompilerPackage.util;

import java.util.ArrayList;

public class Milestone {

	private String name;
	private ArrayList<Exam> exams;
	
	public Milestone (String name) {
		this.name = name;
		this.exams = new ArrayList<Exam>();
	}

	public String getName() {
		return name;
	}

	public ArrayList<Exam> getExams() {
		return exams;
	}
	
	public void addExam(Exam e) {
		exams.add(e);
	}

	
	
	@Override
	public String toString() {
		String s = "Milestone [id=" + name + ", exams=\n";
		for(Exam e : exams)
			s +="\t"+e+";\n";
		return s + "]";
	}
	
	
}
