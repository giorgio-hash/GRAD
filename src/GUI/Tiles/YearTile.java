package GUI.Tiles;

import myCompilerPackage.util.Degree;
import myCompilerPackage.util.Exam;
import myCompilerPackage.util.Milestone;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class YearTile extends GanttTile {

    private ExamAggregator exams;

    private HashMap<String, MilestoneTile> milestones;

    public YearTile(int year){

        exams = new ExamAggregator(Degree.getDegree().getYears().get(year));
        milestones = new HashMap<String, MilestoneTile>();

        String mil_name = null;
        MilestoneTile mt = null;
        ExamTile e = null;
        Iterator<ExamTile> iterator = exams.getExams().iterator();
        while(iterator.hasNext()){
            e = iterator.next();
            if (super.getStart() == null) {
                super.setStart(e.getStart());
            }else{
                if(super.getStart().isAfter(e.getStart()))
                    super.setStart(e.getStart());
            }

            if(e.getExam().getMilestone() != null){
                mil_name = e.getExam().getMilestone();
                mt = new MilestoneTile(mil_name);
                exams.getExams().removeAll(mt.getExams().getExams());
                milestones.put(mil_name, mt);
            }
        }
    }

    public ExamAggregator getExamsWithoutMilestone(){
        return exams;
    }

    public SortedSet<ExamTile> getAllExams(){
        SortedSet<ExamTile> allExams = new TreeSet<>(new DeadlineComparator());
        allExams.addAll(exams.getExams());
        for(MilestoneTile mt : milestones.values()){
            allExams.addAll(mt.getExams().getExams());
        }
        return allExams;
    }

}
