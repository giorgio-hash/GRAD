package controller;

import model.compiler.Exam;
import model.compiler.Milestone;
import model.compiler.Year;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DependencyManagerTest {

    @BeforeEach
    void setup(){
        Year y = new Year(1);
        Year y1 = new Year(2);
        Exam e = new Exam("matematica",6, LocalDate.of(2024,1,15));
        Exam e1 = new Exam("geometria",6, LocalDate.of(2024,1,15));
        Exam e3 = new Exam("logica",6, LocalDate.of(2024,1,15));
        Exam e2 = new Exam("fisica",6, LocalDate.of(2024,1,20));
        Exam e4 = new Exam("logistica",6, LocalDate.of(2024,1,20));
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

        DependencyManager.getInstance().loadYAML();
    }

    @Test
    void hasDependencyMapper() {
        assertTrue(DependencyManager.getInstance().hasDependencyMapper());
    }

    @Test
    void getDependency() {
        assertNotNull(DependencyManager.getInstance().getDependency(Degree.getDegree().getExam("fisica")));
    }

    @Test
    void hasDependency() {
        assertTrue(DependencyManager.getInstance().hasDependency(Degree.getDegree().getExam("fisica")));
        assertFalse(DependencyManager.getInstance().hasDependency(Degree.getDegree().getExam("matematica")));
    }

    @Test
    void hasDependencies() {
        assertTrue(DependencyManager.getInstance().hasDependencies());
    }

    @Test
    void hasAnyDependencyLoaded() {
        assertTrue(DependencyManager.getInstance().hasAnyDependencyLoaded());
    }

    @Test
    void hasDependencyLoaded() {
        assertTrue(DependencyManager.getInstance().hasDependencyLoaded(Degree.getDegree().getExam("fisica")));
        assertFalse(DependencyManager.getInstance().hasDependencyLoaded(Degree.getDegree().getExam("matematica")));
    }

    @Test
    void hasSoftDependencies() {
        assertTrue(DependencyManager.getInstance().hasSoftDependencies(Degree.getDegree().getExam("fisica")));
        assertFalse(DependencyManager.getInstance().hasSoftDependencies(Degree.getDegree().getExam("matematica")));
    }

    @Test
    void hasSoftDependencyLoaded() {
        assertTrue(DependencyManager.getInstance().hasSoftDependencyLoaded(Degree.getDegree().getExam("fisica")));
        assertFalse(DependencyManager.getInstance().hasSoftDependencyLoaded(Degree.getDegree().getExam("matematica")));
        assertFalse(DependencyManager.getInstance().hasSoftDependencyLoaded(Degree.getDegree().getExam("logistica")));
    }

    @Test
    void hasStrictDependencies() {
        assertTrue(DependencyManager.getInstance().hasStrictDependencies(Degree.getDegree().getExam("fisica")));
        assertFalse(DependencyManager.getInstance().hasStrictDependencies(Degree.getDegree().getExam("matematica")));
        assertTrue(DependencyManager.getInstance().hasStrictDependencies(Degree.getDegree().getExam("logistica")));
    }

    @Test
    void hasStrictDependencyLoaded() {
        assertTrue(DependencyManager.getInstance().hasStrictDependencyLoaded(Degree.getDegree().getExam("fisica")));
        assertFalse(DependencyManager.getInstance().hasStrictDependencyLoaded(Degree.getDegree().getExam("matematica")));
        assertFalse(DependencyManager.getInstance().hasStrictDependencyLoaded(Degree.getDegree().getExam("logistica")));
    }

    @Test
    void getExamsWithDependencies() {
        List<Exam> exams = new ArrayList<Exam>();
        exams.add(Degree.getDegree().getExam("fisica"));
        assertIterableEquals(exams,DependencyManager.getInstance().getExamsWithDependencies());
    }

    @Test
    void loadSoftDependencies() {
        List<Exam> exams = new ArrayList<Exam>();
        exams.add(Degree.getDegree().getExam("logica"));
        assertIterableEquals(exams,DependencyManager.getInstance().loadSoftDependencies(Degree.getDegree().getExam("fisica")));
        assertIterableEquals(List.of(),DependencyManager.getInstance().loadSoftDependencies(Degree.getDegree().getExam("logistica")));
    }

    @Test
    void loadStrictDependencies() {
        List<Exam> exams = new ArrayList<Exam>();
        exams.add(Degree.getDegree().getExam("matematica"));
        exams.add(Degree.getDegree().getExam("geometria"));
        assertIterableEquals(exams,DependencyManager.getInstance().loadStrictDependencies(Degree.getDegree().getExam("fisica")));
        assertIterableEquals(List.of(),DependencyManager.getInstance().loadStrictDependencies(Degree.getDegree().getExam("logistica")));
    }
}