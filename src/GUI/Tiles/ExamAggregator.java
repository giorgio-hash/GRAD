package GUI.Tiles;

import myCompilerPackage.util.Degree;
import myCompilerPackage.util.Exam;
import myCompilerPackage.util.Milestone;
import myCompilerPackage.util.Year;

import java.util.SortedSet;
import java.util.TreeSet;

public class ExamAggregator {

    private SortedSet<ExamTile> exams;

    public ExamAggregator(Year y) {
        exams = new TreeSet<>(new DeadlineComparator());
        for(Exam e : y.getExams().values())
            exams.add(new ExamTile(e));
    }

    public ExamAggregator(Milestone m) {
        exams = new TreeSet<>(new DeadlineComparator());
        for(Exam e : m.getExams().values())
            exams.add(new ExamTile(e));
    }

    public SortedSet<ExamTile> getExams() {
        return exams;
    }

    public void setExams(SortedSet<ExamTile> exams) {
        this.exams = exams;
    }
}
