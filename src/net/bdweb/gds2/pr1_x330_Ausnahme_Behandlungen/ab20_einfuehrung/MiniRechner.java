package net.bdweb.gds2.pr1_x330_Ausnahme_Behandlungen.ab20_einfuehrung;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MiniRechner {

    public static void main ( String[] args ) { // Deklaration
        int zaehler, nenner, divison;

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Division zweier int-Zahlen");
            System.out.println("**********************");

            System.out.println("Bitte geben Sie den Zähler ein: ");
            zaehler = sc.nextInt();

            System.out.println("Bitte geben Sie den Nenner ein: ");
            nenner = sc.nextInt();

            divison = zaehler / nenner;

            System.out.println("Ergebnis aus " + zaehler + " / " + nenner + " = " + divison);

        } catch ( InputMismatchException ex ) {
            System.out.println("Bitte nur ganze Zahlen eingeben!");
            System.out.println("Name: " + ex.getClass().getName());
        } catch ( ArithmeticException ey ) {
            System.out.println(ey.getMessage());
        } catch ( Exception e ) {
            e.printStackTrace();
        }

        sc.close();

    }

}
