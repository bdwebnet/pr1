package net.bdweb.gds2.pr1_x280_x290_Vererbung.ab20;

public class Auszubildender extends Mitarbeiter {

    private String ausbildungsberuf;
    private int ausbildungsjahr;

    public Auszubildender ( String name, String vorname, double gehalt, String ausbildungsberuf, int ausbildungsjahr ) {
        super(name, vorname, gehalt);
        this.ausbildungsberuf = ausbildungsberuf;
        this.ausbildungsjahr = ausbildungsjahr;
    }

    public String getAusbildungsberuf () {
        return ausbildungsberuf;
    }

    public void setAusbildungsberuf ( String ausbildungsberuf ) {
        this.ausbildungsberuf = ausbildungsberuf;
    }

    public int getAusbildungsjahr () {
        return ausbildungsjahr;
    }

    public void setAusbildungsjahr ( int ausbildungsjahr ) {
        this.ausbildungsjahr = ausbildungsjahr;
    }

}
