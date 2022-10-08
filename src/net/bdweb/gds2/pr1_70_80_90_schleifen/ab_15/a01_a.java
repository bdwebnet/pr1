package net.bdweb.gds2.pr1_70_80_90_schleifen.ab_15;

import java.util.Scanner;

public class a01_a {

    public static final int static_pin = 6729;

    public static void main(String[] args) {

        // Variablendeklaration
        int input_pin;
        Scanner sc = new Scanner(System.in); // wird auch initialisiert

        do {

            // Eingabe
            System.out.print("Bitte gebe deine vierstellige Pin ein: ");
            input_pin = sc.nextInt();

            // Verarbeitung & Ausgabe
            if (input_pin == static_pin) {
                System.out.println("Deine Pin ist richtig.");
            } else {
                System.out.println("Deine Pin ist falsch. Bitte erneut versuchen.");
            }

        } while (input_pin != static_pin);

    }

}
