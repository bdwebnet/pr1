package net.bdweb.gds2.klausur_04.aufgabe01;

public class Autovermietung {

    Fahrzeug[] fahrzeuge;

    public Autovermietung ( Fahrzeug[] fahrzeuge ) {
        this.fahrzeuge = fahrzeuge;
    }

    public Fahrzeug[] getFahrzeuge () {
        return fahrzeuge;
    }

    public Fahrzeug[] getFahrzeuge ( int[] posInFahrzeugArray ) {
        Fahrzeug[] result = new Fahrzeug[posInFahrzeugArray.length];
        for ( int i = 0; i < posInFahrzeugArray.length; i++ ) {
            result[i] = fahrzeuge[posInFahrzeugArray[i]];
        }
        return result;
    }

    public Fahrzeug getFahrzeug ( int posInFahrzeugArray ) {
        return fahrzeuge[posInFahrzeugArray];
    }

}
