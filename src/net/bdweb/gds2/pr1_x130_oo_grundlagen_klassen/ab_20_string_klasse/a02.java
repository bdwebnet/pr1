package net.bdweb.gds2.pr1_x130_oo_grundlagen_klassen.ab_20_string_klasse;

import java.util.Scanner;

public class a02 {

    public static void main(String[] args) {

        // INIT
        String eingabe;
        boolean eingabeFalsch = true;
        boolean eingabeaufforderung = false;
        int summe = 0;

        Scanner sc = new Scanner(System.in);

        // Abfrage nach Eingabeaufforderung
        do {
            System.out.print("Eingabeaufforderung <ja> oder <nein>? ");
            eingabe = sc.next();
            if (eingabe.equals("ja")) {
                eingabeaufforderung = true;
                eingabeFalsch = false;
            } else if (eingabe.equals("nein")) {
                eingabeFalsch = false;
            } else {
                System.out.println("Ungültige Eingabe. Bitte erneut eingeben.");
            }
        } while (eingabeFalsch);

        // Eingabe der Zahlen & Berechnung der Summe
        for (int i = 0; i < 5; i++) {
            if (eingabeaufforderung) {
                System.out.print("Bitte gebe die " + (i+1) + ". Zahl ein: ");
            }
            summe += sc.nextInt();;
        }

        // Ausgabe der Summe
        System.out.println("Gesamtsumme: " + summe);

    }

}
