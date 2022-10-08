package net.bdweb.gds2.pr1_60_if_verzweigungen.ab20;

import java.util.Scanner;

public class Versorgungsspannung {

    public static final double min_spannung = 4.3;
    public static final double max_spannung = 5.3;

    public static void main(String[] args) {

        // Variablendeklaration
        double aktuelle_spannung = 0.0;

        // Eingabe
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte gebe die aktuell anleigende Spannung ein: ");
        aktuelle_spannung = sc.nextDouble();

        // Verarbeitung & Ausgabe
        if (aktuelle_spannung >= min_spannung && aktuelle_spannung <= max_spannung) {
            System.out.println("Die Spannung ist OK.");
        } else {
            System.out.println("Die Spannung ist gefaehrlich.");
        }

    }

}
