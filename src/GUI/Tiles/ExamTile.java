package GUI.Tiles;

import myCompilerPackage.util.Degree;
import myCompilerPackage.util.Exam;

import java.time.LocalDate;

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
