package myPackage;

import GUI.GRADgui;

import javax.swing.*;

public class GuiTester {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GRADgui gui = new GRADgui();
                gui.setVisible(true);

            }
        });
    }
}
