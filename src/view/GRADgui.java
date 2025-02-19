package view;

import controller.DependencyManager;
import model.compiler.Address;
import model.compiler.Exam;
import model.compiler.Student;
import model.compiler.University;
import view.tableModel.DegreeTableModel;
import view.utils.Mode;
import controller.Degree;
import controller.Parser;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.format.DateTimeFormatter;

/**
 * Estensione di <i>{@link JFrame}</i> e realizzata principalmente con <i>Swing</i> ed il supporto di <a href="https://plugins.jetbrains.com/plugin/25304-swing-ui-designer">IntelliJ Swing UI Designer</a>, è la componente principale del livello <i>view</i>. Costituisce l'elemento grafico principale.
 * <ul>
 *     <li>Contiene una <i>{@link JTable}</i> con <i>{@link DegreeTableModel}</i> per visualizzare le informazioni degli esami;</li>
 *     <li>Configurazione di diversi <i>{@link ActionListener}</i> ed <i>{@link ActionEvent}</i> per rispondere all'interazione utente;</li>
 *     <li>Da questa interfaccia, l'utente può caricare il file GRAD (popolando il modello gestito da {@link Degree}) e generare una <i>{@link GanttFrame}</i>.</li>
 * </ul>
 */
public class GRADgui  extends JFrame{

    //elementi grafici generati da IntelliJ UI Swing Designer
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
    private JButton datiStudenteButton;

    //elementi customizzati
    /**
     * Modello per la <i>{@link JTable}</i>
     */
    private DegreeTableModel degreemodel;
    /**
     * Riferimento alla {@link JFrame} responsabile del grafico Gantt
     */
    private GanttFrame gf;

    //variabili d'appoggio
    /**
     * Modalità di filtraggio dati (vedi <i>{@link Mode}</i>)
     */
    private Mode mode;
    /**
     * anno selezionato nella <tt>groupBox</tt> (per <tt>mode==Mode.YEAR</tt>)
     */
    private int selectedYear;
    /**
     * esame selezionato nella <tt>groupBox</tt> (per <tt>mode==Mode.DEPENDENCY_OF</tt>)
     */
    private String selectedExam;

    /**
     * Costruttore di GRADgui.
     */
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

                datiStudenteButton.setVisible(Degree.getDegree().hasStudent());
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
                } else if (s.equals("DEPENDENCY_OF")){
                    loadDependenciesGroupBox();
                    showGroupBox(true);
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
                    selectedYear = (int) groupBox.getSelectedItem();
                    displayYear(selectedYear);
                } else if(mode == Mode.DEPENDENCY_OF){
                    selectedExam = (String) groupBox.getSelectedItem();
                    displayDependencies(selectedExam);
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
                                gf.createYearTaskCollection(selectedYear);
                            } else if (mode.equals(Mode.DEPENDENCY_OF)){
                                gf.createDependencyTaskCollection(selectedExam);
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

        datiStudenteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Degree.getDegree().hasStudent())
                {
                    Student x = Degree.getDegree().getStudent();
                    University u = x.getUniversity();
                    Address a = u.getAddress();
                    String s = ""+x.getName()+" "+x.getSurname() +" (matr. "+x.getSerial() +")"
                            +"\nData di Nascita:"+x.getBirthdate().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))
                            +"\nEmail:"+x.getEmail()
                            +"\n\nStudente  presso "+u.getName()
                            +"\n" + a.getStreet() + ", n° "+a.getNumber() +", "+a.getZip()
                            +"\n" + a.getCity() + " ("+a.getCountry()+")";

                    JOptionPane.showMessageDialog(null, s,"Dati Studente",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }

    /**
     * Se presenti, visualizza JDialog per segnalare
     * <ul>
     *     <li>Errori di compilazione.</li>
     *     <li>Warning di compilazione;</li>
     *     <li>eccezioni di diverso genere (ad es. file GRAD non trovato).</li>
     * </ul>
     */
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

        if(!DependencyManager.getInstance().hasDependencyMapper())
            JOptionPane.showMessageDialog(null,
                    "File 'career.YML' non trovato o non corretto. Le dipendenze tra i corsi non sono state prese in considerazione.",
                    "Nessuna dipendenza corso",
                    JOptionPane.WARNING_MESSAGE);
    }

    /**
     * Carica la GroupBox con gli identificativi degli elementi <i>Year</i> in <i>{@link Degree}</i>.
     */
    private void loadYearsGroupBox(){
        groupBox.removeAllItems();
        for(int i=1; i<=Degree.getDegree().getYears().size(); i++)
            groupBox.addItem(i);
    }

    /**
     * Aggiorna il modello <i>{@link DegreeTableModel}</i> con successiva notifica alla <i>JTable</i> per visualizzare tutti gli esami di carriera nella <i>JTable</i>
     */
    private void displayCareer(){
        degreemodel.displayCareer();
        dataTable.updateUI();
    }

    /**
     * Aggiorna il modello <i>{@link DegreeTableModel}</i> con successiva notifica alla <i>JTable</i> per visualizzare gli esami di uno specifico anno nella <i>JTable</i>
     * @param year identificativo <i>int</i> anno
     */
    private void displayYear(int year){
        degreemodel.displayByYear(year);
        dataTable.updateUI();
    }

    /**
     * Aggiorna il modello <i>{@link DegreeTableModel}</i> con successiva notifica alla <i>JTable</i> per visualizzare gli esami che sono dipendenza di uno specifico esame, nella <i>JTable</i>
     * @param exam identificativo <i>String</i> per l'esame con dipendenze
     */
    private void displayDependencies(String exam){
        degreemodel.displayDependencies(exam);
        dataTable.updateUI();
    }

    /**
     * Carica la <tt>groupBox</tt> con gli identificativi degli elementi <i>Exam</i> in <i>{@link Degree}</i> che hanno dipendenze presenti come oggetti <i>Exam</i> in <i>Degree</i>
     */
    private void loadDependenciesGroupBox(){
        groupBox.removeAllItems();
        for(Exam e : DependencyManager.getInstance().getExamsWithDependencies())
            groupBox.addItem(e.getName());
    }


    /**
     * Visualizza <tt>typeBox</tt> e modifica label di fianco
     * @param show  booleano, <tt>true</tt> per mostrare e <tt>false</tt> altrimenti
     */
    private void showTypeBox(boolean show){
        if(show){
            showLabel.setText("Seleziona");
            String[] types;
            if(DependencyManager.getInstance().hasDependencies() && DependencyManager.getInstance().hasAnyDependencyLoaded()) {
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

    /**
     * Visualizza <tt>groupBox</tt>
     * @param show  booleano, <tt>true</tt> per mostrare e <tt>false</tt> altrimenti
     */
    private void showGroupBox(boolean show){
        doubleDotsLabel.setVisible(show);
        groupBox.setVisible(show);
    }

    /**
     * Metodo predisposto da <a href="https://plugins.jetbrains.com/plugin/25304-swing-ui-designer">IntelliJ Swing UI Designer</a> per creazione personalizzata di componenti UI
     */
    private void createUIComponents() {

        degreemodel = new DegreeTableModel();
        dataTable = new JTable(degreemodel);

    }
}
