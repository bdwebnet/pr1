package net.bdweb.gds2.ab4;

import java.util.Scanner;

public class Discountpreise {

    public static final double rabatt = 0.2;
    public static final int discountbedingung = 5000;

    public static void main(String[] args) {

        int gesamtbetrag = 0; // wird in Cent eingegeben
        double discountpreis = 0.0;

        // Eingabe
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte gebe einen Gesamtbetrag in Cent ein: ");
        gesamtbetrag = sc.nextInt();

        // Verarbeitung
        if (gesamtbetrag > discountbedingung) {
            discountpreis = gesamtbetrag * (1 - rabatt);
            System.out.println("Dir wurde ein Rabatt gewährt.");
        } else {
            discountpreis = gesamtbetrag;
        }

        System.out.println("Der Gesamtpreis beträgt " + discountpreis);

    }

}
