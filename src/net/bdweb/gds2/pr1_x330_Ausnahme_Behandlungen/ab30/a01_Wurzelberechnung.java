package net.bdweb.gds2.pr1_x330_Ausnahme_Behandlungen.ab30;

public class a01_Wurzelberechnung {

    public static void main ( String[] args ) {
        try {
            System.out.println(a01_Wurzelberechnung.berechneWurzel(4));
            System.out.println(a01_Wurzelberechnung.berechneWurzel(-4));
        } catch ( Exception e ) {
            System.out.println(e.getMessage());
        }
    }

    public static double berechneWurzel ( double zahl ) {
        if ( zahl < 0 ) {
            throw new IllegalArgumentException("Die Zahl darf nicht kleiner als 0 sein");
        }

        return Math.sqrt(zahl);
    }

}
