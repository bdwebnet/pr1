package net.bdweb.gds2.pr1_60_if_verzweigungen.ab20;

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
