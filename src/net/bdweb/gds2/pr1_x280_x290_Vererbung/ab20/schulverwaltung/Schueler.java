package net.bdweb.gds2.pr1_x280_x290_Vererbung.ab20.schulverwaltung;

public class Schueler extends Mensch {

    private final int jahresbeitragsfaktor = 5;
    private int klassenstufe;

    public Schueler ( String name, int alter, int klassenstufe ) {
        super(name, alter);
        this.klassenstufe = klassenstufe;
    }

    public int getKlassenstufe () {
        return klassenstufe;
    }

    public void setKlassenstufe ( int klassenstufe ) {
        this.klassenstufe = klassenstufe;
    }

    public double jaehrlicherBeitrag () {
        return ( double ) this.alter / ( double ) this.klassenstufe * ( double ) this.jahresbeitragsfaktor;
    }

}
