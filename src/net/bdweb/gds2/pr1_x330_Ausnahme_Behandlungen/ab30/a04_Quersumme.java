package net.bdweb.gds2.pr1_x330_Ausnahme_Behandlungen.ab30;

public class a04_Quersumme {

    public static void main ( String[] args ) {
        
    }

    public static int berechneQuersumme ( int zahl ) {
        if ( zahl < 0 ) throw new IllegalArgumentException("Deine Zahl muss größer als 0 sein");
        int quersumme = 0;
        while ( zahl > 0 ) {
            quersumme += zahl % 10;
            zahl /= 10;
        }
        return quersumme;
    }

}
