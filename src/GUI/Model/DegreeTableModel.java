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
    private List<Exam> exams;
    private List<Integer> years;

    //creare un oggetto pair per associare l'anno all'esame. Creare comparators

    private Degree degree;

    private final String[] columnNames = new String[] {
            "Year","Exam","CFU","Date","Passed","Milestone"
    };
    private final Class[] columnClass = new Class[] {
            String.class, String.class, Integer.class, LocalDate.class , Boolean.class, String.class
    };

    public DegreeTableModel()
    {
        this.degree = Degree.getDegree();
    }

    public void refresh(){
        this.exams = new ArrayList<Exam>();
        this.years = new ArrayList<Integer>();

        for(Year y : degree.getYears()){
            for(Exam e: y.getExams().values()){
                exams.add(e);
                years.add(y.getId());
            }
        }
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
            return years.get(rowIndex);
        }
        else if(1 == columnIndex) {
            return exams.get(rowIndex).getName();
        }
        else if(2 == columnIndex) {
            return exams.get(rowIndex).getCfu();
        }
        else if(3 == columnIndex) {
            return exams.get(rowIndex).getAppello();
        }
        else if(4 == columnIndex) {
            return exams.get(rowIndex).isPassed();
        }
        else if(5 == columnIndex) {
            return exams.get(rowIndex).getMilestone();
        }
        return null;
    }


    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex)
    {
        //return columnIndex != 0;
        return false;
    }

    /*
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex)
    {

    }

     */
}