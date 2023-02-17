package net.bdweb.gds2.pr1_x280_x290_Vererbung.ab_uebungen_vererbung.aufgabe03;

public class AbfallBehaelter extends Behaelter {

    public AbfallBehaelter ( double fuellstand, double maxFuellstand ) {
        super(fuellstand, maxFuellstand);
    }

    @Override
    public String toString () {
        return null;
    }

    public void behaelterNachfuellen ( double menge ) {
        this.fuellstand += menge;
    }

}
