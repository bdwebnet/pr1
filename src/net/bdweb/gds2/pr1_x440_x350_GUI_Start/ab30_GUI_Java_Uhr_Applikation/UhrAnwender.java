package net.bdweb.gds2.pr1_x440_x350_GUI_Start.ab30_GUI_Java_Uhr_Applikation;

import javax.swing.*;
import java.util.Date;

public class UhrAnwender {

    public static void main ( String[] args ) {

        // set font size for all labels
        UIManager.put("Label.font", UIManager.getFont("Label.font").deriveFont(24.0f));

        MyFrame fenster = new MyFrame("Uhrzeit in der ADV");
        fenster.add(new JLabel("Es ist"));

        // Set fontsize for jlabel

        JLabel clock = new JLabel(String.format("%tT", new Date()));
        fenster.add(clock);

        fenster.add(new JLabel("Uhr."));

        fenster.setVisible(true);

        while ( true ) {
            clock.setText(String.format("%tT", new Date()));
            try {
                Thread.sleep(1000);
            } catch ( InterruptedException e ) {
                e.printStackTrace();
            }
        }

        /*JFrame fenster = new JFrame("Uhrzeit in der ADV");

        fenster.setSize(300, 200);

        fenster.setBounds(100, 100, 300, 200);

        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add text to fenster "Die Uhr die niemals schlägt"
        JLabel label = new JLabel("Die Uhr ist");
        fenster.add(label);

        JLabel clock = new JLabel(String.format("%tdT", new Date()));
        fenster.add(clock);

        fenster.setVisible(true);

        // update clock
        while ( true ) {
            clock.setText(String.format("%tT", new Date()));
            try {
                Thread.sleep(1000);
            } catch ( InterruptedException e ) {
                e.printStackTrace();
            }
        }*/

    }

}
