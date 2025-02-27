package model.tiles;

import controller.Degree;
import model.compiler.Exam;
import model.compiler.Milestone;
import model.compiler.Year;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;

import static org.junit.jupiter.api.Assertions.*;

class TilesTest {

    Exam e,e1,e2,e3,e4;
    ExamTile et,et1,et2,et3,et4;

    @BeforeEach
    void setup(){

        e = new Exam("matematica",6, LocalDate.of(2024,1,10));
        e1 = new Exam("geometria",6, LocalDate.of(2024,1,15));
        e3 = new Exam("logica",6, LocalDate.of(2026,1,15));
        e2 = new Exam("fisica",6, LocalDate.of(2025,1,20));
        e4 = new Exam("logistica",6, LocalDate.of(2025,2,20));

        Degree.getDegree().reset();
        Degree.getDegree().setDailyStudyHours(4);
        Year y = new Year(1);
        Year y1 = new Year(2);
        Degree.getDegree().addYear(y);
        Milestone m = new Milestone("mategeome",1);
        e.setMilestone(m.getName());
        m.addExam(e);
        m.addExam(e1);
        y.addExam(e);
        y.addExam(e1);
        y.addExam(e3);
        y1.addExam(e2);
        y1.addExam(e4);
        Degree.getDegree().addExam(e);
        Degree.getDegree().addExam(e1);
        Degree.getDegree().addExam(e2);
        Degree.getDegree().addExam(e3);
        Degree.getDegree().addExam(e4);
        Degree.getDegree().addYear(y);
        Degree.getDegree().addMilestone(m);
        Degree.getDegree().setName("Laurea");
    }

    @Test
    void createExamTile(){
        et = new ExamTile(e);
        LocalDate ldStart = e.getAppello().minusDays(6*25/ 4);
        assertEquals(ldStart,et.getStart());
        assertEquals(e.getAppello(),et.getEnd());
    }


    @Test
    void compare() {

        et = new ExamTile(e);
        et1 = new ExamTile(e1);
        et2 = new ExamTile(e2);
        et3 = new ExamTile(e3);
        et4 = new ExamTile(e4);

        ArrayList<ExamTile> l = new ArrayList<ExamTile>();

        l.add(et);l.add(et1);l.add(et2);l.add(et3);l.add(et4);

        l.sort(new DeadlineComparator());

        assertEquals(et,l.get(0));
        assertEquals(et3,l.get(l.size()-1));


    }

    @Test
    void createYearTile(){

        YearTile y = new YearTile(1);
        assertEquals(y.getYear(),Degree.getDegree().getYears().get(0));
        assertEquals(((ExamTile)y.getExamTiles().toArray()[0]).getExam(),e);
        assertEquals(((ExamTile)y.getExamTiles().toArray()[y.getExamTiles().size()-1]).getExam(),e3);
    }

    @Test
    void createMilestoneTile(){
        MilestoneTile m = new MilestoneTile("mategeome");
        assertEquals(m.getMilestone(),Degree.getDegree().getMilestones().get("mategeome"));
        assertEquals(((ExamTile)m.getExamTiles().toArray()[0]).getExam(),e);
        assertEquals(((ExamTile)m.getExamTiles().toArray()[m.getExamTiles().size()-1]).getExam(),e1);
    }

    @Test
    void testExamAggregatorYear(){
        ExamAggregator ea = new ExamAggregator(Degree.getDegree().getYears().get(0));
        assertEquals(((ExamTile)ea.getExams().toArray()[0]).getExam(),e);
        assertEquals(((ExamTile)ea.getExams().toArray()[ea.getExams().size()-1]).getExam(),e3);
    }

    @Test
    void testExamAggregatorMilestone(){
        ExamAggregator ea = new ExamAggregator(Degree.getDegree().getMilestones().get("mategeome"));
        
        assertEquals(((ExamTile)ea.getExams().toArray()[0]).getExam(),e);
        assertEquals(((ExamTile)ea.getExams().toArray()[ea.getExams().size()-1]).getExam(),e1);
    }
}