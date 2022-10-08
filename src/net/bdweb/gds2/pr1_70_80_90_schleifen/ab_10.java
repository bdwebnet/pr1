package net.bdweb.gds2.pr1_70_80_90_schleifen;

import java.util.Scanner;

public class ab_10 {

    public static void main(String[] args) {

        // Variablendeklaration
        int einzugebende_zahl, meine_zahl, counter = 0;

        // Variableninitialisierung
        meine_zahl = 42;

        do {
            counter++;

            // Eingabe
            Scanner sc = new Scanner(System.in);
            System.out.println("Rate - Bitte geben Sie eine Zahl ein (zwischen 0 und 50). Versuch Nr. " + counter);
            einzugebende_zahl = sc.nextInt();

            // Verarbeitung & Ausgabe
            if (einzugebende_zahl == meine_zahl) {
                System.out.println("Du hast die Zahl richtig geraten.");
            } else {
                if (einzugebende_zahl > meine_zahl) {
                    System.out.println("Deine Zahl ist größer als meine Zahl.");
                } else {
                    System.out.println("Deine Zahl ist kleiner als meine Zahl.");
                }
            }
        } while (einzugebende_zahl != meine_zahl);
    }

}
