package model.tiles;

import controller.Degree;
import model.compiler.Exam;

/**
 * Specializzazione del GanttTile su cui si appoggerà la costruzione della Task, nel Gantt, associata ad elemento Exam, di Degree.
 */
public class ExamTile extends GanttTile{

    /**
     * oggetto <i>{@link Exam}</i> associato
     */
    private Exam exam;

    /**
     * Costruttore che computa data di inizio della task basandosi su:
     * <ul>
     *     <li>CFU dell'oggetto <i>Exam</i> (1 CFU = 25 ore);</li>
     *     <li>ore di studio giornaliero definite in  <i>Degree</i>;</li>
     *     <li>data d'appello impostata in <i>Exam</i>.</li>
     * </ul>
     * Quindi
     * <ul>
     *     <li>calcola la data d'inizio facendo <tt>dataAppello-numeroCFU*25/oreStudio</tt>;</li>
     *     <li>tiene dataAppello come data di fine.</li>
     * </ul>
     * @param exam oggetto <i>Exam</i>
     */
    public ExamTile(Exam exam){
        super(exam.getAppello().minusDays(exam.getCfu()*25/ Degree.getDegree().getDailyStudyHours()),
                                exam.getAppello());
        this.exam = exam;
    }

    /**
     *
     * @return oggetto <i>Exam</i> di riferimento
     */
    public Exam getExam() {
        return exam;
    }

}
