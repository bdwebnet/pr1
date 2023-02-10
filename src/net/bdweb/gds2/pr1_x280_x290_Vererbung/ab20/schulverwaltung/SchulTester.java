package net.bdweb.gds2.pr1_x280_x290_Vererbung.ab20.schulverwaltung;

import java.util.Scanner;

public class SchulTester {

    public static void main ( String[] args ) {

        System.out.println("Du baust eine Schule!");

        System.out.println("Erstelle einen Menschen:");
        String name = getName();
        int alter = getAlter();
        Mensch deinMensch = new Mensch(name, alter);

        System.out.println("Erstelle einen Lehrer:");
        name = getName();
        alter = getAlter();
        System.out.print("Bitte gebe ein Unterrichtsfach ein: ");
        String fach = getScannedString();
        Lehrer deinLehrer = new Lehrer(name, alter, fach);

        System.out.println("Erstelle einen Schüler:");
        name = getName();
        alter = getAlter();
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

    public static String getName () {
        System.out.print("Bitte gebe einen Namen ein: ");
        return getScannedString();
    }

    public static int getAlter () {
        System.out.print("Bitte gebe ein Alter ein: ");
        return getScannedInt();
    }

}
