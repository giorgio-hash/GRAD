package model.tiles;

import controller.Degree;
import model.compiler.Year;

import java.util.HashMap;
import java.util.Iterator;
import java.util.SortedSet;

public class YearTile extends GanttTile {

    private ExamAggregator exams;
    private HashMap<String, MilestoneTile> milestones;

    private Year year;

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

    public SortedSet<ExamTile> getExamTiles() {
        return exams.getExams();
    }

    public HashMap<String, MilestoneTile> getMilestoneTiles() {
        return milestones;
    }

    public Year getYear(){
        return year;
    }

}
