package GUI;

import GUI.Tiles.*;
import GUI.Utils.MyTaskRenderer;
import myCompilerPackage.util.Degree;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.ui.ApplicationFrame;
import org.jfree.data.category.IntervalCategoryDataset;
import org.jfree.data.gantt.Task;
import org.jfree.data.gantt.TaskSeries;
import org.jfree.data.gantt.TaskSeriesCollection;

import java.awt.*;
import java.time.LocalDate;
import java.util.*;

public class GanttFrame extends ApplicationFrame {

    private TaskSeriesCollection taskseriescollection;
    private TileManager tm;

    public static Map<Integer, Color> colormap = new HashMap<Integer, Color>();

    private int colorIndex = 0;

    private double totPassed = 0;
    private double totExams = 0;
    public GanttFrame(String title) {
        super(title);
        taskseriescollection = new TaskSeriesCollection();
        tm = new TileManager();
    }

    public void display(){
        IntervalCategoryDataset intervalcategorydataset = taskseriescollection;
        JFreeChart jfreechart = ChartFactory.createGanttChart(Degree.getDegree().getName(), "", "",
                intervalcategorydataset, false, true, false);
        final CategoryPlot plot = (CategoryPlot) jfreechart.getPlot();
        MyTaskRenderer renderer = new MyTaskRenderer();
        plot.setRenderer(renderer);
        ChartPanel chartpanel = new ChartPanel(jfreechart);
        chartpanel.setPreferredSize(new Dimension(500, 270));
        setContentPane(chartpanel);

    }

    public void createDegreeTaskCollection(){
        TaskSeries ts = new TaskSeries("Degree");
        Task t = newTask(Degree.getDegree().getName(), tm.getStart(),tm.getEnd(), (double) totPassed/totExams);
        ts.add(t);
        addProccesColor(colorIndex++, Color.darkGray);
        taskseriescollection.add(ts);
        for(int i=1; i<=tm.getYearTiles().size(); i++){
            createYearTaskCollection(i);
        }
        t.setPercentComplete(totPassed/totExams);
    }

    public void createYearTaskCollection(int year){
        taskseriescollection.add(createYearTaskSeries(tm.getYearTiles().get(year-1)));
    }

    private TaskSeries createYearTaskSeries(YearTile yt){

        TaskSeries ts = new TaskSeries("Year " + yt.getYear().getId());
        SortedSet<GanttTile> ea = new TreeSet<GanttTile>(new DeadlineComparator());
        ea.addAll(yt.getExamTiles());
        for(MilestoneTile ms : yt.getMilestoneTiles().values()){
            ea.removeIf(e -> ((ExamTile) e).getExam().getMilestone().equals(ms.getMilestone().getName()));
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

    private double registerPassedExam(ExamTile et){

        if(et.getExam().getStatus().equals("PASSED")){
            addProccesColor(colorIndex++, Color.green.darker());
            return 1.0D;
        }

        addProccesColor(colorIndex++, Color.red.darker());
        return 0.0D;
    }
    private Task createMilestoneTask(MilestoneTile ms){

        double passed = 0.0D;
        double tot = 0.0D;
        Task mt = newTask("milestone "+ms.getMilestone().getName(), ms.getStart(), ms.getEnd());
        addProccesColor(colorIndex++, Color.BLUE.brighter());
        Task t;

        for(ExamTile e : ms.getExamTiles()){
            passed += registerPassedExam(e);
            tot++;
        }
        mt.setPercentComplete(passed/tot);
        return mt;
    }

    /*
    private void newSubTask(Task t, Task sub){
        t.addSubtask(sub);
    }*/

    private Task newTask(String name, LocalDate start, LocalDate end, Double complete){
        Task t = new Task(name, newDate(start), newDate(end));
        t.setPercentComplete(complete);
        return t;
    }
    private Task newTask(String name, LocalDate start, LocalDate end){
        return new Task(name, newDate(start), newDate(end));
    }
    private Date newDate(LocalDate ld){
        return date(ld.getYear(), ld.getMonthValue(), ld.getDayOfMonth());
    }

    private static Date date(int gg, int mm, int aa) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(gg, mm, aa);
        Date date1 = calendar.getTime();
        return date1;
    }

    private void addProccesColor(Integer column, Color color) {
        colormap.put(column, color);
    }


}
