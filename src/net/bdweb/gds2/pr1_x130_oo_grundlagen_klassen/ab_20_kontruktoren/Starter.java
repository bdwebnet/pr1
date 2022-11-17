package net.bdweb.gds2.pr1_x130_oo_grundlagen_klassen.ab_20_kontruktoren;

public class Starter {

    public static void main(String[] args) {

        Getraenk bier = new Getraenk();
        bier.setName("Tannenzäpfle");
        /*bier.bestand = 3.0;
        bier.hoechstbestand = 100.0;
        bier.mindestbestand = 25.0;*/

        System.out.println(bier.getName());

        System.out.println(bier.berechneBestellmenge());

        Getraenk wasser = new Getraenk("Krasseswasser", 13.92);

    }

}
