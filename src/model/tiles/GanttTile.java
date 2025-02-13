package model.tiles;

import java.time.LocalDate;

public class GanttTile {

    private LocalDate start;
    private LocalDate end;

    protected GanttTile(LocalDate start, LocalDate end){
        this.start = start;
        this.end = end;
    }

    protected GanttTile(){
        this.start=null;
        this.end=null;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

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
