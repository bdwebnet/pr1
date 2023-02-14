package net.bdweb.gds2.pr1_x280_x290_Vererbung.ab20_override;

public class SparKonto extends Bankkonto {

    private double zinsSatz;

    public SparKonto ( double anfangsBetrag, double zinsSatz ) {
        super(anfangsBetrag);
        this.zinsSatz = zinsSatz;
    }

    public void zinsenAnrechnen () {
        this.kontoStand = this.kontoStand * ( 1 + this.zinsSatz );
    }

}
