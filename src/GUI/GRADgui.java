package GUI;

import javax.swing.*;
public class GRADgui  extends JFrame{
    private JTable dataTable;
    private JComboBox GroupBox;
    private JComboBox typeBox;
    private JButton invioButton;
    private JButton caricaButton;
    private JButton creaGanttButton;
    private JScrollBar verticalTableScrollbar;
    private JScrollBar horizontalTableScrollBar;
    private JPanel mainPanel;
    private JPanel upperPanel;
    private JPanel lowerPanel;
    private JPanel topPanel;

    public GRADgui() {
        setTitle("GRAD");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(mainPanel);
        pack();
        setLocationRelativeTo(null);
    }

}
