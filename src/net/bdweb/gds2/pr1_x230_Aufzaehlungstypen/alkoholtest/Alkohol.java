package net.bdweb.gds2.pr1_x230_Aufzaehlungstypen.alkoholtest;

import java.text.DecimalFormat;

public enum Alkohol {
    WEIN(12), BIER(4.5), BANANENSAFT(1), WASSER(0);

    private final double alkoholgehaltInProzent;

    // private Konstruktor
    Alkohol ( double alkoholgehaltInProzent ) {
        this.alkoholgehaltInProzent = alkoholgehaltInProzent;
    }

    public double alkoholgehalt () {
        return this.alkoholgehaltInProzent;
    }

    // Gemeinsame Berechnungsmethode für Enumerationskonstanten:
    public String abbauzeit ( double getraenkeMenge, double koerperGewicht ) {
        DecimalFormat df = new DecimalFormat("0.0");

        double mengeAlkoholKg = getraenkeMenge * this.alkoholgehaltInProzent / 100;
        double abbauzeit = 9090.9 * mengeAlkoholKg / koerperGewicht;

        return "Alkoholabbau dauert "
                + df.format(abbauzeit) + " Stunden bei "
                + getraenkeMenge + " Liter und "
                + koerperGewicht + " kg Körpergewicht.";
    }
}
