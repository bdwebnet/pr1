package net.bdweb.gds2.pr1_70_80_90_schleifen.ab_20;

import java.util.Scanner;

public class a04 {

    public static void main(String[] args) {

        // Variablendeklaration
        int eingabe_x1, eingabe_y1, eingabe_x2, eingabe_y2, breite, hoehe, flaeche;

        // Scanner initialisieren
        Scanner sc = new Scanner(System.in);

        while (true) {

            // Eingabe
            System.out.print("Erster Eckpunkt X-Koordinate: ");
            eingabe_x1 = sc.nextInt();

            System.out.print("Erster Eckpunkt Y-Koordinate: ");
            eingabe_y1 = sc.nextInt();

            System.out.print("Zweiter Eckpunkt X-Koordinate: ");
            eingabe_x2 = sc.nextInt();

            System.out.print("Zweiter Eckpunkt Y-Koordinate: ");
            eingabe_y2 = sc.nextInt();

            // Verarbeitung
            breite = Math.abs(eingabe_x2 - eingabe_x1);
            hoehe = Math.abs(eingabe_y2 - eingabe_y1);
            flaeche = breite * hoehe;

            // Ausgabe
            if (flaeche > 0) {
                System.out.println("Breite: " + breite + "; Hoehe: " + hoehe + "; Flaeche: " + flaeche + "\n");
            } else {
                System.out.println("\nFertig!");
                break;
            }

        }

        // Scanner schließen
        sc.close();

    }

}
