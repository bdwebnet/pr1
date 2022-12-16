package net.bdweb.gds2.pr1_x200_kapselung;

public class Konto {

    public static int kontoCounter = 0;
    private int kontonummer;
    private double kontostand;
    private double kreditlimit;

    public Konto(double kontostand, double kreditlimit) {
        kontoCounter++; // entspricht kontoCounter = kontoCounter + 1;
        this.kontostand = kontostand;
        this.kreditlimit = kreditlimit;
        this.kontonummer = kontoCounter + 10000;
    }

}
