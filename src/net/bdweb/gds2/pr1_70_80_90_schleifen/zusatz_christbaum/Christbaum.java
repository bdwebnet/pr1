package net.bdweb.gds2.pr1_70_80_90_schleifen.zusatz_christbaum;

import java.util.Scanner;

public class Christbaum {

    public static void main(String[] args) {

        // Variablendeklaration
        int aeste, asthoehe, zeile_sterne = 1;

        Scanner sc = new Scanner(System.in);

        // Eingabe
        System.out.print("Bitte gebe die Anzahl der Äste ein: ");
        aeste = sc.nextInt();

        System.out.print("Bitte gebe die Asthöhe ein: ");
        asthoehe = sc.nextInt();

        // Leere Zeile
        System.out.println("");

        // Für jeden Ast
        for (int i = 0; i < aeste; i++) {

            // Für die jeweilige Asthöhe
            for (int j = 0; j < asthoehe; j++) {

                // Abstand nach links
                for (int k = 0; k < asthoehe*2 - zeile_sterne/2 - 1; k++) {
                    System.out.print(" ");
                }

                // Sterne ausgeben
                for (int k = 0; k < zeile_sterne; k++) {
                    System.out.print("*");
                }

                // Neue Zeile
                System.out.println("");

                zeile_sterne += 2;

            }

            zeile_sterne -= 4;

        }

    }

}
