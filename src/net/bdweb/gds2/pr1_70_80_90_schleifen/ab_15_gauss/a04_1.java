package net.bdweb.gds2.pr1_70_80_90_schleifen.ab_15_gauss;

import java.util.Scanner;

public class a04_1 {

    public static void main(String[] args) {

        // Variablendeklaration
        int input;
        Scanner sc = new Scanner(System.in);

        // Eingabe
        System.out.print("Bitte gebe eine Ganzzahl ein: ");
        input = sc.nextInt();

        // Ausgabe
        for (int i = 1; i <= input; i++) {
            if (i != input) {
                System.out.print(i + ", ");
            } else {
                System.out.println(i);
            }
        }

        // Scanner schließen
        sc.close();

    }

}
