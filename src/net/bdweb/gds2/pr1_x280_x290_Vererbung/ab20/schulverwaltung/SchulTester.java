package net.bdweb.gds2.pr1_x280_x290_Vererbung.ab20.schulverwaltung;

import java.util.Scanner;

public class SchulTester {

    public static void main ( String[] args ) {

        System.out.println("Du baust eine Schule!");

        System.out.println("Erstelle einen Menschen:");
        String name = getScannedString("Bitte gebe einen Namen ein: ");
        int alter = getScannedInt("Bitte gebe ein Alter ein: ");
        Mensch deinMensch = new Mensch(name, alter);

        System.out.println("Erstelle einen Lehrer:");
        name = getScannedString("Bitte gebe einen Namen ein: ");
        alter = getScannedInt("Bitte gebe ein Alter ein: ");
        String fach = getScannedString("Bitte gebe ein Unterrichtsfach ein: ");
        Lehrer deinLehrer = new Lehrer(name, alter, fach);

        System.out.println("Erstelle einen Schüler:");
        name = getScannedString("Bitte gebe einen Namen ein: ");
        alter = getScannedInt("Bitte gebe ein Alter ein: ");
        int stufe = getScannedInt("Bitte gebe eine Klassenstufe ein: ");
        Schueler deinSchueler = new Schueler(name, alter, stufe);

    }

    public static int getScannedInt ( String question ) {
        Scanner sc = new Scanner(System.in);
        System.out.print(question);
        int returnInt = sc.nextInt();
        sc.close();
        return returnInt;
    }

    public static String getScannedString ( String question ) {
        Scanner sc = new Scanner(System.in);
        System.out.print(question);
        String returnString = sc.next();
        sc.close();
        return returnString;
    }

}
