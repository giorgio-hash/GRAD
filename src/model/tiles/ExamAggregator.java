package model.tiles;

import model.compiler.Exam;
import model.compiler.Milestone;
import model.compiler.Year;

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

}
