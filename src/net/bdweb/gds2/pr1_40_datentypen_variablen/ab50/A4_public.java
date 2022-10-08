package net.bdweb.gds2.pr1_40_datentypen_variablen.ab50;

import java.util.Scanner;

public class A4_public {

    final static public int fuenfzig = 50;
    final static public int zwanzig = 20;
    final static public int zehn = 10;
    final static public int fuenf = 5;

    public static void main(String[] args) {
        // INIT
        int anzahl = 0;
        int betrag = 0;
        int rest = 0;

        // Eingabe
        Scanner sc = new Scanner(System.in);
        System.out.println("Wie viel Geld moechten Sie abheben?");
        betrag = sc.nextInt();

        // Verarbeitung

        // Ermittlung der 50-Euro-Scheine
        anzahl = betrag / fuenfzig;
        System.out.println(anzahl + " x 50 Euro");
        rest = betrag % fuenfzig;

        // Ermittlung der 20-Euro-Scheine
        anzahl = rest / zwanzig;
        System.out.println(anzahl + " x 20 Euro");
        rest = rest % zwanzig;

        // Ermittlung der 10-Euro-Scheine
        anzahl = rest / zehn;
        System.out.println(anzahl + " x 10 Euro");
        rest = rest % zehn;

        // Ermittlung der 5-Euro-Scheine
        anzahl = rest / fuenf;
        System.out.println(anzahl + " x 5 Euro");

    }
}
