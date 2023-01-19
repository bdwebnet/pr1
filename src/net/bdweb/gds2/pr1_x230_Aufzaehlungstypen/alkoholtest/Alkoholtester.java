package net.bdweb.gds2.pr1_x230_Aufzaehlungstypen.alkoholtest;

public class Alkoholtester {

    public static void main ( String[] args ) {
        System.out.println("Alkoholgehalt von Bananensaft: "
                + Alkohol.BANANENSAFT.alkoholgehalt() + " %");

        System.out.println("BIERABBAU: "
                + Alkohol.BIER.abbauzeit(0.5, 80));

        Alkohol[] alkohol = Alkohol.values();

        for ( Alkohol a : alkohol ) {
            System.out.println("Alkoholgehalt von " + a + ": " + a.alkoholgehalt() + " % - " + a.abbauzeit(0.5, 80));
        }
    }

}
