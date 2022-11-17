package net.bdweb.gds2.pr1_x130_oo_grundlagen_klassen.einfuehrung_oo1;

public class Starter {

    public static void main(String[] args) {

        Getraenk bier = new Getraenk();
        bier.name = "Tannenzäpfle";
        bier.bestand = 3.0;
        bier.hoechstbestand = 100.0;
        bier.mindestbestand = 25.0;

        System.out.println(bier.berechneBestellmenge());

        Auto jaguarAndi = new Auto(4, "schwarz");

    }

}
