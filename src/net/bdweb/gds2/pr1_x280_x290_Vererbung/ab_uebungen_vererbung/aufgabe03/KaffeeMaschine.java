package net.bdweb.gds2.pr1_x280_x290_Vererbung.ab_uebungen_vererbung.aufgabe03;

public class KaffeeMaschine {

    private ZutatenBehaelter[] zutatenBehaelter;
    private Rezept[] rezepte;
    private AbfallBehaelter abfallBehaelter;

    public KaffeeMaschine () {

        this.initRezepte();
        this.initZutatenBehaelter();

        this.abfallBehaelter = new AbfallBehaelter(1, 1);

        boolean abbruch = false;

        while ( !abbruch ) {

            System.out.println("Bitte wählen Sie ein Rezept aus:");

            for ( int i = 0; i < this.rezepte.length; i++ ) {
                System.out.println(( i + 1 ) + ". " + this.rezepte[i].getBezeichnung());
            }

            System.out.println("0. Abbruch");

            int auswahl = new java.util.Scanner(System.in).nextInt();

            if ( auswahl == 0 ) {
                abbruch = true;
            } else if ( auswahl > 0 && auswahl <= this.rezepte.length ) {
                this.getraenkErstellen(this.rezepte[auswahl - 1]);
            } else {
                System.out.println("Ungültige Auswahl!");
            }

        }

    }

    private void initRezepte () {

        this.rezepte = new Rezept[]{
                Rezept.KAFFEE_SCHWARZ,
                Rezept.KAFFEE_ZUCKER,
                Rezept.KAFFEE_MILCH,
                Rezept.KAFFEE_MILCH_ZUCKER,
                Rezept.KAKAO
        };

    }

    private void initZutatenBehaelter () {

        this.zutatenBehaelter = new ZutatenBehaelter[]{
                new ZutatenBehaelter(Produkt.WASSER, 1, 1),
                new ZutatenBehaelter(Produkt.KAFFEE, 1, 1),
                new ZutatenBehaelter(Produkt.KAKAO, 1, 1),
                new ZutatenBehaelter(Produkt.ZUCKER, 1, 1),
                new ZutatenBehaelter(Produkt.MILCH, 1, 1),
        };

    }

    public boolean zutatenBehaelterFuellen ( Produkt produkt ) {

        for ( ZutatenBehaelter zb : this.zutatenBehaelter ) {
            if ( zb.getBezeichner().equals(produkt) ) {
                zb.inhaltFuellen();
                return true;
            }
        }

        return false;

    }

    public Rezept[] getRezepte () {
        return this.rezepte;
    }

    public Rezept hasRezept ( Rezept rezept ) {

        for ( Rezept r : this.rezepte ) {
            if ( r.equals(rezept) ) {
                return r;
            }
        }

        return null;

    }

    public void getraenkErstellen ( Rezept rezept ) {

        if ( this.hasRezept(rezept) != null ) {
            for ( Zutat z : rezept.getZutaten() ) {
                for ( ZutatenBehaelter zb : this.zutatenBehaelter ) {
                    if ( zb.getBezeichner().equals(z.getProdukt()) ) {
                        zb.inhaltEntnehmen(z.getMenge());
                    }

                    if ( z.getProdukt().equals(Produkt.KAFFEE) ) {
                        this.abfallBehaelter.behaelterNachfuellen(z.getMenge());
                    }
                }
            }
        }

    }

}
