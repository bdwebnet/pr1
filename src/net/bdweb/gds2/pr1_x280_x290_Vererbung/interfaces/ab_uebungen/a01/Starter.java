package net.bdweb.gds2.pr1_x280_x290_Vererbung.interfaces.ab_uebungen.a01;

public class Starter {

    public static void main ( String[] args ) {

        Person p1 = new Person("Muster", "Max");

        DasFuenfte tv1 = new DasFuenfte("Das 5. TV");

        tv1.anmelden(p1);
        tv1.sendeNachricht("Das Fünfte ist kaputt.");

        System.out.println("Test");

    }

}
