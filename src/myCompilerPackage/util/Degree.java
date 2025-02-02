package myCompilerPackage.util;

import java.util.ArrayList;
import java.util.List;

import myCompilerPackage.SemanticHandler;

public class Degree {
    private String name; // Nome scelto dall'utente
    //private int numYears; // Numero di anni (obbligatorio)
    private List<Year> years; // Lista degli anni associati al progetto
    
    private static Degree d;
    private ArrayList<Milestone> milestones; // solo prototipo, sarebbe meglio usare un hashmap.

	public static Degree getDegree () {
		if (d == null)
			d = new Degree();
		return d;
	}
    
    
    
    
    public Degree() {
        this.years = new ArrayList<Year>();
        this.milestones = new ArrayList<Milestone>();
        //for (int i = 1; i <= numYears; i++) {
            //years.add(new Year(i)); // Crea gli anni automaticamente con ID progressivi
        //}
    }

    
    public void setName(String name) {
    	this.name = name;
    }
    
    public String getName() {
        return name;
    }

    /*
    public int getNumYears() {
        return numYears;
    }
    */
    
    public void addYear(Year y) {
    	years.add(y);
    }

    public List<Year> getYears() {
        return years;
    }

    public void addMilestone(Milestone m) {
    	milestones.add(m);
    }

    public List<Milestone> getMilestones() {
        return milestones;
    }
    
    
	@Override
	public String toString() {
		String s = "Degree [name=" + name + ", years=\n";
		for(Year y : years)
			s += "\t"+y+";\n";
		s += ", Milestones=\n";
		for(Milestone m : milestones)
			s += "\t"+m+";\n";
		return s + "]";
	}
    
    
}
