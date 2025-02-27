package controller;

import model.compiler.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DegreeTest {

    @BeforeEach
    void setUp() {
        Degree.getDegree().reset();
        Degree.getDegree().setName("Laurea Magistrale");
    }

    @Test
    void getDegree() {
        assertNotNull(Degree.getDegree());
        assertTrue(Degree.getDegree().getExams().isEmpty());
        assertTrue(Degree.getDegree().getMilestones().isEmpty());
        assertTrue(Degree.getDegree().getYears().isEmpty());
        assertEquals(Degree.getDegree().getName(),"Laurea Magistrale");
        assertNull(Degree.getDegree().getStudent());
    }

    @Test
    void reset() {
        Degree.getDegree().reset();
        assertNotNull(Degree.getDegree());
        assertTrue(Degree.getDegree().getExams().isEmpty());
        assertTrue(Degree.getDegree().getMilestones().isEmpty());
        assertTrue(Degree.getDegree().getYears().isEmpty());
        assertEquals(Degree.getDegree().getName(),"");
        assertNull(Degree.getDegree().getStudent());
    }

    @Test
    void addYear() {
        Year y = new Year(1);
        Exam e = new Exam("matematica",6, LocalDate.of(2024,1,15));
        y.addExam(e);
        Degree.getDegree().addYear(y);
        assertFalse(Degree.getDegree().getYears().isEmpty());
        assertFalse(Degree.getDegree().hasExam("matematica"));
        Degree.getDegree().addExam(e);
        assertTrue(Degree.getDegree().hasExam("matematica"));
        assertTrue(Degree.getDegree().hasAnyExam());
        assertInstanceOf(Year.class,Degree.getDegree().getYears().get(0));
    }

    @Test
    void addMilestone() {
        Year y = new Year(1);
        Exam e = new Exam("matematica",6, LocalDate.of(2024,1,15));
        Milestone m = new Milestone("mategeome",1);
        e.setMilestone(m.getName());
        m.addExam(e);
        y.addExam(e);
        Degree.getDegree().addYear(y);
        Degree.getDegree().addMilestone(m);
        assertInstanceOf(Milestone.class,Degree.getDegree().getMilestones().get("mategeome"));
        assertEquals(Degree.getDegree().getYears().get(0).getExams().get("matematica").getMilestone(),Degree.getDegree().getMilestones().get("mategeome").getName());
        assertEquals(Degree.getDegree().getYears().get(0).getExams().get("matematica"),Degree.getDegree().getMilestones().get("mategeome").getExams().get("matematica"));
    }

    @Test
    void addExam() {
        Year y = new Year(1);
        Exam e = new Exam("matematica",6, LocalDate.of(2024,1,15));
        Milestone m = new Milestone("mategeome",1);
        e.setMilestone(m.getName());
        m.addExam(e);
        y.addExam(e);
        Degree.getDegree().addExam(e);
        Degree.getDegree().addYear(y);
        Degree.getDegree().addMilestone(m);
        assertNotNull(Degree.getDegree().getExam("matematica"));
        assertNotNull(Degree.getDegree().getYears().get(0).getExams().get("matematica"));
        assertNotNull(Degree.getDegree().getMilestones().get("mategeome").getExams().get("matematica"));
        assertEquals(Degree.getDegree().getExam("matematica"),Degree.getDegree().getYears().get(0).getExams().get("matematica"));
        assertEquals(Degree.getDegree().getYears().get(0).getExams().get("matematica"), Degree.getDegree().getMilestones().get("mategeome").getExams().get("matematica"));
    }


    @Test
    void hasExam() {
        Year y = new Year(1);
        Exam e = new Exam("matematica",6, LocalDate.of(2024,1,15));
        Milestone m = new Milestone("mategeome",1);
        e.setMilestone(m.getName());
        m.addExam(e);
        y.addExam(e);
        Degree.getDegree().addYear(y);
        assertFalse(Degree.getDegree().hasExam("matematica"));
        Degree.getDegree().addExam(e);
        assertTrue(Degree.getDegree().hasExam("matematica"));
    }

    @Test
    void hasAnyExam() {
        Year y = new Year(1);
        Exam e = new Exam("matematica",6, LocalDate.of(2024,1,15));
        Milestone m = new Milestone("mategeome",1);
        e.setMilestone(m.getName());
        m.addExam(e);
        y.addExam(e);
        Degree.getDegree().addExam(e);
        Degree.getDegree().addYear(y);
        assertTrue(Degree.getDegree().hasAnyExam());
    }

    @Test
    void hasStudent() {
        Student s = new Student("giacomo","pelosi","123456",LocalDate.of(2000,1,15),"boh@example.it",new University("Stanford",new Address("strada",1,"0000","Stanford","USA")));
        Degree.getDegree().setStudent(s);
        assertTrue(Degree.getDegree().hasStudent());
    }
}