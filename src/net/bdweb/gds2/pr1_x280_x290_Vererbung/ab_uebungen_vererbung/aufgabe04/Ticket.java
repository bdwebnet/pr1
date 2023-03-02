package net.bdweb.gds2.pr1_x280_x290_Vererbung.ab_uebungen_vererbung.aufgabe04;

public abstract class Ticket {

    private int preis;
    private boolean entwertet;

    public Ticket ( int preis ) {
        this.preis = preis;
        this.entwertet = false;
    }

    public int getPreis () {
        return preis;
    }

    public void entwerten () {
        entwertet = true;
    }

    public boolean istEntwertet () {
        return entwertet;
    }

    public abstract boolean gueltigInZone ( int zone );

}
