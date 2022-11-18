package net.bdweb.gds2.pr1_x130_oo_grundlagen_klassen.ab_20_adv_gmbh;

public class Artikel {

    private String artikelnr;
    private String bezeichnung;
    private double preis;
    private int bestand;

    public String getArtikelnr() {
        return artikelnr;
    }

    public void setArtikelnr(String pArtikelnr) {
        this.artikelnr = pArtikelnr;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String pBezeichnung) {
        this.bezeichnung = pBezeichnung;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double pPreis) {
        this.preis = pPreis;
    }

    public int getBestand() {
        return bestand;
    }

    public void aendern(int pStueck) {
        // Kurzschreibweise: this.bestand += pStueck;
        this.bestand = this.bestand + pStueck;
    }

}
