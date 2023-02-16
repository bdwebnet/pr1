package net.bdweb.gds2.pr1_x280_x290_Vererbung.ab_uebungen_vererbung.aufgabe01;

public abstract class Immobilie {

    protected String ort;
    protected int baujahr;
    protected double wohnflaeche;
    protected double preis;

    public Immobilie ( String ort, int baujahr, double wohnflaeche, double preis ) {
        this.ort = ort;
        this.baujahr = baujahr;
        this.wohnflaeche = wohnflaeche;
        this.preis = preis;
    }

    public String getOrt () {
        return ort;
    }

    public void setOrt ( String ort ) {
        this.ort = ort;
    }

    public int getBaujahr () {
        return baujahr;
    }

    public void setBaujahr ( int baujahr ) {
        this.baujahr = baujahr;
    }

    public double getWohnflaeche () {
        return wohnflaeche;
    }

    public void setWohnflaeche ( double wohnflaeche ) {
        this.wohnflaeche = wohnflaeche;
    }

    public double getPreis () {
        return preis;
    }

    public void setPreis ( double preis ) {
        this.preis = preis;
    }

}
