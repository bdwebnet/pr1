package net.bdweb.gds2.pr1_x330_Ausnahme_Behandlungen.ab30;

import java.util.Scanner;

public class a02_BMI {

    public static void main ( String[] args ) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Bitte gebe dein Gewicht ein: ");
            double gewicht = sc.nextDouble();

            System.out.print("Bitte gebe deine Körpergröße ein: ");
            double koerpergroesse = sc.nextDouble();

            System.out.println(berechneBMI(gewicht, koerpergroesse));
        } catch ( Exception e ) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }

    static double berechneBMI ( double gewicht, double groesse ) throws Exception {
        if ( groesse <= 0 || groesse > 3 ) throw new Exception("Die Körpergröße ist nicht möglich");
        if ( gewicht <= 0 || gewicht > 500 ) throw new Exception("Das Gewicht ist nicht möglich");
        return gewicht / ( groesse * groesse );
    }

}
