package net.bdweb.gds2.ab1;

import java.util.Formatter;
import java.util.Scanner;

public class Biertank {

    final static public double preis = 13.20; // Preis pro Liter

    public static void main(String[] args) {
        // INIT
        double dm = 0, hf = 0; // Durchmesser, Füllhöhe
        double volumen = 0, gesamtpreis = 0;

        // Eingabe
        Scanner sc = new Scanner(System.in);

        System.out.print("Bitte gebe den Tank-Durchmesser in Dezimeter ein: ");
        dm = sc.nextDouble();

        System.out.print("Bitte gebe die Füllhöhe des Tanks in Dezimeter ein: ");
        hf = sc.nextDouble();

        sc.close(); // Scanner schließen
        
        // Verarbeitung

        volumen = Math.PI * Math.pow(dm / 2, 2) * hf;
        System.out.println("Das Volumen des Tank beträgt " + Math.round(volumen) + " l.");

        gesamtpreis = volumen * preis;
        System.out.println("Daraus ergibt sich ein Gesamtpreis von " + Math.round(gesamtpreis) + " € für eine ganze Tankfüllung.");
    }

}
