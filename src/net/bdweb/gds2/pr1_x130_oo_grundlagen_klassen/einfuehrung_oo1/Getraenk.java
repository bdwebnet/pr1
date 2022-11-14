package net.bdweb.gds2.pr1_x130_oo_grundlagen_klassen.einfuehrung_oo1;

public class Getraenk {

    // Instanzvariablen
    String name;
    double hoechstbestand;
    double bestand;
    double mindestbestand;
    double preis;

    public double berechneBestellmenge()
    {
        double bestellmenge = 0.0;

        if (bestand < mindestbestand) {
            bestellmenge = hoechstbestand - bestand;
        }

        return bestellmenge;
    }

}
