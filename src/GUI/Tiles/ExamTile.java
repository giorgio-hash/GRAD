package GUI.Tiles;

import myCompilerPackage.util.Degree;
import myCompilerPackage.util.Exam;

import java.time.LocalDate;

public class ExamTile extends GanttTile{

    private Exam exam;

    public ExamTile(Exam exam){
        super(exam.getAppello(),
                exam.getAppello()
                        .minusDays(exam
                        .getCfu()*25/ Degree.getDegree().getDailyStudyHours()
                        ));
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {

        this.exam = exam;
        super.setStart(exam.getAppello());
        super.setEnd(exam
                .getAppello()
                .minusDays(exam
                        .getCfu()*25/Degree.getDegree().getDailyStudyHours()
                ));
    }
}
