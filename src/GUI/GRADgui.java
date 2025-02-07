package GUI;

import GUI.Model.DegreeTableModel;
import myPackage.Parser;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GRADgui  extends JFrame{
    private JTable dataTable;
    private JComboBox GroupBox;
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


    //modelli per viste
    private DegreeTableModel degreemodel;

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
                degreemodel.refresh();
                dataTable.revalidate();
            }
        });
    }

    private void createUIComponents() {

        degreemodel = new DegreeTableModel();
        dataTable = new JTable(degreemodel);

    }
}
