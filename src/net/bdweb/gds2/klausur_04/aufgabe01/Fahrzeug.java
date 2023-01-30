package net.bdweb.gds2.klausur_04.aufgabe01;

public class Fahrzeug {

    private String marke;
    private String modell;
    private Kunde ausleihenderKunde;

    public Fahrzeug () {
    }

    public Fahrzeug ( String modell ) {
        this.modell = modell;
    }

    public Fahrzeug ( String marke, String modell ) {
        this.marke = marke;
        this.modell = modell;
    }

    public String getMarke () {
        return marke;
    }

    public void setMarke ( String marke ) {
        this.marke = marke;
    }

    public String getModell () {
        return modell;
    }

    public void setModell ( String modell ) {
        this.modell = modell;
    }

    public Kunde getAusleihenderKunde () {
        return ausleihenderKunde;
    }

    public void setAusleihenderKunde ( Kunde ausleihenderKunde ) {
        this.ausleihenderKunde = ausleihenderKunde;
    }

}
