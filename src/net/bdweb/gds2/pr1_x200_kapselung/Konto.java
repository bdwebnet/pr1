package net.bdweb.gds2.pr1_x200_kapselung;

public class Konto {

    private int kontonummer;
    private double kontostand;
    private double kreditlimit;

    public Konto(int kontonummer) {
        this.kontonummer = kontonummer;
    }

    public int getKontonummer() {
        return kontonummer;
    }

    public double getKontostand() {
        return kontostand;
    }

    public double getKreditlimit() {
        return kreditlimit;
    }

    public void abheben(double betrag) {

    }

}
