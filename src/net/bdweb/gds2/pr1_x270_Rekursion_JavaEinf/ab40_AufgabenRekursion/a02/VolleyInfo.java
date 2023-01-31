package net.bdweb.gds2.pr1_x270_Rekursion_JavaEinf.ab40_AufgabenRekursion.a02;

public class VolleyInfo {

    public static void main ( String[] args ) {
        String[] spielerinnen = { "Gerta", "Marta", "Maria", "Emilia", "Julia", "Qyunh", "Monika", "Frau8", "Frau9", "Frau10", "Frau11", "Frau12" };
        telefonalarm(spielerinnen);
    }

    private static void telefonalarm ( String[] spielerinnen ) {
        if ( spielerinnen.length == 1 ) {
            System.out.println("Telefonanruf an " + spielerinnen[0]);
        } else {
            int length = spielerinnen.length;

            int haelfte = length / 2;

            String[] spielerinnen1 = new String[haelfte];
            System.arraycopy(spielerinnen, 0, spielerinnen1, 0, haelfte);

            String[] spielerinnen2 = new String[length - haelfte];
            System.arraycopy(spielerinnen, haelfte, spielerinnen2, 0, spielerinnen2.length);

            telefonalarm(spielerinnen1);
            telefonalarm(spielerinnen2);
        }
    }

}
