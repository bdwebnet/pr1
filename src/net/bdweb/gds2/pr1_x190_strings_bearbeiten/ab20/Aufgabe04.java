package net.bdweb.gds2.pr1_x190_strings_bearbeiten.ab20;

import java.util.Random;

public class Aufgabe04 {

    public static String ErzeugeZufaelligesPasswort(int length) {
        String abc = "abcdefghijklmnopqrstuvwxyz";
        String zahlen = "1234567890";

        String auswahl = abc.concat(abc.toUpperCase()).concat(zahlen);

        String passwort = "";

        Random rand = new Random();

        if (length > 5) {
            for (int i = 0; i < length; i++) {
                char neuesZeichen = auswahl.toCharArray()[rand.nextInt(auswahl.length())];

                passwort = passwort.concat(String.valueOf(neuesZeichen));
            }
        } else {
            return "Bitte gebe eine Länge größer als 5 an.";
        }

        return passwort;
    }

    public static void main(String[] args) {
        System.out.println(ErzeugeZufaelligesPasswort(10));
    }

}
