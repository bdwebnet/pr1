package net.bdweb.gds2.ab3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zusatz {

    public static final double g = 9.81;

    public static void main(String[] args) {
        // INIT
        double m_fahrer = 0.0;
        double m_rad = 0.0;
        double h_start = 0.0;
        double h_ziel = 0.0;
        double t = 0.0;
        double P = 0.0;

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.0");

        // Eingabe
        System.out.println("Dieses Programm berechnet die durchschnittliche Leistung eines Radfahrers beim Bergauffahren.");

        System.out.print("Bitte gebe das Gewicht des Radfahrers in kg ein: ");
        m_fahrer = sc.nextDouble();

        System.out.print("Bitte gebe das Gewicht des Fahrrads, der Kleidung, und weiterem Material in kg ein: ");
        m_rad = sc.nextDouble();

        System.out.print("Bitte gebe die Höhe des Startpunkts in Metern über NN ein: ");
        h_start = sc.nextDouble();

        System.out.print("Bitte gebe die Höhe des Zielpunkts in Metern über NN ein: ");
        h_ziel = sc.nextDouble();

        System.out.print("Bitte gebe die gefahrene Zeit in Sekunden ein: ");
        t = sc.nextDouble() / 60;

        sc.close();

        // Berechnung
        P = ( (m_fahrer + m_rad) * g * (h_ziel - h_start) ) / t;

        // Ausgabe
        System.out.println(t);
        System.out.println("Die durchschnittliche Leistung des Radfahrers beträgt " + df.format(P));
    }

}
