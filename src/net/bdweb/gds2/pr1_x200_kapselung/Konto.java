package net.bdweb.gds2.pr1_x200_kapselung;

import java.text.DecimalFormat;

public class Konto {

    public static int kontoCounter = 0;
    private int kontonummer;
    private double kontostand;
    private double kreditlimit;

    public Konto () {
        // Baustelle
    }

    public Konto ( double kontostand, double kreditlimit ) {
        kontoCounter++; // entspricht kontoCounter = kontoCounter + 1;
        this.kontostand = kontostand;
        this.kreditlimit = kreditlimit;
        this.kontonummer = kontoCounter + 10000;
    }

    public int getKontonummer () {
        return kontonummer;
    }

    public void setKontonummer ( int kontonummer ) {
        this.kontonummer = kontonummer;
    }

    public double getKontostand () {
        return kontostand;
    }

    public void setKontostand ( double kontostand ) {
        this.kontostand = kontostand;
    }

    public double getKreditlimit () {
        return kreditlimit;
    }

    public void setKreditlimit ( double kreditlimit ) {
        this.kreditlimit = kreditlimit;
    }

    public void abheben ( double betrag ) {
        DecimalFormat df = new DecimalFormat("#.00 €");

        if ( ( this.kontostand + this.kreditlimit - betrag ) >= 0 ) {
            this.kontostand = this.kontostand - betrag;
            System.out.println("Die Abhebung war erfolgreich.");
            System.out.println("Ihr neuer Kontostand beträgt " + df.format(this.kontostand));
        } else {
            System.out.println("Die Auszahlung ist nicht möglich.");
            System.out.println("Ihr Kontostand:\t\t" + df.format(this.getKontostand()));
            System.out.println("Ihr Kreditlimit:\t" + df.format(this.getKreditlimit()));
        }
    }

}
