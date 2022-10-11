package net.bdweb.gds2.pr1_70_80_90_schleifen.ab_15;

import java.util.Objects;
import java.util.Scanner;

public class a02 {

    public static void main(String[] args) {

        // Variablendeklaration & teilweise Initialisierung
        double sparrate;
        double zinssatz;

        String sparziel_typ;
        double sparziel_a_betrag = 0;
        double sparziel_b_jahre = 0;

        double sparbetrag_aktuell;
        double monat_aktuell = 1;

        boolean bedingung_check;

        Scanner sc = new Scanner(System.in);

        // Eingabe
        System.out.print("Bitte gebe deine monatliche Sparrate in Euro ein: ");
        sparrate = sc.nextDouble();

        System.out.print("Bitte gebe den Zinssatz in Prozent ein: ");
        zinssatz = sc.nextDouble();

        do {
            System.out.print("Bitte wähle einen Modus: Sparziel ist bestimmter Betrag (A) oder Sparziel ist Anzahl der Spar-Jahre (B). Deine Eingabe: ");
            sparziel_typ = sc.next();
        } while (!Objects.equals(sparziel_typ, "A") && !Objects.equals(sparziel_typ, "B"));

        if (Objects.equals(sparziel_typ, "A")) {
            System.out.print("Bitte gebe dein Sparziel (Betrag in €) ein: ");
            sparziel_a_betrag = sc.nextDouble();
        } else {
            System.out.print("Bitte gebe dein Sparziel (Jahre) ein: ");
            sparziel_b_jahre = sc.nextInt();
        }

        sparbetrag_aktuell = sparrate;

        // Verarbeitung & Ausgabe

        do {

            System.out.println("Du hast im " + monat_aktuell + ". Monat " + sparbetrag_aktuell + " € gespart.");

            sparbetrag_aktuell = sparbetrag_aktuell + sparbetrag_aktuell * (zinssatz / 100);

            monat_aktuell++;

            if (Objects.equals(sparziel_typ, "A")) {
                bedingung_check = sparbetrag_aktuell < sparziel_a_betrag;
            } else {
                bedingung_check = monat_aktuell / 12 < sparziel_b_jahre;
            }

        } while (bedingung_check);

        sc.close();

        System.out.println("Du hast insgesamt " + monat_aktuell + " Monat(e) bzw. " + monat_aktuell / 12 + " Jahr(e) gespart");

    }

}
