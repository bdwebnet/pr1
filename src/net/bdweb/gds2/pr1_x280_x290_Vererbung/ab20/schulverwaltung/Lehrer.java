package net.bdweb.gds2.pr1_x280_x290_Vererbung.ab20.schulverwaltung;

public class Lehrer extends Mensch {

    private String unterrichtsfach;

    public Lehrer ( String name, int alter, String unterrichtsfach ) {
        super(name, alter);
        this.unterrichtsfach = unterrichtsfach;
    }

    public String getUnterrichtsfach () {
        return unterrichtsfach;
    }

    public void setUnterrichtsfach ( String unterrichtsfach ) {
        this.unterrichtsfach = unterrichtsfach;
    }

}
