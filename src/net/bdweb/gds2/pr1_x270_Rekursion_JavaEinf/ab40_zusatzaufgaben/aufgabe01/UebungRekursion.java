package net.bdweb.gds2.pr1_x270_Rekursion_JavaEinf.ab40_zusatzaufgaben.aufgabe01;

import java.text.DecimalFormat;

public class UebungRekursion {

    public static void main ( String[] args ) {
        DecimalFormat df = new DecimalFormat("0.00");

        // Erster Tag: n = 0
        System.out.println(df.format(medikamentenmenge(4)));
    }

    public static double medikamentenmenge ( int n ) {
        if ( n == 0 ) {
            return 5.0;
        }
        return 0.6 * medikamentenmenge(n - 1) + 5;
    }

}
