package net.bdweb.gds2.pr1_x200_kapselung;

import java.text.DecimalFormat;

public class BadStart {

    public static void main ( String[] args ) {

        DecimalFormat moneyFormat = new DecimalFormat("#.00 €");

        Konto lisasKonto = new Konto(12000, 300);
        Konto jessisKonto = new Konto(10000, 300);
        Konto waffelbroederKonto = new Konto(100000, 12000);

        System.out.println("Lisas Kontonummer:\t" + lisasKonto.getKontonummer());
        System.out.println("Lisas Kontostand:\t" + moneyFormat.format(lisasKonto.getKontostand()));

        System.out.println();

        System.out.println("Jessicas Kontonummer:\t" + jessisKonto.getKontonummer());
        System.out.println("Jessicas Kontostand:\t" + moneyFormat.format(jessisKonto.getKontostand()));

        System.out.println();

        System.out.println("KontoCounter:\t\t\t" + Konto.kontoCounter);

        jessisKonto.abheben(500);

    }

}
