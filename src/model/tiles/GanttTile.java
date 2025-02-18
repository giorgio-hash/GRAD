package model.tiles;

import java.time.LocalDate;

/**
 * Elemento padre per tutti i <i>Tile</i> destinati alla realizzazione grafica delle Task nel Gantt.
 * <br>Definisce, in sostanza, data di inizio e di fine di una generica task.
 * <br>In base al tipo di task, sono state realizzate le dovute specializzazioni del GanttTile:<br><br>
 *  <i>GanttTile</i><br>
 *  &nbsp;&nbsp;&#9492;&#9472;<i>{@link YearTile}</i><br>
 *  &nbsp;&nbsp;&#9492;&#9472;<i>{@link MilestoneTile}</i><br>
 *  &nbsp;&nbsp;&#9492;&#9472;<i>{@link ExamTile}</i><br>
 */
public abstract class GanttTile {

    private LocalDate start; //data inizio
    private LocalDate end; //data fine

    /**
     * Costruttore GanttTile
     * @param start data inizio di tipo <i>{@link LocalDate}</i>
     * @param end data fine di tipo <i>{@link LocalDate}</i>
     */
    protected GanttTile(LocalDate start, LocalDate end){
        this.start = start;
        this.end = end;
    }

    /**
     * Costruttore vuoto GanttTile
     */
    protected GanttTile(){
        this.start=null;
        this.end=null;
    }

    /**
     *
     * @return data di inizio in formato <i>{@link LocalDate}</i>
     */
    public LocalDate getStart() {
        return start;
    }

    /**
     *
     * @param start data di inizio in formato <i>{@link LocalDate}</i>
     */
    public void setStart(LocalDate start) {
        this.start = start;
    }

    /**
     *
     * @return data di fine in formato <i>{@link LocalDate}</i>
     */
    public LocalDate getEnd() {
        return end;
    }

    /**
     *
     * @param end data di inizio in formato <i>{@link LocalDate}</i>
     */
    public void setEnd(LocalDate end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "GanttTile{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
