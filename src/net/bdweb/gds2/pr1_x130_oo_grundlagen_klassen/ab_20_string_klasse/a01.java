package net.bdweb.gds2.pr1_x130_oo_grundlagen_klassen.ab_20_string_klasse;

public class a01 {

    public static void main(String[] args) {

        // Deklarierung
        String str1, str2, str3, str4;
        int anzahl = 0;

        // Initialisierung
        str1 = "Bo, die Katze";
        str2 = "Bo, die Katze";

        str3 = new String("Fred, der Hund");
        str4 = new String("Fred, der Hund");

        // Überprüfung von str1 und str2
        if (str1 == str2) {
            anzahl += 1;
            System.out.println("str1 und str2 sind gleich.");
        } else {
            anzahl += 2;
            System.out.println("str1 und str2 sind ungleich.");
        }

        // Überprüfung von str3 und str4
        if (str3 == str4) {
            anzahl += 1;
            System.out.println("str3 und str4 sind gleich.");
        } else {
            anzahl += 2;
            System.out.println("str3 und str4 sind ungleich.");
        }

        // Ausgabe der Anzahl der erzeugten Objekte
        System.out.println("Es wurden " + anzahl + " Objekte erzeugt.");

    }

}
