package myCompilerPackage.util;

import java.time.LocalDate;
import java.util.Comparator;

public class Exam {
    private String name; // Nome dell'esame
    private int cfu; // Numero di crediti associati all'esame
    private LocalDate appello; // Data dell'appello
    private Status status; // Stato dell'esame: PASSED / NOT_PASSED
    private String milestone;//milestone di riferimento. default: null
    
    //private HashMap<Exam> isBefore;
    //private HashMap<Exam> isAfter;

    public Exam(String name, int cfu, LocalDate appello) {
        this.name = name;
        this.cfu = cfu;
        this.appello = appello;
        this.status = Status.NOT_PASSED; // Stato di default
        this.milestone = null;
    }
    

    public String getName() {
        return name;
    }

    public int getCfu() {
        return cfu;
    }

    public LocalDate getAppello() {
        return appello;
    }

    public String getStatus() {
        return status.toString();
    }

    public void setStatus(String status) {
        this.status = Status.valueOf(status);
    }

    public boolean isPassed() {
    	return this.status == Status.PASSED;
    }

    public String getMilestone() {
        return milestone;
    }

    public void setMilestone(String milestone) {
        this.milestone = milestone;
    }


	@Override
	public String toString() {

		return "\t Exam [name=" + name + ", cfu=" + cfu + ", appello=" + appello + ", status=" + status + ", milestone="
				+ milestone + "]";
	}

}

