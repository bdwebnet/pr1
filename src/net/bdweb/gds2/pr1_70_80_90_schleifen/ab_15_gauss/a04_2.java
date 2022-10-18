package net.bdweb.gds2.pr1_70_80_90_schleifen.ab_15_gauss;

import java.util.Scanner;

public class a04_2 {

    public static void main(String[] args) {

        // Variablendeklaration
        int input;
        Scanner sc = new Scanner(System.in);

        // Eingabe
        System.out.print("Bitte gebe eine Ganzzahl ein: ");
        input = sc.nextInt();

        // Verarbeitung
        if (input % 2 != 0) {
            input -= 1;
        }

        // Ausgabe
        for (int i = input; i >= 2; i-=2) {
            if (i != 2) {
                System.out.print(i + ", ");
            } else {
                System.out.println(i);
            }
        }

        // Scanner schließen
        sc.close();

    }

}
