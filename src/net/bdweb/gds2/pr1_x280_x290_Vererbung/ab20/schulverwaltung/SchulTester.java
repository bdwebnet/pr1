package net.bdweb.gds2.pr1_x280_x290_Vererbung.ab20.schulverwaltung;

import java.util.Scanner;

public class SchulTester {

    public static void main ( String[] args ) {

        System.out.println("Du baust eine Schule!");

        System.out.println("Erstelle einen Menschen:");
        System.out.print("Bitte gebe einen Namen ein: ");
        String name = getScannedString();
        System.out.print("Bitte gebe ein Alter ein: ");
        int alter = getScannedInt();
        Mensch deinMensch = new Mensch(name, alter);

        System.out.println("Erstelle einen Lehrer:");
        System.out.print("Bitte gebe einen Namen ein: ");
        name = getScannedString();
        System.out.print("Bitte gebe ein Alter ein: ");
        alter = getScannedInt();
        System.out.print("Bitte gebe ein Unterrichtsfach ein: ");
        String fach = getScannedString();
        Lehrer deinLehrer = new Lehrer(name, alter, fach);

        System.out.println("Erstelle einen Schüler:");
        System.out.print("Bitte gebe einen Namen ein: ");
        name = getScannedString();
        System.out.print("Bitte gebe ein Alter ein: ");
        alter = getScannedInt();
        System.out.print("Bitte gebe eine Klassenstufe ein: ");
        int stufe = getScannedInt();
        Schueler deinSchueler = new Schueler(name, alter, stufe);

    }

    public static int getScannedInt () {
        Scanner sc = new Scanner(System.in);
        int returnInt = sc.nextInt();
        sc.close();
        return returnInt;
    }

    public static String getScannedString () {
        Scanner sc = new Scanner(System.in);
        String returnString = sc.next();
        sc.close();
        return returnString;
    }

}
