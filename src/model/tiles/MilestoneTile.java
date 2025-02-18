package model.tiles;

import controller.Degree;
import model.compiler.Milestone;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.SortedSet;

/**
 * Specializzazione del <i>GanttTile</i> su cui si appoggerà la costruzione della Task, nel Gantt, associata ad elemento <i>Milestone</i>, di <i>Degree</i>.
 */
public class MilestoneTile extends GanttTile{
    private ExamAggregator exams;//insieme di esami ordinato per data di appello

    private Milestone ms;//milestone associata

    /**
     * Costruttore che estrae la Milestone di riferimento sfruttando <i>Degree</i>
     * @param milestone nome della Milestone di riferimento
     */
    public MilestoneTile(String milestone){

        ms = Degree.getDegree().getMilestones().get(milestone);
        exams = new ExamAggregator(ms);

        //fine anno
        super.setEnd(exams.getExams().last().getEnd());

        //inizio anno
        Iterator<ExamTile> iterator = exams.getExams().iterator();
        LocalDate start;
        while(iterator.hasNext()){
            if (super.getStart() == null) {
                super.setStart(iterator.next().getStart());
                continue;
            }
            start = iterator.next().getStart();
            if(super.getStart().isAfter(start))
                super.setStart(start);
        }
    }

    /**
     *
     * @return <i>{@link SortedSet}</i> di elementi <i>{@link ExamTile}</i>
     */
    public SortedSet<ExamTile> getExamTiles() {
        return exams.getExams();
    }

    /**
     *
     * @return oggetto <i>Milestone</i> asssociato
     */
    public Milestone getMilestone(){
        return ms;
    }

}
