package net.bdweb.gds2.pr1_50_struktogramme_einfuehrung.ab50;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FreierFall {

    final static public double g = 9.81;

    public static void main(String[] args) {
        // INIT
        int t = 0;
        double s = 0.0, v = 0.0;

        // Eingabe
        Scanner sc = new Scanner(System.in);

        System.out.print("Geben Sie die Zeit ein: ");
        t = sc.nextInt();

        sc.close();

        // Berechnung
        s = 0.5 * g * Math.pow(t, 2);
        v = g * t;

        DecimalFormat format = new DecimalFormat();

        // Ausgabe
        System.out.println("Die Endgeschwindigkeit beträgt " + format.format(v) + " m/s.");
        System.out.println("Die Strecke beträgt " + format.format(s) + " m.");
    }
}
