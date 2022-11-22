package net.bdweb.gds2.pr1_x170_statische_methoden.ab17;

import java.text.DecimalFormat;

public class Bruchrechnen {

    public static void addieren(int z1, int n1, int z2, int n2) {
        int z = z1 * n2 + z2 * n1;
        int n = n1 * n2;
        System.out.println("Ergebnis: " + z + " / " + n);
        berechneKommazahl(z, n);
    }

    public static void subtrahieren(int z1, int n1, int z2, int n2) {
        int z = z1 * n2 - z2 * n1;
        int n = n1 * n2;
        System.out.println("Ergebnis: " + z + " / " + n);
        berechneKommazahl(z, n);
    }

    public static void multiplizieren(int z1, int n1, int z2, int n2) {
        int z = z1 * z2;
        int n = n1 * n2;
        System.out.println("Ergebnis: " + z + " / " + n);
        berechneKommazahl(z, n);
    }

    public static void dividieren(int z1, int n1, int z2, int n2) {
        int z = z1 * n2;
        int n = n1 * z2;
        System.out.println("Ergebnis: " + z + " / " + n);
        berechneKommazahl(z, n);
    }

    public static void berechneKommazahl(int z, int n) {
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Ergebnis als Kommazahl: " + df.format((double) z / (double) n));
    }

}
