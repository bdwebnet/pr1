package net.bdweb.gds2.pr1_x280_x290_Vererbung.ab_uebungen_vererbung.aufgabe03;

public class ZutatenBehaelter extends Behaelter {

    private Produkt bezeichner;

    public ZutatenBehaelter ( Produkt bezeichner, double fuellstand, double maxFuellstand ) {
        super(fuellstand, maxFuellstand);
        this.bezeichner = bezeichner;
    }

    @Override
    public String toString () {
        return null;
    }

    public void inhaltEntnehmen ( double menge ) {
        if ( this.fuellstand - menge < 0 ) {
            return;
        }

        this.fuellstand -= menge;
    }

    public void inhaltFuellen () {
        this.fuellstand = this.maxFuellstand;
    }

    public Produkt getBezeichner () {
        return this.bezeichner;
    }

    public void setBezeichner ( Produkt bezeichner ) {
        this.bezeichner = bezeichner;
    }

}
