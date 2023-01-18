package net.bdweb.gds2.pr1_x210_Ueberladen_von_Methoden.ab10_OinO;

public class Fahrzeug {

    private final String fahrzeugart;
    private final int gewicht;
    private final boolean automatikgetriebe;
    private final int kw;
    private final String farbe;
    private final int anzahl_der_plaetze;
    private final String modell;
    private final String marke;
    private final double mietpreis;
    private final String kennzeichen;
    private int aktuell_kilometerstand;
    private int anfangs_kilometerstand;
    private boolean vermietet;

    public Fahrzeug ( String fahrzeugart, int gewicht, boolean automatikgetriebe, int kw, String farbe, int anzahl_der_plaetze, String modell, String marke, double mietpreis, String kennzeichen ) {
        this.fahrzeugart = fahrzeugart;
        this.gewicht = gewicht;
        this.automatikgetriebe = automatikgetriebe;
        this.kw = kw;
        this.farbe = farbe;
        this.anzahl_der_plaetze = anzahl_der_plaetze;
        this.modell = modell;
        this.marke = marke;
        this.mietpreis = mietpreis;
        this.kennzeichen = kennzeichen;
    }

    public Fahrzeug () {
    }

    public double berechneKmStand ( double endKm ) {
        return endKm;
    }

    public double berechneMietkosten () {
        double kosten;
        return kosten;
    }

}
