package net.bdweb.gds2.pr1_x190_strings_bearbeiten.ab20;

public class Aufgabe04 {

    public static String ErzeugeZufaelligesPasswort(int length) {
        String abc = "abcdefghijklmnopqrstuvwxyz";
        String zahlen = "1234567890";

        String auswahl = abc.concat(abc.toUpperCase()).concat(zahlen);

        String passwort = "";

        Random rand = new Random();

        for (int i = 0; i < length; i++) {

        }
    }

}
