package net.bdweb.gds2.pr1_x210_Ueberladen_von_Methoden.ab10_OinO;

public class Fahrzeug {

    private String fahrzeugart;
    private int gewicht;
    private boolean automatikgetriebe;
    private int kw;
    private String farbe;
    private int anzahl_der_plaetze;
    private String modell;
    private String marke;
    private double mietpreis;
    private String kennzeichen;
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
        double kosten = 0;
        return kosten;
    }

}
