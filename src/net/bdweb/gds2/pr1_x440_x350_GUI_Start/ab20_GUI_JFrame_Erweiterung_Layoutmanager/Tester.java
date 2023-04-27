package net.bdweb.gds2.pr1_x440_x350_GUI_Start.ab20_GUI_JFrame_Erweiterung_Layoutmanager;

import javax.swing.*;
import java.awt.*;

public class Tester {

    public static void main ( String[] args ) {

        JFrame fenster = new JFrame("Layout Tester");

        fenster.setLayout(new GridLayout(2, 2));

        JButton button1 = new JButton("Rot");

        button1.addActionListener(e -> {
            // open website
            try {
                Desktop.getDesktop().browse(java.net.URI.create("http://www.google.com"));
            } catch ( Exception ex ) {
                ex.printStackTrace();
            }
        });

        // set button1 background color
        button1.setBackground(Color.RED);

        // JFrame with 4 colored buttons
        fenster.setSize(300, 200);
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenster.add(button1);
        fenster.add(new JButton("Gelb"));
        fenster.add(new JButton("Blau"));
        fenster.add(new JButton("Grün"));
        fenster.setVisible(true);

    }

}
