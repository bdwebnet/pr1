package net.bdweb.gds2.pr1_x3000_ausnahmen;

import java.util.Scanner;

public class AusnahmeStarter {

    public static void main ( String[] args ) {

        try {
            // Deklaration
            int zaehler, nenner, divison;

            Scanner sc = new Scanner(System.in);

            System.out.println("Division zweier int-Zahlen");
            System.out.println("**********************");
            System.out.println("Bitte geben Sie den Zähler ein: ");
            zaehler = sc.nextInt();
            System.out.println("Bitte geben Sie den Nenner ein: ");
            nenner = sc.nextInt();
            divison = zaehler / nenner;
            System.out.println("Ergebnis aus " + zaehler + " / " + nenner + " = " + divison);
            sc.close();
        } catch ( Exception e ) {
            System.out.println(e);
        }

    }

}
