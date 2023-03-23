package net.bdweb.gds2.pr1_x340_Java_Generics.ab20_einfuehrung;

public class TypCastExample1 {

    public static void main ( String[] args ) {

        // Code-Schnippsel 1 - zuerst ausprobieren
        Object o = "Eine Zeichenkette";
        String s = ( String ) o;
        System.out.println(s);

        // Code-Schnippsel 2 - danach ausprobieren
        o = Integer.valueOf(42);
        s = ( String ) o;
        System.out.println(s);
        
    }

}
