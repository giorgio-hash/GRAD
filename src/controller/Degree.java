package controller;

import model.compiler.Exam;
import model.compiler.Milestone;
import model.compiler.Year;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;


public class Degree {
    private String name; // Nome scelto dall'utente
    private List<Year> years; // Lista degli anni associati al progetto
    private Map<String, Milestone> milestones; // solo prototipo, sarebbe meglio usare un hashmap.
    private Map<String, Exam> exams;
    private int dailyStudyHours;
    
    private static Degree d;
    

	public static Degree getDegree () {
		if (d == null)
			d = new Degree();
		return d;
	}
    
    
    
    
    private Degree() {
        reset();
    }

    public void reset(){
        	this.years = new ArrayList<Year>();
            this.milestones = new HashMap<String, Milestone>();
            this.dailyStudyHours = 4; //default
            this.exams = new HashMap<String, Exam>();
    }

    public void setName(String name) {
    	this.name = name;
    }
    
    public String getName() {
        return name;
    }

    
    public void addYear(Year y) {
    	years.add(y);
    }

    public List<Year> getYears() {
        return years;
    }

    public void addMilestone(Milestone m) {
    	milestones.put(m.getName(), m);
    }

    public Map<String, Milestone> getMilestones() {
        return milestones;
    }
    
    public int getNumOfMilestones() {
    	return milestones.values().size();
    }
    
    public void addExam(Exam e){
        exams.put(e.getName(), e);
    }

    public Map<String,Exam> getExams(){
        return exams;
    }
    
	public int getDailyStudyHours() {
		return dailyStudyHours;
	}




	public void setDailyStudyHours(int dailyStudyHours) {
		this.dailyStudyHours = dailyStudyHours;
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
