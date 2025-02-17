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

public class GanttFrame extends JFrame {

    private TileManager tm;
    private TaskSeriesCollection taskseriescollection;

    public Map<Integer, Color> colormap;
    private int colorIndex;

    private double totPassed;
    private double totExams;

    private ChartPanel saved_chartpanel;

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


    public void display(){
        IntervalCategoryDataset intervalcategorydataset = taskseriescollection;
        JFreeChart jfreechart = ChartFactory.createGanttChart(Degree.getDegree().getName(), "", "",
                intervalcategorydataset, false, true, false);
        final CategoryPlot plot = (CategoryPlot) jfreechart.getPlot();
        TaskRenderer renderer = new TaskRenderer(colormap);
        renderer.setMaximumBarWidth(0.05);
        plot.setRenderer(renderer);

        ChartPanel chartpanel = new ChartPanel(jfreechart);
        if(saved_chartpanel==null){
            chartpanel.setPreferredSize(new Dimension(500, 270));
        }else{
            chartpanel.setPreferredSize(saved_chartpanel.getSize());
        }
        saved_chartpanel = chartpanel;
        setContentPane(chartpanel);
    }

    public void clean(){
        taskseriescollection = new TaskSeriesCollection();
        colormap = new HashMap<Integer, Color>();
        colorIndex = 0;
        totPassed = 0;
        totExams = 0;
    }

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

    public void createYearTaskCollection(int year) throws ParseException {
        taskseriescollection.add(createYearTaskSeries(tm.getYearTiles().get(year-1)));
    }

    public void createDependencyTaskCollection(String exam) throws ParseException {
        taskseriescollection.add(createDependencyTaskSeries(exam));
    }

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

    private double registerPassedExam(ExamTile et){

        if(et.getExam().isPassed()){
            addProccesColor(colorIndex++, Color.green.darker());
            return 1.0D;
        }

        addProccesColor(colorIndex++, Color.red.darker());
        return 0.0D;
    }
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


    private Task newTask(String name, LocalDate start, LocalDate end) throws ParseException {
        return new Task(name, newDate(start), newDate(end));
    }
    private Date newDate(LocalDate ld) throws ParseException {
        return date(ld.getDayOfMonth(), ld.getMonthValue(), ld.getYear());
    }

    private static Date date(int gg, int mm, int aa) throws ParseException {
        String date_string = gg+"-"+mm+"-"+aa;
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = formatter.parse(date_string);

        return date;
    }

    private void addProccesColor(Integer column, Color color) {
        colormap.put(column, color);
    }

}
