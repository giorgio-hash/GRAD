package GUI.Model;


import javax.swing.table.AbstractTableModel;

import myCompilerPackage.util.Degree;
import myCompilerPackage.util.Exam;
import myCompilerPackage.util.Year;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class DegreeTableModel extends AbstractTableModel
{
    private List<Pair<Integer,Exam>> toDisplay;
    private List<Pair<Integer,Exam>> examList;
    private Degree degree;

    private final String[] columnNames = new String[] {
            "Year","Exam","CFU","Date","Passed","Milestone"
    };
    private final Class[] columnClass = new Class[] {
            String.class, String.class, String.class, LocalDate.class , Boolean.class, String.class
    };

    public DegreeTableModel()
    {
        this.degree = Degree.getDegree();
    }

    public void refresh(){
        this.examList = new ArrayList<Pair<Integer, Exam>>();

        for(Year y : degree.getYears()){
            for(Exam e: y.getExams().values()){
                this.examList.add(new Pair<Integer, Exam>(y.getId(), e));
            }
        }
    }

    public void displayByYear(int year){
        this.toDisplay = new ArrayList<Pair<Integer, Exam>>();
        for(Pair<Integer, Exam> p: examList){
            if(p.getLeft() == year){
                this.toDisplay.add(p);
            }
        }
    }

    public void displayCareer(){
        this.toDisplay = this.examList;
    }

    @Override
    public String getColumnName(int column)
    {
        return columnNames[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex)
    {
        return columnClass[columnIndex];
    }

    @Override
    public int getColumnCount()
    {
        return columnNames.length;
    }

    @Override
    public int getRowCount()
    {
        int count = 0;
        for(Year y: degree.getYears()){
            count += y.getExams().size();
        }
        return count;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        if(0 == columnIndex) {
            return examList.get(rowIndex).getLeft();
        }
        else if(1 == columnIndex) {
            return examList.get(rowIndex).getRight().getName();
        }
        else if(2 == columnIndex) {
            return examList.get(rowIndex).getRight().getCfu();
        }
        else if(3 == columnIndex) {
            return examList.get(rowIndex).getRight().getAppello();
        }
        else if(4 == columnIndex) {
            return examList.get(rowIndex).getRight().isPassed();
        }
        else if(5 == columnIndex) {
            return examList.get(rowIndex).getRight().getMilestone();
        }
        return null;
    }


    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex)
    {
        return false;
    }

}