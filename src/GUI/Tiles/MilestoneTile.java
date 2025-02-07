package GUI.Tiles;

import myCompilerPackage.util.Degree;

import java.time.LocalDate;
import java.util.Iterator;

public class MilestoneTile extends GanttTile{
    private ExamAggregator exams;

    public MilestoneTile(String milestone){

        exams = new ExamAggregator(Degree.getDegree().getMilestones().get(milestone));
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

    public ExamAggregator getExams() {
        return exams;
    }

    public void setExams(ExamAggregator exams) {
        this.exams = exams;
    }
}
