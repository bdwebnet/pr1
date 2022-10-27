package net.bdweb.gds2.pr1_x100_arrays.ab_20;

import java.util.Scanner;

public class a01 {

    public static void main(String[] args) {

        // INIT
        int [] eingegebene_zahlen = new int[10];

        Scanner sc = new Scanner(System.in);

        // Eingabe
        for (int i = 0; i < eingegebene_zahlen.length; i++) {
            do {
                System.out.print("Bitte gebe eine Zahl ein: ");
                eingegebene_zahlen[i] = sc.nextInt();
            } while (eingegebene_zahlen[i] < 0 || eingegebene_zahlen[i] > 100);
        }

        // Ausgabe
        for (int i = 0; i < eingegebene_zahlen.length; i++) {
            System.out.println("Index: " + i + ",\tInhalt: " + eingegebene_zahlen[i]);
        }

    }

}
