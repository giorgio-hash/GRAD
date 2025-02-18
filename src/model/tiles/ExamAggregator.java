package model.tiles;

import model.compiler.Exam;
import model.compiler.Milestone;
import model.compiler.Year;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Classe che riunisce gli <i>ExamTile</i> in un <i>{@link SortedSet}</i> (istanziato come <i>{@link TreeSet}</i>) ordinato secondo <i>{@link DeadlineComparator}</i>.
 * <br><br>
 * Alcuni Tile (quali ad es. YearTile, MilestoneTile) vogliono rappresentare un'aggregazione di più esami.
 * L'oggetto <i>ExamAggregator</i> serve ad aggregare gli esami sotto un certo vincolo (Year, Milestone)
 * mantenendoli ordinati per data d'appello.
 */
public class ExamAggregator {

    private SortedSet<ExamTile> exams; //insieme di esami ordinato per data d'appello

    /**
     * Costruttore ExamAggregator per aggregare gli esami di un certo anno, mantenendo un ordine per data d'appello.
     * @param y oggetto <i>Year</i>
     */
    public ExamAggregator(Year y) {
        exams = new TreeSet<>(new DeadlineComparator());
        for(Exam e : y.getExams().values())
            exams.add(new ExamTile(e));
    }

    /**
     * Costruttore ExamAggregator per aggregare gli esami di una certa Milestone, mantenendo un ordine per data d'appello.
     * @param m oggetto <i>Milestone</i>
     */
    public ExamAggregator(Milestone m) {
        exams = new TreeSet<>(new DeadlineComparator());
        for(Exam e : m.getExams().values())
            exams.add(new ExamTile(e));
    }

    /**
     *
     * @return <i>{@link SortedSet}</i> di elementi <i>{@link ExamTile}</i>
     */
    public SortedSet<ExamTile> getExams() {
        return exams;
    }

}
