package net.bdweb.gds2.pr1_x190_strings_bearbeiten.ab20;

import java.util.Random;

public class Aufgabe04 {

    public static String ErzeugeZufaelligesPasswort(int length) {
        String auswahl = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        String passwort = "";

        Random rand = new Random();

        if (length >= 5) {
            for (int i = 0; i < length; i++) {
                int zufaelligeZahl = rand.nextInt(auswahl.length());
                char neuesZeichen = auswahl.charAt(zufaelligeZahl);

                passwort = passwort.concat(String.valueOf(neuesZeichen));
            }
        } else {
            return "Error: Passwortlänge kleiner als 5! Das Passwort muss aus mindestens fünf Zeichen bestehen.";
        }

        return passwort;
    }

    public static void main(String[] args) {
        System.out.println(ErzeugeZufaelligesPasswort(10));
    }

}
