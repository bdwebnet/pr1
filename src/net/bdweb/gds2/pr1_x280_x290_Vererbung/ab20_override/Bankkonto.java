package net.bdweb.gds2.pr1_x280_x290_Vererbung.ab20_override;

public class Bankkonto {

    protected double kontoStand;

    public Bankkonto ( double anfangsBetrag ) {
        this.kontoStand = anfangsBetrag;
    }

    public double getKontoStand () {
        return this.kontoStand;
    }

    public void einzahlen ( double x ) {
        this.kontoStand += x;
    }

    public void abheben ( double x ) {
        this.kontoStand -= x;
    }

}
