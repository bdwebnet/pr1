package net.bdweb.gds2.pr1_x280_x290_Vererbung.ab_uebungen_vererbung.aufgabe03;

public abstract class Behaelter {

    protected double fuellstand;
    protected double maxFuellstand;

    public Behaelter ( double fuellstand, double maxFuellstand ) {
        this.fuellstand = fuellstand;
        this.maxFuellstand = maxFuellstand;
    }

    public abstract String toString ();

}
