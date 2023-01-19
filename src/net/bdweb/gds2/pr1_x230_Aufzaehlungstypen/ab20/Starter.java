package net.bdweb.gds2.pr1_x230_Aufzaehlungstypen.ab20;

public class Starter {

    public static void main ( String[] args ) {
        Weekday day = Weekday.FRIDAY;

        if ( day == Weekday.FRIDAY ) {
            System.out.println("Hurray it is Friday!");
        }

        Farbe farbe = Farbe.ROT;

        switch ( farbe ) {
            case ROT -> System.out.println("Ein Mann sieht rot.");
            case BLAU -> System.out.println("Ein Mann sieht blau und ist schlau.");
            default -> System.out.println("Ein Mann sieht nix.");
        }

        System.out.println(Materials.DRY);
    }

}
