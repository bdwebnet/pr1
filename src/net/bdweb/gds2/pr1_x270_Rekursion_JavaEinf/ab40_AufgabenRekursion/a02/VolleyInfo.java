package net.bdweb.gds2.pr1_x270_Rekursion_JavaEinf.ab40_AufgabenRekursion.a02;

public class VolleyInfo {

    public static void main ( String[] args ) {
        String[] spielerinnen = { "Gerta", "Marta", "Maria", "Emilia", "Julia", "Qyunh", "Monika", "Frau8", "Frau9", "Frau10", "Frau11", "Frau12", "Frau13" };
        telefonalarm(spielerinnen);
    }

    private static void telefonalarm ( String[] spielerinnen ) {
        if ( spielerinnen.length == 1 ) {
            System.out.println("Telefonanruf an " + spielerinnen[0]);
        } else {
            int length = spielerinnen.length;

            int haelfte = length / 2;

            String[] spielerinnen1 = new String[haelfte];
            for ( int i = 0; i < spielerinnen1.length; i++ ) {
                spielerinnen1[i] = spielerinnen[i];
            }

            String[] spielerinnen2 = new String[length - haelfte];
            for ( int i = 0; i < spielerinnen2.length; i++ ) {
                spielerinnen2[i] = spielerinnen[i + haelfte];
            }

            telefonalarm(spielerinnen1);
            telefonalarm(spielerinnen2);
        }
    }

}
