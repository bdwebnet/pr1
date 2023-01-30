package net.bdweb.gds2.klausur_04.aufgabe01;

public class Kunde {

    private String name;
    private String adresse;

    public Kunde ( String name, String adresse ) {
        this.name = name;
        this.adresse = adresse;
    }

    public void aktualisieren ( String name, String adresse ) {
        this.name = name;
        this.adresse = adresse;
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public String getAdresse () {
        return adresse;
    }

    public void setAdresse ( String adresse ) {
        this.adresse = adresse;
    }

}
