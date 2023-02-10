package net.bdweb.gds2.pr1_x280_x290_Vererbung.ab30.a09_rechnung;

public class Rechnung {

    protected double gesamtbetrag;
    protected double mehrwertsteuer;

    public Rechnung ( double gesamtbetrag, double mehrwertsteuer ) {
        this.gesamtbetrag = gesamtbetrag;
        this.mehrwertsteuer = mehrwertsteuer;
    }

    protected double bruttobetragBerechnen () {
        return gesamtbetrag + gesamtbetrag * 0.19;
    }

}
