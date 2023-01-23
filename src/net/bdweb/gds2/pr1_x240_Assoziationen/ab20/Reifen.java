package net.bdweb.gds2.pr1_x240_Assoziationen.ab20;

public class Reifen {

    private double durchmesser;
    private double profiltiefe;
    private String jahreszeit;

    public Reifen ( double pDurchmesser, double pProfiltiefe, String pJahreszeit ) {
        this.durchmesser = pDurchmesser;
        this.profiltiefe = pProfiltiefe;
        this.jahreszeit = pJahreszeit;
    }

    public double getDurchmesser () {
        return durchmesser;
    }

    public double getProfiltiefe () {
        return profiltiefe;
    }

    public String getJahreszeit () {
        return jahreszeit;
    }

    public void gibInfo () {
        System.out.println("Reifen: " + this.durchmesser + " Zoll, " + this.profiltiefe + " mm, " + this.jahreszeit);
    }

}
