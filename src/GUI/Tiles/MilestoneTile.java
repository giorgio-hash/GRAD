package GUI.Tiles;

import myCompilerPackage.util.Degree;
import myCompilerPackage.util.Milestone;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.SortedSet;

public class MilestoneTile extends GanttTile{
    private ExamAggregator exams;

    private Milestone ms;

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

    public SortedSet<ExamTile> getExamTiles() {
        return exams.getExams();
    }

    public Milestone getMilestone(){
        return ms;
    }

}
