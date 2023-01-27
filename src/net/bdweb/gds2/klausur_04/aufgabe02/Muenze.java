package net.bdweb.gds2.klausur_04.aufgabe02;

public enum Muenze {
    EinCent(1), ZweiCent(2), FuenfCent(5), ZehnCent(10), ZwanzigCent(20), FuenfzigCent(50), EinEuro(100), ZweiEuro(200);

    private final int wertInCent;

    Muenze ( int wertInCent ) {
        this.wertInCent = wertInCent;
    }

    public double getWertInEuro () {
        return ( double ) wertInCent / ( double ) 100;
    }
}
