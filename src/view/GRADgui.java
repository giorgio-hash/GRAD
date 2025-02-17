package view;

import controller.DependencyManager;
import view.tableModel.DegreeTableModel;
import view.utils.Mode;
import controller.Degree;
import controller.Parser;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GRADgui  extends JFrame{

    //elementi grafici generati da IntelliJ Swing Designer
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

                displayErrorsAndWarnings();

                mode = Mode.CAREER;

                if(Parser.getInstance().hasErrors() || Parser.getInstance().hasOtherExceptions()){
                    showGroupBox(false);
                    showTypeBox(false);
                    gf = null;
                }else{
                    showTypeBox(true);
                    showGroupBox(false);
                    gf = new GanttFrame("GRAD - Gantt chart");
                }

                degreemodel.refresh();
                displayCareer();
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

                        try {

                            gf.clean();
                            if (mode.equals(Mode.CAREER)) {
                                gf.createDegreeTaskCollection();
                            } else if (mode.equals(Mode.YEAR)) {
                                gf.createYearTaskCollection(selected_year);
                            }
                            gf.display();
                            gf.pack();
                            gf.setVisible(true);

                        }catch(Exception ex){
                            JOptionPane.showMessageDialog(null,
                                    "Qualcosa è andato storto durante la generazione del Gantt. Dettagli:\n\n"+ex.getMessage(),
                                    "Errore in generazione Gantt GRAD",
                                    JOptionPane.ERROR_MESSAGE);
                            gf.clean();
                        }
            }
        });
    }

    private void displayErrorsAndWarnings(){

        if(Parser.getInstance().hasOtherExceptions()){
            JOptionPane.showMessageDialog(null,
                    "Assicurati che il percorso al tuo file '.GRAD' sia corretto o consulta il manuale.\nSe l'errore persiste, lascia una segnalazione agli sviluppatori.",
                    "Errore di configurazione",
                    JOptionPane.ERROR_MESSAGE);
        }

        String s = "";
        if(Parser.getInstance().hasErrors())
        {
            for(String err : Parser.getInstance().getErrors())
                s += "\t- " + err + "\n";

            JOptionPane.showMessageDialog(null,
                    s,
                    "Errore in compilazione GRAD",
                    JOptionPane.ERROR_MESSAGE);
        }
        s = "";
        if(Parser.getInstance().hasWarning())
        {
            for(String wa : Parser.getInstance().getWarnings())
                s += "\t- " + wa + "\n";

            JOptionPane.showMessageDialog(null,
                    s,
                    "Warning in compilazione GRAD",
                    JOptionPane.WARNING_MESSAGE);
        }
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
    private void showTypeBox(boolean show){
        if(show){
            showLabel.setText("Seleziona");
            String[] types;
            if(DependencyManager.getInstance().getDependencyMapper().hasDependencies()) {
                types = new String[3];
                types[0] = "CAREER";
                types[1] = "YEAR";
                types[2] = "DEPENDENCY_OF";
            }else{
                types = new String[2];
                types[0] = "CAREER";
                types[1] = "YEAR";
            }
            typeBox.setModel(new DefaultComboBoxModel(types));
        }else{
            showLabel.setText("Benvenuto in GRAD! Per iniziare, carica un file \".GRAD\".");
        }
        typeBox.setVisible(show);
        creaGanttButton.setVisible(show);
        invioButton.setVisible(show);
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
