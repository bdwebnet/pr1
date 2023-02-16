package net.bdweb.gds2.pr1_x280_x290_Vererbung.ab_uebungen_vererbung.aufgabe01;

public class Wohnhaus extends Immobilie {

    private double grundstuecksflaeche;

    public Wohnhaus ( String ort, int baujahr, double wohnflaeche, double preis, double grundstuecksflaeche ) {
        super(ort, baujahr, wohnflaeche, preis);
        this.grundstuecksflaeche = grundstuecksflaeche;
    }

    public double getGrundstuecksflaeche () {
        return grundstuecksflaeche;
    }

    public void setGrundstuecksflaeche ( double grundstuecksflaeche ) {
        this.grundstuecksflaeche = grundstuecksflaeche;
    }

}
