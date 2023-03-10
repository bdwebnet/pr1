package net.bdweb.gds2.pr1_x280_x290_Vererbung.interfaces.ab_uebungen.a02;

public interface Vergleichbar {

    /*
     * vergleicht das aufgerufene Objekt mit dem als Parameter uebergebenen * Objekt;
     * liefert: -1 falls das aufgerufene Objekt kleiner ist als das * Parameterobjekt 0
     * falls beide Objekte gleich gross sind 1 falls das * aufgerufene Objekt groesser ist als das Parameterobj.
     */
    int vergleichenMit ( Vergleichbar obj );

    int getWert ();

}
