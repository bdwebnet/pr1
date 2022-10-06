package net.bdweb.gds2.ab4;

import java.util.Scanner;

public class Heizung {

    public static final int heiztemperatur = 20;

    public static void main(String[] args) {

        // Variablendeklaration
        int raumtemperatur = 0;

        // Eingabe
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte gebe die Raumtemperatur ein: ");
        raumtemperatur = sc.nextInt();

        // Ausgabe
        if (raumtemperatur < heiztemperatur) {
            System.out.println("Die Heizung heizt!");
        } else {
            System.out.println("Die Heizung heizt nicht!");
        }

    }

}
