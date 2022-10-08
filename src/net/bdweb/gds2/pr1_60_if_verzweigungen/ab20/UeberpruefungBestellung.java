package net.bdweb.gds2.pr1_60_if_verzweigungen.ab20;

import java.util.Scanner;

public class UeberpruefungBestellung {

    public static final int preis_schraube = 5;
    public static final int preis_mutter = 3;
    public static final int preis_scheibe = 1;

    public static void main(String[] args) {

        // Variablendeklaration
        int anzahl_schrauben = 0;
        int anzahl_muttern = 0;
        int anzahl_scheiben = 0;

        int gesamtbetrag = 0;

        // Eingabe
        Scanner sc = new Scanner(System.in);

        System.out.print("Wie viele Schrauben zum Preis von " + preis_schraube + " ct moechtest du kaufen? ");
        anzahl_schrauben = sc.nextInt();

        System.out.print("Wie viele Muttern zum Preis von " + preis_mutter + " ct moechtest du kaufen? ");
        anzahl_muttern = sc.nextInt();

        System.out.print("Wie viele Unterlegscheiben zum Preis von " + preis_scheibe + " ct moechtest du kaufen? ");
        anzahl_scheiben = sc.nextInt();

        // Verarbeitung
        gesamtbetrag = anzahl_schrauben * preis_schraube + anzahl_muttern * preis_mutter + anzahl_scheiben * preis_scheibe;

        // Ausgabe
        if (anzahl_schrauben > anzahl_muttern) {
            System.out.println("Kontrollieren Sie Ihre Bestellung!");
        } else {
            System.out.println("Die Bestellung ist okay.");
        }

        System.out.println("Der Gesamtbetrag betraegt " + gesamtbetrag + " ct.");
    }

}
