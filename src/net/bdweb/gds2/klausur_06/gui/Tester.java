package net.bdweb.gds2.klausur_06.gui;

public class Tester {

    public static void main ( String[] args ) {

        MyFrame fenster = new MyFrame("Layout Tester");
        MyButton button1 = new MyButton("Rot");

        fenster.add(button1);

        fenster.setVisible(true);

    }

}
