package net.bdweb.gds2.klausur_04.aufgabe02;

import java.text.DecimalFormat;

public class Muenzsammlung {

    public static void main ( String[] args ) {
        DecimalFormat euroFormat = new DecimalFormat("0.00 €");

        Muenze[] meineMuenzen = { Muenze.EinCent, Muenze.FuenfCent, Muenze.FuenfzigCent, Muenze.EinEuro, Muenze.ZweiEuro };

        for ( Muenze muenze : meineMuenzen ) {
            System.out.println("Wert einer " + muenze + "-Münze: " + euroFormat.format(muenze.getWertInEuro()));
        }
    }

}
