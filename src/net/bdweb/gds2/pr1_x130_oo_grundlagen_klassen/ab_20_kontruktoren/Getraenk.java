package net.bdweb.gds2.pr1_x130_oo_grundlagen_klassen.ab_20_kontruktoren;

public class Getraenk {

    // Instanzvariablen
    private String name;
    private double hoechstbestand;
    private double bestand;
    private double mindestbestand;
    private double preis;

    public Getraenk() {
    }

    public Getraenk(String name, double preis) {
        this.name = name;
        this.preis = preis;
    }

    public double berechneBestellmenge()
    {
        double bestellmenge = 0.0;

        if (bestand < mindestbestand) {
            bestellmenge = hoechstbestand - bestand;
        }

        return bestellmenge;
    }

    public double getHoechstbestand() {
        return hoechstbestand;
    }

    public void setHoechstbestand(double hoechstbestand) {
        this.hoechstbestand = hoechstbestand;
    }

    public double getBestand() {
        return bestand;
    }

    public void setBestand(double bestand) {
        this.bestand = bestand;
    }

    public double getMindestbestand() {
        return mindestbestand;
    }

    public void setMindestbestand(double mindestbestand) {
        this.mindestbestand = mindestbestand;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
