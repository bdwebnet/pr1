package net.bdweb.gds2.pr1_x280_x290_Vererbung.interfaces.ab_uebungen.a02;

public class NuetzlicheFunktionen {

    // liefert ein "kleinstes" (auf der Basis der
    // Vergleichbar-Implementierung!) Element des Parameter-Arrays
    // Achtung: Man kann davon ausgehen, dass das Parameter-Array
    // mindestens 1 Element enthaelt
    public static Vergleichbar kleinstesElement ( Vergleichbar[] elemente ) {
        int n = elemente.length;

        Vergleichbar temp;

        for ( int i = 0; i < n; i++ ) {
            for ( int j = 1; j < ( n - i ); j++ ) {
                if ( elemente[j].vergleichenMit(elemente[j - 1]) == -1 ) {
                    //swap elements
                    temp = elemente[j - 1];
                    elemente[j - 1] = elemente[j];
                    elemente[j] = temp;
                }
            }
        }

        return elemente[0];
    }

}
