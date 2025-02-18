package model.compiler;

import java.time.LocalDate;

/**
 * Mappa un oggetto EXAM definito nel file con estensione ".GRAD".
 */
public class Exam {
    private String name; // Nome dell'esame
    private int cfu; // Numero di crediti associati all'esame
    private LocalDate appello; // Data dell'appello
    private Status status; // Stato dell'esame: PASSED / NOT_PASSED
    private String milestone;//milestone di riferimento. default: null


    /**
     * Costruttore oggetto EXAM.
     * @param name nome (unico) esame, formato <i>String</i>
     * @param cfu crediti CFU, formato <i>int</i>
     * @param appello data dell'appello, formato <i>{@link LocalDate}</i>
     */
    public Exam(String name, int cfu, LocalDate appello) {
        this.name = name;
        this.cfu = cfu;
        this.appello = appello;
        this.status = Status.NOT_PASSED; // Stato di default
        this.milestone = null;
    }

    /**
     * Restituisce nome esame
     * @return oggetto <i>String</i>
     */
    public String getName() {
        return name;
    }

    /**
     * @return numero <i>int</i> di CFU
     */
    public int getCfu() {
        return cfu;
    }

    /**
     * @return data dell'appello, formato <i>{@link LocalDate}</i>
     */
    public LocalDate getAppello() {
        return appello;
    }

    /**
     *
     * @return stato esame (passato/non passato) in formato {@link Status}
     */
    public String getStatus() {
        return status.toString();
    }

    /**
     * imposta stato esame (vedi {@link Status}):
     * <ul>
     *     <li>PASSED se in input "PASSED"</li>
     *     <li>NOT_PASSED per qualsiasi altro valore</li>
     * </ul>
     * @param status parametro <i>String</i>
     */
    public void setStatus(String status) {
        this.status = Status.valueOf(status);
    }

    /**
     * Verifica se stato esame è PASSED (vedi {@link Status})
     * @return <tt>true</tt> se condizione verificata, <tt>false</tt> altrimenti
     */
    public boolean isPassed() {
    	return this.status == Status.PASSED;
    }

    /**
     * vedi {@link Milestone}.
     * @return il nome <i>String</i> della Milestone di cui l'esame fa parte, <tt>null</tt> se non definita
     */
    public String getMilestone() {
        return milestone;
    }

    /**
     * vedi {@link Milestone}.
     * Imposta il nome della Milestone a cui l'esame si associa.
     * @param milestone nome Milestone <i>String</i>
     */
    public void setMilestone(String milestone) {
        this.milestone = milestone;
    }


	@Override
	public String toString() {

		return "\t Exam [name=" + name + ", cfu=" + cfu + ", appello=" + appello + ", status=" + status + ", milestone="
				+ milestone + "]";
	}

}

