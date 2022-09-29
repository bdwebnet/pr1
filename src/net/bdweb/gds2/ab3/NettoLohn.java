package net.bdweb.gds2.ab3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class NettoLohn {

    public static final double ls = 0.2; // Lohnsteuer
    public static final double sb = 0.04; // Solidaritätsbeitrag
    public static final double rv = 0.0975; // Rentenversicherung
    public static final double kv = 0.073; // Krankenversicherung
    public static final double av = 0.0325; // Arbeitslosenversicherung
    public static final double pv = 0.008; // Pflegeversicherung

    public static void main(String[] args) {
        // INIT
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        double bg = 0.0; // Brutto-Gehalt

        double lsb = 0.0; // Lohnsteuer Betrag
        double sbb = 0.0; // Solidaritätsbeitrag Betrag
        double rvb = 0.0; // Rentenversicherung Betrag
        double kvb = 0.0; // Krankenversicherung Betrag
        double avb = 0.0; // Arbeitslosenversicherung Betrag
        double pvb = 0.0; // Pflegeversicherung Betrag
        double sa = 0.0; // Summe der Abzüge
        double ng = 0.0; // Netto-Gehalt

        // Infos
        System.out.println("--------------------------------------------------------------");
        System.out.println("Dieses Programm berechnet das Netto-Gehalt abhängig vom eingegebenen Bruttogehalt.");
        System.out.println("");
        System.out.println("Angenommene Prozentsätze");
        System.out.println("Lohnsteuer:\t\t\t\t\t" + df.format(ls*100) + " %.");
        System.out.println("Solidaritätsbeitrag:\t\t" + df.format(sb*100) + " %.");
        System.out.println("Rentenversicherung:\t\t\t" + df.format(rv*100) + " %.");
        System.out.println("Krankenversicherung:\t\t" + df.format(kv*100) + " %.");
        System.out.println("Arbeitslosenversicherung:\t" + df.format(av*100) + " %.");
        System.out.println("Pflegeversicherung:\t\t\t" + df.format(pv*100) + " %.");

        System.out.println("");
        System.out.println("--------------------------------------------------------------");
        System.out.println("");

        // Eingabe
        System.out.println("Hiermit wird Ihr Netto-Einkommen berechnet.");
        System.out.print("Bitte geben Sie Ihr monatliches Brutto-Gehalt ein: ");
        bg = sc.nextDouble();

        // Verarbeitung
        lsb = ls * bg;
        sbb = sb * lsb;
        rvb = rv * bg;
        kvb = kv * bg;
        avb = av * bg;
        pvb = pv * bg;
        sa = lsb + sbb + rvb + kvb + avb + pvb;
        ng = bg - sa;

        // Ausgabe
        System.out.println("");
        System.out.println("--------------------------------------------------------------");

        System.out.println("Brutto-Gehalt: € " + bg);
        System.out.println("--------------------------------------------------------------");
        System.out.println("Abzüge");
        System.out.println("Lohnsteuer:\t\t\t\t\t€ " + df.format(lsb));
        System.out.println("Solidaritätsbeitrag:\t\t€ " + df.format(sbb));
        System.out.println("Rentenversicherung:\t\t\t€ " + df.format(rvb));
        System.out.println("Krankenversicherung:\t\t€ " + df.format(kvb));
        System.out.println("Arbeitslosenversicherung:\t€ " + df.format(avb));
        System.out.println("Pflegeversicherung:\t\t\t€ " + df.format(pvb));
        System.out.println("--------------------------------------------------------------");
        System.out.println("Summe Abzüge:\t\t\t\t€ " + df.format(sa));
        System.out.println("--------------------------------------------------------------");
        System.out.println("Netto-Gehalt:\t\t\t\t€ " + df.format(ng));
        System.out.println("--------------------------------------------------------------");
    }

}
