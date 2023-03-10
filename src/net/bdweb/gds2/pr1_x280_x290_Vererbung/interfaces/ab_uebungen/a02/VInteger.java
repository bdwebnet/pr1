package net.bdweb.gds2.pr1_x280_x290_Vererbung.interfaces.ab_uebungen.a02;

public class VInteger extends Integer implements Vergleichbar {

    public VInteger ( int wert ) {
        super(wert);
    }

    @Override
    public int vergleichenMit ( Vergleichbar obj ) {
        // return java.lang.Integer.compare(this.getWert(), obj.getWert());

        if ( obj.getWert() > this.getWert() ) {
            return -1;
        } else if ( this.getWert() > obj.getWert() ) {
            return 1;
        } else {
            return 0;
        }
    }

}
