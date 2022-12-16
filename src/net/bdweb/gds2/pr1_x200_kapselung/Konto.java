package net.bdweb.gds2.pr1_x200_kapselung;

public class Konto {

    public static int kontoCounter = 0;
    private int kontonummer;
    private double kontostand;
    private double kreditlimit;

    public Konto() {
        // Baustelle
    }

    public Konto(double kontostand, double kreditlimit) {
        kontoCounter++; // entspricht kontoCounter = kontoCounter + 1;
        this.kontostand = kontostand;
        this.kreditlimit = kreditlimit;
        this.kontonummer = kontoCounter + 10000;
    }

    public int getKontonummer() {
        return kontonummer;
    }

    public void setKontonummer(int kontonummer) {
        this.kontonummer = kontonummer;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void setKontostand(double kontostand) {
        this.kontostand = kontostand;
    }

    public double getKreditlimit() {
        return kreditlimit;
    }

    public void setKreditlimit(double kreditlimit) {
        this.kreditlimit = kreditlimit;
    }
}
