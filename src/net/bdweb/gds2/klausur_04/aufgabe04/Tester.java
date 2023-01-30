package net.bdweb.gds2.klausur_04.aufgabe04;

public class Tester {

    public static void main ( String[] args ) {
        for ( Wochentag tag : Wochentag.values() ) {
            System.out.println(tag + " ist " + ( tag.isWerktag() ? "" : "kein " ) + "Werktag");
        }
    }

}
