package net.bdweb.gds2.pr1_x280_x290_Vererbung.ab20_override;

public class GiroKonto extends Bankkonto {

    private double gebuehr;

    public GiroKonto ( double anfangsBetrag, double gebuehr ) {
        super(anfangsBetrag);
        this.gebuehr = gebuehr;
    }

    public void einzahlen ( double x ) {
        this.kontoStand = this.kontoStand + x - gebuehr;
    }

    public void abheben ( double x ) {
        this.kontoStand = this.kontoStand - x - gebuehr;
    }

}
