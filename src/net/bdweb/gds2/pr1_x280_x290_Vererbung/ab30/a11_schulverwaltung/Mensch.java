package net.bdweb.gds2.pr1_x280_x290_Vererbung.ab30.a11_schulverwaltung;

public class Mensch {

    protected String name;
    protected int alter;

    public Mensch ( String name, int alter ) {
        this.name = name;
        this.alter = alter;
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public int getAlter () {
        return alter;
    }

    public void setAlter ( int alter ) {
        this.alter = alter;
    }

}
