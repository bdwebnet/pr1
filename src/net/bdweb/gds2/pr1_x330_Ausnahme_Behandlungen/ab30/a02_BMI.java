package net.bdweb.gds2.pr1_x330_Ausnahme_Behandlungen.ab30;

import java.util.Scanner;

public class a02_BMI {

    public static void main ( String[] args ) {

        try ( Scanner sc = new Scanner(System.in) ) {
            System.out.print("Bitte gebe dein Gewicht ein: ");
            double gewicht = sc.nextDouble();

            System.out.print("Bitte gebe deine Körpergröße ein: ");
            double koerpergroesse = sc.nextDouble();

            System.out.println(berechneBMI(gewicht, koerpergroesse));
        } catch ( IllegalArgumentException e ) {
            System.out.println(e.getMessage());
        } catch ( Exception e ) {
            System.out.println("Es ist ein Fehler aufgetreten");
        } finally {
            System.out.println("Danke für die Nutzung");
        }
    }

    static double berechneBMI ( double gewicht, double groesse ) throws IllegalArgumentException {
        if ( groesse <= 0 || groesse > 3 ) throw new IllegalArgumentException("Die Körpergröße ist nicht möglich");
        if ( gewicht <= 0 || gewicht > 500 ) throw new IllegalArgumentException("Das Gewicht ist nicht möglich");
        return gewicht / ( groesse * groesse );
    }

}
