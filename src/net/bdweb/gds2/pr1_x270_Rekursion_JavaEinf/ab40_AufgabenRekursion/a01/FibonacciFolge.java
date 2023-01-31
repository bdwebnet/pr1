package net.bdweb.gds2.pr1_x270_Rekursion_JavaEinf.ab40_AufgabenRekursion.a01;

import java.util.Scanner;

public class FibonacciFolge {

    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Von welcher Zahl möchtest du die Fibonacci-Zahl? ");
        System.out.println("Die Fibnonacci-Zahl lautet: " + fibonacci(scanner.nextInt()));

        scanner.close();
    }

    private static int fibonacci ( int n ) {
        if ( n == 0 || n == 1 ) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}
