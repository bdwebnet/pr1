package net.bdweb.gds2.pr1_70_80_90_schleifen.zusatz_christbaum;

import java.util.Scanner;

public class ChristbaumNeu {

    public static void main(String[] args) {

        // Variablendeklaration
        int aeste, asthoehe, sterne_aktueller_ast = 0, max_sterne;

        Scanner sc = new Scanner(System.in);

        // Eingabe
        System.out.print("Bitte gebe die Anzahl der Äste ein: ");
        aeste = sc.nextInt();

        System.out.print("Bitte gebe die Asthöhe ein: ");
        asthoehe = sc.nextInt();

        // Leere Zeile
        System.out.println("");

        if (asthoehe > aeste) {
            max_sterne = asthoehe + ( (aeste-1) * (aeste ^ (aeste+3)) );
        } else {
            max_sterne = asthoehe + ( (aeste-1) * (aeste ^ (aeste+1)) );
        }

        // Für jeden Ast
        for (int i = 0; i < aeste; i++) {

            // Für die jeweilige Asthöhe
            for (int j = 0; j < asthoehe; j++) {

                sterne_aktueller_ast += 1;

                // Abstand nach links
                for (int k = 0; k < max_sterne - sterne_aktueller_ast; k++) {
                    System.out.print(" ");
                }

                for (int k = 0; k < sterne_aktueller_ast + sterne_aktueller_ast - 1; k++) {
                    System.out.print("*");
                }

                // Neue Zeile
                System.out.println("");

            }

            sterne_aktueller_ast -= 2;

        }

    }

}
