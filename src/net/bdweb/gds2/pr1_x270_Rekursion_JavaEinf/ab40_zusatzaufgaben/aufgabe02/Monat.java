package net.bdweb.gds2.pr1_x270_Rekursion_JavaEinf.ab40_zusatzaufgaben.aufgabe02;

public enum Monat {

    JANUAR(31, Jahreszeit.WINTER), FEBRUAR(28, Jahreszeit.WINTER), MAERZ(31, Jahreszeit.FRUEHLING), APRIL(30, Jahreszeit.FRUEHLING), MAI(31, Jahreszeit.FRUEHLING), JUNI(30, Jahreszeit.SOMMER), JULI(31, Jahreszeit.SOMMER), AUGUST(31, Jahreszeit.SOMMER), SEPTEMBER(30, Jahreszeit.HERBST), OKTOBER(31, Jahreszeit.HERBST), NOVEMBER(30, Jahreszeit.HERBST), DEZEMBER(31, Jahreszeit.WINTER);

    private int anzahlTage;
    private Jahreszeit jahreszeit;

    Monat ( int anzahlTage, Jahreszeit jahreszeit ) {
        this.anzahlTage = anzahlTage;
        this.jahreszeit = jahreszeit;
    }

    public int getAnzahlTage () {
        return anzahlTage;
    }

    public boolean in ( Jahreszeit jahreszeit ) {
        return this.jahreszeit == jahreszeit;
    }

}
