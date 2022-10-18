package net.bdweb.gds2.pr1_70_80_90_schleifen.ab_15_gauss;

import java.util.Objects;
import java.util.Scanner;

public class a03 {

    public static void main(String[] args) {

        // INIT
        int N, helper = 1;
        String type;

        Scanner sc = new Scanner(System.in);

        // Eingabe
        System.out.print("Bitte gebe eine Ganzzahl ein, um deren Fakultät zu berechnen: ");
        N = sc.nextInt();

        System.out.print("Bitte wähle bei der Ausführung zwischen While (a), Do While (b), For (c): ");
        type = sc.next();

        if (N == 0) {
            System.out.println("0! = 1");
        } else {

            if (Objects.equals(type, "a")) {
                int i = 1;

                while (i <= N) {
                    helper *= i;

                    if (i < N) {
                        System.out.print(i + "*");
                    } else {
                        System.out.println(i + " = " + helper + " = " + N + "!");
                    }

                    i += 1;
                }
            } else if (Objects.equals(type, "b")) {
                int i = 0;

                do {
                    i += 1;
                    helper *= i;

                    if (i < N) {
                        System.out.print(i + "*");
                    } else {
                        System.out.println(i + " = " + helper + " = " + N + "!");
                    }
                } while (i < N);
            } else if (Objects.equals(type, "c")) {
                for (int i = 1; i <= N; i++) {
                    helper *= i;

                    if (i < N) {
                        System.out.print(i + "*");
                    } else {
                        System.out.println(i + " = " + helper + " = " + N + "!");
                    }
                }
            }

        }

        sc.close();

    }

}
