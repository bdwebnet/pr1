package net.bdweb.gds2.ab4;

import java.util.Scanner;

public class GeradeUngerade {

    public static void main(String[] args) {

        // Variablendeklaration
        int zahl = 0;

        // Eingabe
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte gebe eine Zahl ein: ");
        zahl = sc.nextInt();

        // Verarbeitung & Ausgabe
        if (zahl % 2 == 0) {
            System.out.println("Die Zahl ist Gerade!");
        } else {
            System.out.println("Die Zahl ist Ungerade!");
        }

    }

}
