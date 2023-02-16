package net.bdweb.gds2.pr1_x280_x290_Vererbung.ab_uebungen_vererbung.aufgabe01;

public class StartImmobilie {

    public static void main ( String[] args ) {

        //System.out.println("Immobiliengesellschaft Immo-GmbH");

        //System.out.println("Was möchten sie erzeugen? Wohnung (1) oder Wohnhaus (2)");

        Wohnung meineWohnung = new Wohnung("Ulm", 2005, 85.0, 185000.00);

        Wohnhaus meinWohnhaus = new Wohnhaus("Esslingen", 1996, 180.0, 575000.00, 450.0);

    }

}
