package net.bdweb.gds2.pr1_70_80_90_schleifen.ab_15;

import java.util.Scanner;

public class a01_c {

    public static final int static_pin = 6729;
    public static final int static_puk = 8367;

    public static void main(String[] args) {

        // Variablendeklaration
        int input_pin;
        int input_puk;
        int tries = 0; // wird auch initialisiert
        Scanner sc = new Scanner(System.in); // wird auch initialisiert

        do {

            // Eingabe
            System.out.print("Bitte geben Sie Ihre vierstellige Pin ein: ");
            input_pin = sc.nextInt();

            // Verarbeitung & Ausgabe
            tries++;

            if (input_pin == static_pin) {
                System.out.println("Ihre Pin ist richtig!");
            } else {
                System.out.println("Ihre Pin ist falsch!");

                if (tries == 3) {
                    System.out.println("Sie haben die PIN dreimal falsch eingegeben!");
                } else {
                    System.out.println("Bitte erneut versuchen.");
                }
            }

        } while (input_pin != static_pin && tries < 3);

        if (input_pin != static_pin) {

            // Eingabe
            System.out.print("Bitte geben Sie Ihren vierstellige PUK ein: ");
            input_puk = sc.nextInt();

            // Verarbeitung & Ausgabe
            if (input_puk == static_puk) {
                System.out.println("Ihr PUK ist richtig!");
            } else {
                System.out.println("Ihr PUK ist falsch! Bitte erneut versuchen.");
            }

        }

    }

}
