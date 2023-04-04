package net.bdweb.gds2.pr1_x430_Collection_Classes.s200_ab30;

import java.util.HashMap;

public class KFZMapping {

    private static HashMap<String, String> map = new HashMap<String, String>();

    public static void main ( String[] args ) {

        insert("S", "Stuttgart");
        insert("S", "Kaiserslautern");
        insert("A", "Augsburg");
        insert("B", "Berlin");
        insert("ES", "Esslingen");
        insert("BB", "Böblingen");

        printLandkreis("S");
        printLandkreis("A");
        printLandkreis("B");
        printLandkreis("ES");
        printLandkreis("BB");

        remove("S");

        printLandkreis("S");
        printLandkreis("A");
        printLandkreis("B");
        printLandkreis("ES");
        printLandkreis("BB");

        insert(null, "test");
        System.out.println("hier");
        printLandkreis(null);
    }

    public static void insert ( String kennzeichen, String landkreis ) {
        map.put(kennzeichen, landkreis);
    }

    public static void remove ( String kennzeichen ) {
        map.remove(kennzeichen);
    }

    public static void printLandkreis ( String kennzeichen ) {
        System.out.println(map.get(kennzeichen));
    }

}
