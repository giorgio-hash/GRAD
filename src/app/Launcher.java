package app;

import view.GRADgui;

import javax.swing.*;

public class Launcher {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GRADgui gui = new GRADgui();
                gui.setVisible(true);

            }
        });
    }
}
