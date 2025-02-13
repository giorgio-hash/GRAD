package model.tiles;

import controller.Degree;
import model.compiler.Exam;

public class ExamTile extends GanttTile{

    private Exam exam;

    public ExamTile(Exam exam){
        super(exam.getAppello().minusDays(exam.getCfu()*25/ Degree.getDegree().getDailyStudyHours()),
                                exam.getAppello());
        this.exam = exam;
    }

    public Exam getExam() {
        return exam;
    }

}
