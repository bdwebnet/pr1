package net.bdweb.gds2.pr1_x280_x290_Vererbung.ab20;

public class Mitarbeiter {

    protected String name;
    protected String vorname;
    protected double gehalt;

    public Mitarbeiter () {
    }

    public Mitarbeiter ( String name, String vorname, double gehalt ) {
        this.name = name;
        this.vorname = vorname;
        this.gehalt = gehalt;
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public String getVorname () {
        return vorname;
    }

    public void setVorname ( String vorname ) {
        this.vorname = vorname;
    }

    public double getGehalt () {
        return gehalt;
    }

    public void setGehalt ( double gehalt ) {
        this.gehalt = gehalt;
    }

    public void gehaltErhoehen ( double betrag ) {
        this.gehalt += betrag;
    }

}
