package view;

import controller.DependencyManager;
import controller.TileManager;
import model.compiler.Exam;
import model.tiles.*;
import view.utils.TaskRenderer;
import controller.Degree;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.data.category.IntervalCategoryDataset;
import org.jfree.data.gantt.Task;
import org.jfree.data.gantt.TaskSeries;
import org.jfree.data.gantt.TaskSeriesCollection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.List;

/**
 * Specializzazione di {@link JFrame}, si appoggia su <i>{@link JFreeChart}</i> e <i>{@link TileManager}</i> per la realizzazione di un grafico Gantt.
 * Per la realizzazione del Gantt, <i>JFreeChart</i> mette a disposizione delle astrazioni di alto livello:<br>
 * <ul>
 *     <li><i>{@link Task}</i>: permette la creazione di un elemento grafico caratterizzato da nome, data d'inizio, data di fine e (opzionalmente) percentuale di completamento;</li>
 *     <li><i>{@link TaskSeries}</i>: una collezione di Task;</li>
 *     <li><i>{@link TaskSeriesCollection}</i>: una collezione di <i>TaskSeries</i>.</li>
 * </ul>
 * L'ordinamento con cui le <i>Task</i> sono caricate in <i>TaskSeries</i> e con cui quest'ultime sono caricate in <i>TaskSeriesCollection</i> determina l'ordine di renderizzazione grafica (sul piano di Gantt, vengono caricate dall'alto verso il basso).<br>
 * Le specializzazioni di <i>{@link GanttTile}</i> quali <i>YearTile</i>, <i>MilestoneTile</i>, <i>ExamTile</i>, vengono utilizzati per creare delle task "specializzate", ottenendo delle Task che si associano in maniera biunivoca ad un oggetto <i>Year</i>, <i>Milestone</i>, <i>Exam</i>.
 * Sempre basandosi su specializzazione, l'attributo <tt>colormap</tt> viene sfruttato per mappare le task ed associarvi un colore. Il rendering corretto dei colori è delegato a <i>{@link TaskRenderer}.</i><br>
 * In particolare:
 * <ul>
 *     <li>Le task che rappresentano un <i>Exam</i> sono caratterizzate da colore verde(esame passato) o rosso(esame non passato);</li>
 *     <li>Le task che rappresentano un <i>Year</i> sono caratterizzate da colore nero e barra di completamento, di base rossa e con riempimento verde man mano che si completa;</li>
 *     <li>Le task che rappresentano una <i>Milestone</i> sono caratterizzate da colore blu e barra di completamento, di base rossa e con riempimento verde man mano che si completa.</li>
 * </ul>
 * Sono state definite inoltre altre task di aggregazione più particolari, quali:
 * <ul>
 *     <li>La task rappresentante la carriera, caratterizzata da colore grigio e barra di completamento, di base rossa e con riempimento verde man mano che si completa;</li>
 *     <li>La task rappresentante l'insieme dei vincoli strict o soft, caratterizzata da colore blu e barra di completamento, di base rossa e con riempimento verde man mano che si completa.</li>
 * </ul>
 */
public class GanttFrame extends JFrame {

    private TileManager tm;//gestore dei GanttTile
    private TaskSeriesCollection taskseriescollection;//collezione di TaskSeries

    public Map<Integer, Color> colormap;//mappa indiceTask->colore
    private int colorIndex;//generatore incrementale per indice Task nel colormap

    //varaibili d'appoggio
    private double totPassed;
    private double totExams;

    private ChartPanel saved_chartpanel;//si può evitare di ricostruire il chartPanel qualora la finestra grafica fosse già stata generata. A tal scopo, si salva un riferimento all'ultima chartPanel.

    /**
     * Costruttore con titolo per la JFrame
     * @param title titolo <i>String</i>
     */
    public GanttFrame(String title) {
        super(title);

        clean();
        tm = new TileManager();
        saved_chartpanel = null;

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                saved_chartpanel = null;
            }
        });

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }


    /**
     * Genera il grafico per la visualizzazione della TaskSeriesCollection selezionata.
     */
    public void display(){
        IntervalCategoryDataset intervalcategorydataset = taskseriescollection;
        JFreeChart jfreechart = ChartFactory.createGanttChart(Degree.getDegree().getName(), "", "",
                intervalcategorydataset, false, true, false);
        final CategoryPlot plot = (CategoryPlot) jfreechart.getPlot();
        TaskRenderer renderer = new TaskRenderer(colormap); //Renderer personalizzato
        renderer.setMaximumBarWidth(0.05); //massima dimensione delle task
        plot.setRenderer(renderer);

        ChartPanel chartpanel = new ChartPanel(jfreechart);
        if(saved_chartpanel==null){ //se c'è già un chartPanel, non serve rigenerarlo
            chartpanel.setPreferredSize(new Dimension(500, 270));
        }else{
            chartpanel.setPreferredSize(saved_chartpanel.getSize());
        }
        saved_chartpanel = chartpanel;
        setContentPane(chartpanel);
    }

    /**
     * Imposta lo stato del GanttFrame ai valori iniziali.
     */
    public void clean(){
        taskseriescollection = new TaskSeriesCollection();
        colormap = new HashMap<Integer, Color>();
        colorIndex = 0;
        totPassed = 0;
        totExams = 0;
    }

    /**
     * Crea una <i>{@link TaskSeries}</i> per rappresentare graficamente l'intera carriera (istanza di <i>{@link Degree}</i>) e la aggiunge al <i>{@link TaskSeriesCollection}</i>.
     * @throws ParseException generata dal metodo statico <tt>date(int gg, int mm, int aa)</tt> se ci sono problemi col parsing della data (può servire a segnalare malfunzionamenti del codice)
     */
    public void createDegreeTaskCollection() throws ParseException {
        TaskSeries ts = new TaskSeries("Degree");
        Task t = newTask(Degree.getDegree().getName(), tm.getStart(),tm.getEnd());
        ts.add(t);
        addProccesColor(colorIndex++, Color.darkGray);
        taskseriescollection.add(ts);
        for(int i=1; i<=tm.getYearTiles().size(); i++){
            createYearTaskCollection(i);
        }
        t.setPercentComplete(totPassed/totExams);
    }

    /**
     * Crea una <i>{@link TaskSeries}</i> per rappresentare graficamente un anno e la aggiunge al <i>{@link TaskSeriesCollection}</i>.
     * @param year identificativo <i>int</i> per estrarre l'oggetto <i>Year</i> in <i>{@link Degree}</i>
     * @throws ParseException generata dal metodo statico <tt>date(int gg, int mm, int aa)</tt> se ci sono problemi col parsing della data (può servire a segnalare malfunzionamenti del codice)
     */
    public void createYearTaskCollection(int year) throws ParseException {
        taskseriescollection.add(createYearTaskSeries(tm.getYearTiles().get(year-1)));
    }

    /**
     * Crea una <i>{@link TaskSeries}</i> per rappresentare le dipendenze di un esame e la aggiunge al <i>{@link TaskSeriesCollection}</i>.
     * @param exam identificativo <i>String</i> dell'esame
     * @throws ParseException generata dal metodo statico <tt>date(int gg, int mm, int aa)</tt> se ci sono problemi col parsing della data (può servire a segnalare malfunzionamenti del codice)
     */
    public void createDependencyTaskCollection(String exam) throws ParseException {
        taskseriescollection.add(createDependencyTaskSeries(exam));
    }

    /**
     * Crea una <i>{@link TaskSeries}</i> per rappresentare graficamente un anno, comprendendo task anno, task esami e task Milestone al suo interno.
     * @param yt oggetto <i>{@link YearTile}</i>
     * @return serie di task <i>{@link TaskSeries}</i>
     * @throws ParseException generata dal metodo statico <tt>date(int gg, int mm, int aa)</tt> se ci sono problemi col parsing della data (può servire a segnalare malfunzionamenti del codice)
     */
    private TaskSeries createYearTaskSeries(YearTile yt) throws ParseException {

        TaskSeries ts = new TaskSeries("Year " + yt.getYear().getId());
        SortedSet<GanttTile> ea = new TreeSet<GanttTile>(new DeadlineComparator());
        ea.addAll(yt.getExamTiles());
        for(MilestoneTile ms : yt.getMilestoneTiles().values()){
            ea.removeIf(e -> ( e instanceof ExamTile && ((ExamTile) e).getExam().getMilestone() != null && ((ExamTile) e).getExam().getMilestone().equals(ms.getMilestone().getName())));
            ea.add(ms);
        }


        Task yeartask = newTask("------Year " + yt.getYear().getId()+"------", yt.getStart(), yt.getEnd());
        ts.add(yeartask);
        addProccesColor(colorIndex++, Color.black);

        double passed = 0;
        int tot = 0;
        ExamTile e;
        MilestoneTile mt;
        Task t;
        for(GanttTile gt : ea){
            t = null;
            if(gt instanceof ExamTile){
                e = (ExamTile) gt;
                t = newTask(e.getExam().getName(), e.getStart(), e.getEnd());
                passed += registerPassedExam(e);
                ts.add(t);
            }else{
                mt = (MilestoneTile) gt;
                t = createMilestoneTask(mt);
                passed += t.getPercentComplete();
                ts.add(t);
                for(ExamTile et : mt.getExamTiles())
                    ts.add(newTask(et.getExam().getName(), et.getStart(), et.getEnd()));
            }
            tot++;
        }

        totExams += tot;
        totPassed += passed;
        yeartask.setPercentComplete( 0.0D + (passed/tot));

        return ts;
    }

    /**
     * Crea una <i>{@link TaskSeries}</i> per rappresentare le dipendenze di un esame, comprendendo l'esame stesso, milestone per dipendenze soft e/o strict ed esami annessi (di quest'ultimi, vengono effettivamente rappresentati solo quelli che hanno il corrispettivo ogetto <i>{@link Exam}</i> istanziato in <i>{@link Degree}</i>).
     * @param exam nome <i>String</i> dell'esame con dipendenze
     * @return serie di task <i>{@link TaskSeries}</i>
     * @throws ParseException generata dal metodo statico <tt>date(int gg, int mm, int aa)</tt> se ci sono problemi col parsing della data (può servire a segnalare malfunzionamenti del codice)
     */
    private TaskSeries createDependencyTaskSeries(String exam) throws ParseException {

        SortedSet<ExamTile> strictDepsTiles = new TreeSet<ExamTile>(new DeadlineComparator());
        SortedSet<ExamTile> softDepsTiles = new TreeSet<ExamTile>(new DeadlineComparator());

        List<Exam> strictDeps = DependencyManager.getInstance().loadStrictDependencies(Degree.getDegree().getExam(exam));
        List<Exam> softDeps = DependencyManager.getInstance().loadSoftDependencies(Degree.getDegree().getExam(exam));

        boolean strictDepsLoaded = DependencyManager.getInstance().hasStrictDependencyLoaded(Degree.getDegree().getExam(exam));
        boolean softdepsLoaded = DependencyManager.getInstance().hasSoftDependencyLoaded(Degree.getDegree().getExam(exam));

        ExamTile dependency = null;

        TaskSeries ts = new TaskSeries("Propedeutica");

        Task t = null;
        double passed, tot;

        for(int i=0 ; i < tm.getYearTiles().size(); i++)
            for(ExamTile et : tm.getYearTiles().get(i).getExamTiles()){
                if(strictDepsLoaded)
                    if(strictDeps.contains(et.getExam()))
                        strictDepsTiles.add(et);
                if(softdepsLoaded)
                    if(softDeps.contains(et.getExam()))
                        softDepsTiles.add(et);

                if(et.getExam().getName().equals(exam)) {
                    dependency = et;
                    break;
                }
            }


        if(strictDepsLoaded){
            passed = 0;
            tot=0;
            Task strictMilestone = newTask("---Esami propedeutici---",strictDepsTiles.first().getStart(), strictDepsTiles.last().getEnd());
            addProccesColor(colorIndex++, Color.BLUE.brighter());
            ts.add(strictMilestone);
            for(ExamTile e : strictDepsTiles)
            {
                t = newTask(e.getExam().getName(), e.getStart(), e.getEnd());
                passed += registerPassedExam(e);
                tot++;
                ts.add(t);
            }
            strictMilestone.setPercentComplete(passed/tot);
        }

        if(softdepsLoaded){
            passed = 0;
            tot=0;
            Task softMilestone = newTask("---Esami consigliati---",softDepsTiles.first().getStart(), softDepsTiles.last().getEnd());
            addProccesColor(colorIndex++, Color.BLUE.brighter());
            ts.add(softMilestone);
            for(ExamTile e : softDepsTiles)
            {
                t = newTask(e.getExam().getName(), e.getStart(), e.getEnd());
                passed += registerPassedExam(e);
                tot++;
                ts.add(t);
            }
            softMilestone.setPercentComplete(passed/tot);
        }

        t = newTask(dependency.getExam().getName(), dependency.getStart(), dependency.getEnd());
        registerPassedExam(dependency);
        ts.add(t);

        return ts;
    }

    /**
     * Verifica se l'oggetto <i>Exam</i> rappresentato da <i>ExamTile</i> è passato (PASSED) e restituisce un valore pari alla percentuale di completamento dell'esame.
     * <br>Inoltre, sempre in base al superamento dell'esame, aggiorna <tt>examcolor</tt> con indice e colore per la rappresentazione.
     * @param et oggetto <i>ExamTile</i>
     * @return valore <i>double</i> pari a <tt>1</tt> se superato, altrimenti <tt>0</tt>
     */
    private double registerPassedExam(ExamTile et){

        if(et.getExam().isPassed()){
            addProccesColor(colorIndex++, Color.green.darker());
            return 1.0D;
        }

        addProccesColor(colorIndex++, Color.red.darker());
        return 0.0D;
    }

    /**
     * Crea una <i>{@link Task}</i> da associare alla Milestone, aggiorna <tt>colormap</tt> con indice->colore relativo alla task e imposta la percentuale di completamento in base al numero di esami associati alla Milestone che sono stati superati.
     * @param ms oggetto <i>MilestoneTile</i>
     * @return elemento <i>Task</i>
     * @throws ParseException generata dal metodo statico <tt>date(int gg, int mm, int aa)</tt> se ci sono problemi col parsing della data (può servire a segnalare malfunzionamenti del codice)
     */
    private Task createMilestoneTask(MilestoneTile ms) throws ParseException {

        double passed = 0.0D;
        double tot = 0.0D;
        Task mt = newTask("milestone "+ms.getMilestone().getName(), ms.getStart(), ms.getEnd());
        addProccesColor(colorIndex++, Color.BLUE.brighter());

        for(ExamTile e : ms.getExamTiles()){
            passed += registerPassedExam(e);
            tot++;
        }
        mt.setPercentComplete(passed/tot);
        return mt;
    }


    /**
     * Permette la creazione di una <i>{@link Task}</i>.
     * @param name nome <i>String</i> della task
     * @param start data di inizio della task, formato <i>{@link Date}</i>
     * @param end data di fine della task, formato <i>{@link Date}</i>
     * @return oggetto <i>Task</i>
     * @throws ParseException generata dal metodo statico <tt>date(int gg, int mm, int aa)</tt> se ci sono problemi col parsing della data (può servire a segnalare malfunzionamenti del codice)
     */
    private Task newTask(String name, LocalDate start, LocalDate end) throws ParseException {
        return new Task(name, newDate(start), newDate(end));
    }

    /**
     * Effettua il casting di una data da <i>{@link LocalDate}</i> a <i>{@link Date}</i>.
     * @param ld data in formato <i>LocalDate</i>
     * @return data in formato <i>Date</i>
     * @throws ParseException generata dal metodo statico <tt>date(int gg, int mm, int aa)</tt> se ci sono problemi col parsing della data (può servire a segnalare malfunzionamenti del codice)
     */
    private Date newDate(LocalDate ld) throws ParseException {
        String date_string = ld.getDayOfMonth() + "-" + ld.getMonthValue() + "-" + ld.getYear();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = formatter.parse(date_string);
        return date;
    }

    /**
     * Aggiorna <tt>colormap</tt> con indice della task e colore associato
     * @param column <i>int</i> per l'indice della Task
     * @param color oggetto <i>{@link Color}</i> associato
     */
    private void addProccesColor(Integer column, Color color) {
        colormap.put(column, color);
    }

}
