package net.bdweb.gds2.pr1_x280_x290_Vererbung.ab30.a09_rechnung;

public class RabattierteRechnung extends Rechnung {

    private double rabatt;

    public RabattierteRechnung ( double rabatt, double gesamtbetrag, double mehrwertsteuer ) {
        super(gesamtbetrag, mehrwertsteuer);
        this.rabatt = rabatt;
    }

    @Override
    protected double bruttobetragBerechnen () {
        return this.gesamtbetrag + ( this.gesamtbetrag - this.rabatt ) * 0.19;
    }

}
