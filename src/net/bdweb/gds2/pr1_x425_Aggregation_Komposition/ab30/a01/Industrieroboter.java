package net.bdweb.gds2.pr1_x425_Aggregation_Komposition.ab30.a01;

public class Industrieroboter {

    private static final int maxAnzWerkzeuge = 10;

    private Werkzeug[] werkzeugKasten = new Werkzeug[maxAnzWerkzeuge];

    public static void Industrieroboter () {
    }

    public boolean werkzeugHinzufuegen ( int platz, Werkzeug neu ) {
        if ( platz < 0 || platz >= maxAnzWerkzeuge ) {
            System.out.println("Hinzufügen nicht möglich, da Platz " + platz + " nicht existiert.");
            return false;
        } else if ( this.werkzeugKasten[platz] != null ) {
            System.out.println("Hinzufügen nicht möglich, da Platz " + platz + " belegt ist.");
            return false;
        }

        this.werkzeugKasten[platz] = neu;

        System.out.println("Hinzugefügtes Werkzeug auf Platz " + platz + ":");
        neu.ausgeben();

        return true;
    }

    public boolean werkzeugEntfernen ( int platz ) {
        if ( platz < 0 || platz >= maxAnzWerkzeuge ) {
            System.out.println("Entfernen nicht möglich, da Platz " + platz + " nicht existiert.");
            return false;
        } else if ( this.werkzeugKasten[platz] == null ) {
            System.out.println("Entfernen nicht möglich, da Platz " + platz + " nicht belegt ist.");
            return false;
        }

        Werkzeug entfernt = this.werkzeugKasten[platz];

        this.werkzeugKasten[platz] = null;

        System.out.println("Werkzeug auf Platz " + platz + " entfernt.");
        entfernt.ausgeben();

        return true;
    }

}
