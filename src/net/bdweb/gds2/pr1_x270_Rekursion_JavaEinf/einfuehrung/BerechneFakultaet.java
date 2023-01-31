package net.bdweb.gds2.pr1_x270_Rekursion_JavaEinf.einfuehrung;

import java.util.Scanner;

public class BerechneFakultaet {

    public static void main ( String[] args ) {
        // INIT
        int fakultaetOut = 0;
        System.out.println("Eingabe: ");
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        fakultaetOut = fakBerechnung(i);

        sc.close();
    }

    private static int fakBerechnung ( int i ) {
        if ( i == 1 ) {
            return 1;
        } else {
            return i * fakBerechnung(i - 1);
        }
    }

}
