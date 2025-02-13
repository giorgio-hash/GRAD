package model.compiler;
import java.util.HashMap;
import java.util.Map;

public class Milestone {

	private String name;
	private Map<String, Exam> exams;
	
	public Milestone (String name) {
		this.name = name;
		this.exams = new HashMap<String, Exam>();
	}

	public String getName() {
		return name;
	}

	public Map<String, Exam> getExams() {
		return exams;
	}
	
	public void addExam(Exam e) {
		exams.put(e.getName(), e);
	}

	
	
	@Override
	public String toString() {
		String s = "Milestone [id=" + name + ", exams=\n";
		for(Exam e : exams.values())
			s +="\t"+e+";\n";
		return s + "]";
	}
	
	
}
