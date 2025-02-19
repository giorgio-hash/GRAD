package view.tableModel;


import javax.swing.table.AbstractTableModel;

import controller.DependencyManager;
import view.utils.Pair;
import controller.Degree;
import model.compiler.Exam;
import model.compiler.Year;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Modello per la <i>JTable</i> presente in <i>GRADgui</i>. E' una specializzazione di <i>{@link AbstractTableModel}</i>.
 * <br>Per l'organizzazione delle informazioni da caricare e visualizzare, la classe si appoggia su <i>{@link Pair}</i>, usata per istanziare delle tuple "<tt>(anno;esame)</tt>" dove "anno" è rappresentato da <i>int</i> e "esame" da <i>Exam</i>.
 * <br>La classe sfrutta due liste come buffer:
 * <ul>
 *     <li><tt>toDisplay</tt>: contiene gli oggetti <i>Pair</i> per la visualizzazione;</li>
 *     <li><tt>examList</tt>: buffer sommario di tutti gli oggetti <i>Pair</i> estratti;</li>
 * </ul>
 * In linea teorica, il buffer <tt>examList</tt> viene caricato dopo la corretta lettura di un file GRAD.
 * In base alle interazioni utente su <i>GRADgui</i>, <i>DegreeTableModel</i> svuota <tt>toDisplay</tt> e lo carica con le informazioni da visualizzare, prendendole da <tt>examList</tt>.
 */
public class DegreeTableModel extends AbstractTableModel
{
    /**
     * Elementi <i>{@link Pair}</i> (coppie anno-esame) da visualizzare
     */
    private List<Pair<Integer,Exam>> toDisplay;
    /**
     * Buffer che memorizza tutti gli elementi <i>{@link Pair}</i> (coppie anno-esame)
     */
    private List<Pair<Integer,Exam>> examList;
    /**
     * Riferimento all'istanza singleton di <i>{@link Degree}</i>
     */
    private Degree degree;

    /**
     * Array ordinato dei nomi delle colonne
     */
    private final String[] columnNames = new String[] {
            "Year","Exam","CFU","Date","Passed","Milestone"
    };

    /**
     * Array ordinato tipi delle colonne
     */
    private final Class[] columnClass = new Class[] {
            String.class, String.class, String.class, LocalDate.class , Boolean.class, String.class
    };

    /**
     * Costruttore
     */
    public DegreeTableModel()
    {
        this.degree = Degree.getDegree();
    }

    /**
     * Aggiorna il buffer principale <tt>examList</tt>, estraendo informazioni da ogni <i>Exam</i> in <i>Degree</i>.
     */
    public void refresh(){
        this.examList = new ArrayList<Pair<Integer, Exam>>();

        for(Year y : degree.getYears()){
            for(Exam e: y.getExams().values()){
                this.examList.add(new Pair<Integer, Exam>(y.getId(), e));
            }
        }
    }

    /**
     * Aggiorna il buffer di visualizzazione <tt>toDisplay</tt> filtrando le informazioni di <tt>examList</tt> per anno.
     * @param year  identificativo per l'anno
     */
    public void displayByYear(int year){
        this.toDisplay = new ArrayList<Pair<Integer, Exam>>();
        for(Pair<Integer, Exam> p: examList){
            if(p.getLeft() == year){
                this.toDisplay.add(p);
            }
        }
    }

    /**
     * Aggiorna il buffer di visualizzazione <tt>toDisplay</tt> filtrando le informazioni di <tt>examList</tt>
     * secondo le dipendenze di un certo esame.
     * @param examName nome esame, formato <i>String</i>
     */
    public void displayDependencies(String examName){
        this.toDisplay = new ArrayList<Pair<Integer, Exam>>();
        ArrayList<Exam> dependencies = new ArrayList<Exam>();
        dependencies.addAll(DependencyManager.getInstance().loadSoftDependencies(Degree.getDegree().getExam(examName)));
        dependencies.addAll(DependencyManager.getInstance().loadStrictDependencies(Degree.getDegree().getExam(examName)));
        for(Pair<Integer, Exam> p: examList){
            if(dependencies.contains(p.getRight())){
                this.toDisplay.add(p);
            }
        }
    }

    /**
     * Aggiorna il buffer di visualizzazione <tt>toDisplay</tt>, prendendo le informazioni di <tt>examList</tt> senza filtri.
     */
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
        if(toDisplay == null)
            return 0;
        return toDisplay.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        if(0 == columnIndex) {
            return toDisplay.get(rowIndex).getLeft();
        }
        else if(1 == columnIndex) {
            return toDisplay.get(rowIndex).getRight().getName();
        }
        else if(2 == columnIndex) {
            return toDisplay.get(rowIndex).getRight().getCfu();
        }
        else if(3 == columnIndex) {
            return toDisplay.get(rowIndex).getRight().getAppello().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        }
        else if(4 == columnIndex) {
            return toDisplay.get(rowIndex).getRight().isPassed();
        }
        else if(5 == columnIndex) {
            return toDisplay.get(rowIndex).getRight().getMilestone();
        }
        return null;
    }


    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex)
    {
        return false;
    }

}