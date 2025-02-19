package model.tiles;

import controller.Degree;
import model.compiler.Year;

import java.util.HashMap;
import java.util.Iterator;
import java.util.SortedSet;

/**
 * Specializzazione del <i>GanttTile</i> su cui si appoggerà la costruzione della Task, nel Gantt, associata ad elemento <i>Year</i>, di <i>Degree</i>.
 */
public class YearTile extends GanttTile {

    /**
     * insieme di esami ordinato per data di appello (vedi <i>{@link ExamAggregator}</i>)
     */
    private ExamAggregator exams;
    /**
     * <i>{@link HashMap}</i> con oggetti <i>{@link MilestoneTile}</i> estraibili per nome, ciascuno dei quali contiene almeno un <i>{@link ExamTile}</i> di questo <i>{@link YearTile}</i>
     */
    private HashMap<String, MilestoneTile> milestones;

    /**
     * oggetto <i>{@link Year}</i> di riferimento
     */
    private Year year;

    /**
     * Costruttore che estrae oggetto <i>Year</i> da Degree
     * @param year identificativo anno <i>int</i> da estrarre
     */
    public YearTile(int year){

        this.year = Degree.getDegree().getYears().get(year-1);
        exams = new ExamAggregator(this.year);
        milestones = new HashMap<String, MilestoneTile>();

        // fine anno
        super.setEnd(exams.getExams().last().getEnd());

        // inizio anno
        String mil_name = null;
        ExamTile e = null;
        Iterator<ExamTile> iterator = exams.getExams().iterator();
        while(iterator.hasNext()){
            e = (ExamTile) iterator.next();
            if (super.getStart() == null) {
                super.setStart(e.getStart());
            }else{
                if(super.getStart().isAfter(e.getStart()))
                    super.setStart(e.getStart());
            }

            if(e.getExam().getMilestone() != null ){
                mil_name = e.getExam().getMilestone();
                if (!milestones.containsKey(mil_name))
                    milestones.put(mil_name, new MilestoneTile(mil_name));
            }
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
     * Restituisce mappa nomeMilestone->MilestoneTile
     * @return <i>HashMap</i> con chiave <i>String</i> ed elementi <i>MilestoneTile</i>
     */
    public HashMap<String, MilestoneTile> getMilestoneTiles() {
        return milestones;
    }

    /**
     *
     * @return elemento <i>Year</i> asssociato
     */
    public Year getYear(){
        return year;
    }

}
