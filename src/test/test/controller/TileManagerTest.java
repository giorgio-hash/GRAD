package controller;

import model.compiler.Exam;
import model.compiler.Milestone;
import model.compiler.Year;
import model.tiles.ExamTile;
import model.tiles.YearTile;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TileManagerTest {

    Exam e,e1,e2,e3,e4;

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
    void getYearTiles() {
        ArrayList<YearTile> yt = new ArrayList<YearTile>();
        yt.add(new YearTile(1));yt.add(new YearTile(2));
        TileManager tm = new TileManager();

        assertEquals(tm.getStart(),yt.get(0).getStart());
        assertEquals(tm.getEnd(),yt.get(1).getEnd());
    }
}