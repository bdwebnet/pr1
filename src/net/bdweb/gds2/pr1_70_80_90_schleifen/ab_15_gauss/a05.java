package net.bdweb.gds2.pr1_70_80_90_schleifen.ab_15_gauss;

import java.text.DecimalFormat;
import java.util.Scanner;

public class a05 {

    public static void main(String[] args) {

        // Variablendeklaration
        double k0, p;
        int n;

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(("#.00"));

        // Eingabe
        System.out.print("Bitte gebe ein Anfangskapital ein: ");
        k0 = sc.nextDouble();

        System.out.print("Bitte gebe den jährlichen Zinssatz in Prozent ein: ");
        p = sc.nextDouble();

        System.out.print("Bitte gebe die Laufzeit in Jahren ein: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // Ausgabe
            System.out.println("Kapital im " + i + ". Jahr: " + df.format( ( k0 * Math.pow(( (p/100) + 1 ), i) ) ) + " €" );
        }

        sc.close();

    }

}
