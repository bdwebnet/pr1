package net.bdweb.gds2.pr1_x280_x290_Vererbung.ab20.schulverwaltung;

import java.util.Scanner;

public class SchulTester {

    public static void main ( String[] args ) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Du baust eine Schule!");

        System.out.println("Erstelle einen Menschen:");
        String name = getScannedString(sc, "Bitte gebe einen Namen ein: ");
        int alter = getScannedInt(sc, "Bitte gebe ein Alter ein: ");
        Mensch deinMensch = new Mensch(name, alter);

        System.out.println("Erstelle einen Lehrer:");
        name = getScannedString(sc, "Bitte gebe einen Namen ein: ");
        alter = getScannedInt(sc, "Bitte gebe ein Alter ein: ");
        String fach = getScannedString(sc, "Bitte gebe ein Unterrichtsfach ein: ");
        Lehrer deinLehrer = new Lehrer(name, alter, fach);

        System.out.println("Erstelle einen Schüler:");
        name = getScannedString(sc, "Bitte gebe einen Namen ein: ");
        alter = getScannedInt(sc, "Bitte gebe ein Alter ein: ");
        int stufe = getScannedInt(sc, "Bitte gebe eine Klassenstufe ein: ");
        Schueler deinSchueler = new Schueler(name, alter, stufe);

        sc.close();

    }

    public static int getScannedInt ( Scanner sc, String question ) {
        System.out.print(question);
        int returnInt = sc.nextInt();
        return returnInt;
    }

    public static String getScannedString ( Scanner sc, String question ) {
        System.out.print(question);
        String returnString = sc.next();
        return returnString;
    }

}
