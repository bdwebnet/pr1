package net.bdweb.gds2.pr1_x330_Ausnahme_Behandlungen.ab30;

import java.util.Scanner;

public class a03_MNF {

    public static void main ( String[] args ) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bitte gebe die erste Zahl ein: ");
        double a = sc.nextDouble();

        System.out.print("Bitte gebe die zweite Zahl ein: ");
        double b = sc.nextDouble();

        System.out.print("Bitte gebe die dritte Zahl ein: ");
        double c = sc.nextDouble();

        try {
            double[] ergebnis = berechneMNF(a, b, c);
            System.out.println("Ergebnis: " + ergebnis[0] + " und " + ergebnis[1]);
        } catch ( Exception e ) {
            System.out.println(e.getMessage());
        }
    }

    static double[] berechneMNF ( double a, double b, double c ) throws Exception {
        if ( a == 0 ) {
            throw new Exception("Die erste Zahl darf nicht 0 sein");
        } else if ( b * b - 4 * a * c < 0 ) {
            throw new Exception("Die Wurzel darf nicht kleiner als 0 sein");
        }

        double[] ergebnis = new double[2];

        double wurzel = a01_Wurzelberechnung.berechneWurzel(b * b - 4 * a * c);
        
        ergebnis[0] = ( -b + wurzel ) / ( 2 * a );
        ergebnis[1] = ( -b - wurzel ) / ( 2 * a );

        return ergebnis;
    }

}
