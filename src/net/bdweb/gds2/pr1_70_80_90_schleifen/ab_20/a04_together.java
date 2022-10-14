package net.bdweb.gds2.pr1_70_80_90_schleifen.ab_20;

import java.util.Scanner;

public class a04_together {

    public static void main(String[] args) {

        // INIT
        int x1 = 2, y1 = 3, x2 = 3, y2 = 2;
        int hoehe, breite;
        int flaeche = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("CAD Programm");

        while (flaeche > 0) {

            // Eingabe
            System.out.print("Erster Eckpunkt X-Koordinate: ");
            x1 = sc.nextInt();

            System.out.print("Erster Eckpunkt Y-Koordinate: ");
            y1 = sc.nextInt();

            System.out.print("Zweiter Eckpunkt X-Koordinate: ");
            x2 = sc.nextInt();

            System.out.print("Zweiter Eckpunkt Y-Koordinate: ");
            y2 = sc.nextInt();

            // Verarbeitung
            breite = Math.abs(x2 - x1);
            /*breite = Math.abs(x2 - x1);
            if (breite < 0) {
                breite = breite * (-1);
            }*/

            hoehe = Math.abs(y2 - y1);
            /*hoehe = Math.abs(y2 - y1);
            if (hoehe < 0) {
                hoehe = hoehe * (-1);
            }*/

            flaeche = breite * hoehe;

            // Ausgabe
            System.out.println("Breite: " + breite
                    + " Hoehe: " + hoehe + " Flaeche: "
                    + flaeche + "\n");

        }

        System.out.println("Fertig!");

    }

}
