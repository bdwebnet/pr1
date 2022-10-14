package net.bdweb.gds2.pr1_70_80_90_schleifen.ab_15_gauss;

import java.util.Scanner;

public class a03 {

    public static void main(String[] args) {

        // INIT
        int N, helper = 0;
        String type;

        Scanner sc = new Scanner(System.in);

        // Eingabe
        System.out.print("Bitte gebe eine Ganzzahl ein, um deren Fakultät zu berechnen: ");
        N = sc.nextInt();

        System.out.println("Bitte wähle bei der Ausführung zwischen While (a), Do While (b), For (c)");
        type = sc.next();

        if (N == 0) {
            System.out.println("0! = 1");
        } /*else {

            if (type == "a") {
                while (helper)
            }

        }*/

    }

}
