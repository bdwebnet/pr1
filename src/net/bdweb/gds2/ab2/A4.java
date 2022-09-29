package net.bdweb.gds2.ab2;

import java.util.Scanner;

public class A4 {

    public static void main(String[] args) {

        // Scanner anlegen
        Scanner sc = new Scanner(System.in);

        // Aufforderung zum Inhalt eingeben
        System.out.print("Welchen ganzzahligen Geldbetrag in Euro möchtest du abheben? ");

        // Überprüfen, ob Eingabe Int ist
        if (sc.hasNextInt()) {
            // Input einlesen
            int geldbetrag = sc.nextInt();

            // Zahl ausgeben
            System.out.println("Vielen Dank. Du möchtest " + geldbetrag + " € abheben. Die Auszahlung wird verarbeitet.");

            int rest;

            int fuenf = 0;
            int zehn = 0;
            int zwanzig = 0;
            int fuenzig = 0;

            rest = geldbetrag % 50;
            fuenzig = ( geldbetrag - rest ) / 50;
            geldbetrag = rest;

            rest = geldbetrag % 20;
            zwanzig = ( geldbetrag - rest ) / 20;
            geldbetrag = rest;

            rest = geldbetrag % 10;
            zehn = ( geldbetrag - rest ) / 10;
            geldbetrag = rest;

            rest = geldbetrag % 5;
            fuenf = ( geldbetrag - rest ) / 5;
            geldbetrag = rest;

            System.out.println("");

            System.out.println("Du bekommst ...");

            System.out.println("... " + fuenf + "x 5 €" + " = " + fuenf * 5 + " €");
            System.out.println("... " + zehn + "x 10 €" + " = " + zehn * 10 + " €");
            System.out.println("... " + zwanzig + "x 20 €" + " = " + zwanzig * 20 + " €");
            System.out.println("... " + fuenzig + "x 50 €" + " = " + fuenzig * 50 + " €");

            if (rest > 0) {
                System.out.println("");
                System.out.println("Es bleibt ein Rest von " + rest + " €.");
            }
        } else {
            // Fehler ausgeben, dass Eingabe kein int ist
            System.out.println("Du hast keinen gültigen Betrag eingegeben.");
        }

        // Scanner schließen
        sc.close();

    }

}
