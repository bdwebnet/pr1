package net.bdweb.gds2.pr1_x280_x290_Vererbung.ab_uebungen_vererbung.aufgabe03;

public class Zutat {

    private Produkt produkt;
    private double menge;

    public Zutat ( Produkt produkt, double menge ) {
        this.produkt = produkt;
        this.menge = menge;
    }

    public Produkt getProdukt () {
        return produkt;
    }

    public void setName ( Produkt produkt ) {
        this.produkt = produkt;
    }

    public double getMenge () {
        return menge;
    }

    public void setMenge ( double menge ) {
        this.menge = menge;
    }

}
