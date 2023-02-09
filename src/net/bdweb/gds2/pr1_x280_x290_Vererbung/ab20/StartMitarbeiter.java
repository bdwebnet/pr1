package net.bdweb.gds2.pr1_x280_x290_Vererbung.ab20;

public class StartMitarbeiter {

    public static void main ( String[] args ) {
        Mitarbeiter Wa = new Mitarbeiter("Wellstein", "Andreas", 1600);
        Mitarbeiter DIT = new Mitarbeiter("Dietrich", "Hans-Martin", 1650);
        Fuehrungskraft Krp = new Fuehrungskraft("Krappel", "Joachim", 4000);

        Auszubildender Sven = new Auszubildender("Vogel", "Sven", 100000, "Sohn", 20);

        System.out.println(Krp.position);
    }

}
