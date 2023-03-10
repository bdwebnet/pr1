package net.bdweb.gds2.pr1_x280_x290_Vererbung.interfaces.ab_uebungen.a02;

public class Starter {

    public static void main ( String[] args ) {

        VInteger[] ints = new VInteger[]{
                new VInteger(1),
                new VInteger(7),
                new VInteger(9),
                new VInteger(100),
                new VInteger(3),
                new VInteger(6),
                new VInteger(8),
                new VInteger(9),
        };

        System.out.println(NuetzlicheFunktionen.kleinstesElement(ints).getWert());

    }

}
