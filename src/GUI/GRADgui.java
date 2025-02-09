package GUI;

import GUI.Models.DegreeTableModel;
import GUI.Utils.Mode;
import myCompilerPackage.util.Degree;
import myPackage.Parser;
import org.jfree.ui.RefineryUtilities;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

public class GRADgui  extends JFrame{

    //elementi grafici gnerati da IntelliJ Swing Designer
    private JTable dataTable;
    private JComboBox groupBox;
    private JComboBox typeBox;
    private JButton invioButton;
    private JButton caricaButton;
    private JButton creaGanttButton;
    private JPanel mainPanel;
    private JPanel upperPanel;
    private JPanel topPanel;
    private JScrollPane lowerScrollPanel;
    private JScrollBar verticalScrollBar;
    private JScrollBar horizontalScrollBar;
    private JLabel doubleDotsLabel;
    private JLabel showLabel;

    //elementi customizzati
    private DegreeTableModel degreemodel;
    private GanttFrame gf;

    //variabili d'appoggio
    private Mode mode;
    private int selected_year;


    public GRADgui() {
        setTitle("GRAD");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(mainPanel);
        pack();
        setLocationRelativeTo(null);
        caricaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Parser.getInstance().parse();

                mode = Mode.CAREER;

                showGroupBox(false);
                degreemodel.refresh();
                displayCareer();
                showTypeBox();

                gf = new GanttFrame("GRAD - Gantt chart");

                String s = "";
                if(Parser.getInstance().hasErrors())
                {
                    for(String err : Parser.getInstance().getErrors())
                        s += "\t- " + err + "\n";

                    JOptionPane.showMessageDialog(null,
                            s,
                            "Errore in fase di compilazione",
                            JOptionPane.ERROR_MESSAGE);
                }
                s = "";
                if(Parser.getInstance().hasWarning())
                {
                    for(String wa : Parser.getInstance().getWarnings())
                        s += "\t- " + wa + "\n";

                    JOptionPane.showMessageDialog(null,
                            s,
                            "Warning in fase di compilazione",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        typeBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = (String) typeBox.getSelectedItem();
                if(s.equals("YEAR")){
                    loadYearsGroupBox();
                    showGroupBox(true);
                } else if (s.equals("CAREER")) {
                    showGroupBox(false);
                }
            }
        });

        invioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mode = Mode.valueOf((String) typeBox.getSelectedItem());
                if(mode == Mode.CAREER){
                    displayCareer();
                } else if(mode == Mode.YEAR){
                    selected_year = (int) groupBox.getSelectedItem();
                    displayYear(selected_year);
                }
            }
        });

        creaGanttButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                        gf.clean();
                        if(mode.equals(Mode.CAREER)){
                            gf.createDegreeTaskCollection();
                        } else if(mode.equals(Mode.YEAR)){
                            gf.createYearTaskCollection(selected_year);
                        }
                        gf.display();
                        gf.pack();
                        gf.setVisible(true);
            }
        });
    }

    private void loadYearsGroupBox(){
        groupBox.removeAllItems();
        for(int i=1; i<=Degree.getDegree().getYears().size(); i++){
            groupBox.addItem(i);
        }
    }

    private void displayCareer(){
        degreemodel.displayCareer();
        dataTable.updateUI();
    }
    private void displayYear(int year){
        degreemodel.displayByYear(year);
        dataTable.updateUI();
    }
    private void showTypeBox(){
        showLabel.setText("Seleziona");
        String[] types = {"CAREER","YEAR"};
        typeBox.setModel(new DefaultComboBoxModel(types));
        typeBox.setVisible(true);
        creaGanttButton.setVisible(true);
        invioButton.setVisible(true);
    }

    private void showGroupBox(boolean show){
        doubleDotsLabel.setVisible(show);
        groupBox.setVisible(show);
    }

    private void createUIComponents() {

        degreemodel = new DegreeTableModel();
        dataTable = new JTable(degreemodel);

    }
}
