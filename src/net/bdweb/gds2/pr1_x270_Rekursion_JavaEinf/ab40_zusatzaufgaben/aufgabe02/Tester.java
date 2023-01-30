package net.bdweb.gds2.pr1_x270_Rekursion_JavaEinf.ab40_zusatzaufgaben.aufgabe02;

public class Tester {

    public static void main ( String[] args ) {
        Monat monat = Monat.FEBRUAR;

        System.out.println(monat.name() + " hat " + monat.getAnzahlTage() + " Tage.");

        if ( monat.in(Jahreszeit.WINTER) ) {
            System.out.println("Dieser Monat ist im Winter.");
        }
    }

}
