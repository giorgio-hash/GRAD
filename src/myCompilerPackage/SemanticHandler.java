package myCompilerPackage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.antlr.runtime.Token;
import myCompilerPackage.util.*;

public class SemanticHandler {
	
	private static SemanticHandler h;

	private Degree d; //potremmo usare singleton anche su Degree
	
	
	private SemanticHandler() {
		d = null;
	}

	public static SemanticHandler getHandler () {
		if (h == null)
			h = new SemanticHandler();
		return h;
	}
	
	public void createDegree(Token name) {
		
		String n = name.getText();
		d = Degree.getDegree();
		d.setName(n);
	}
	
	public Year createYear(Token id) {
		
		int i = Integer.parseInt(id.getText());
		
		return new Year(i);
	}
	
	
	public void addYear(Year y) {
		d.addYear(y);
	}
	
	
	public Exam createExam(Token name, Token cfu, Token stringdate) {
		
		String n = name.getText();
		int c = Integer.parseInt(cfu.getText());
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate s = LocalDate.parse(stringdate.getText(), dtf);
		
		return new Exam(n,c,s);
	}
	
	public void setExamStatus(Exam e, Token status) {
		
		//se l'esame è "passato", qui si effettuano dei controlli per valutare se LocalDate.now() è dopo la data dell'esame 
		e.setStatus(status.getText());
	
	}
	
	public void assignExamToMilestone(Exam e, Token milestone) {
		
		String mil = milestone.getText();
		boolean found = false;
		e.setMilestone(mil);
		
		for(Milestone m : d.getMilestones()) {
			if(m.getName().equals(mil))
			{
				found = true;
				m.addExam(e);
				break;
			}
		}
		
		if(!found)
			createMilestone(mil).addExam(e);		
	}
	
	
	public Milestone createMilestone(String milestone) {
		Milestone m = new Milestone(milestone);
		d.addMilestone(m);
		return m;
	}

}
