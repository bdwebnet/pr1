package net.bdweb.gds2.pr1_x100_arrays.ab_20;

import java.text.DecimalFormat;
import java.util.Scanner;

public class a03 {

    public static void main(String[] args) {

        // INIT
        String [] schuelernamen = new String[10];
        double [] noten = new double[schuelernamen.length];
        double durchschnitt = 0;

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        // Eingabe
        for (int i = 0; i < schuelernamen.length; i++) {
            System.out.print("Bitte gebe den Namen von Schüler-Nr. " + (i+1) + " ein: ");
            schuelernamen[i] = sc.next();
        }
        
        for (int i = 0; i < noten.length; i++) {
            System.out.print("Bitte gebe die Note von " + schuelernamen[i] + " ein: ");
            noten[i] = sc.nextDouble();
            durchschnitt += noten[i];
        }

        // Verarbeitung
        durchschnitt = durchschnitt / noten.length;

        // Ausgabe
        System.out.println("\nDer Durchschnitt ist " + df.format(durchschnitt) + ".\n");

        for (int i = 0; i < 10; i++) {
            double schueler = noten[i];
            
            if (schueler > durchschnitt) {
                System.out.println(schuelernamen[i] + " ist besser als der Durchschnitt.");
            } if (schueler == durchschnitt) {
                System.out.println(schuelernamen[i] + " ist durchschnittlich gut.");
            } else {
                System.out.println(schuelernamen[i] + " ist schlechter als der Durchschnitt.");
            }
        }

    }

}
