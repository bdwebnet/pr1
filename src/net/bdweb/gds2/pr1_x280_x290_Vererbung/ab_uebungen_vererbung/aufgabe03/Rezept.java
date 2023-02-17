package net.bdweb.gds2.pr1_x280_x290_Vererbung.ab_uebungen_vererbung.aufgabe03;

public enum Rezept {

    KAFFEE_SCHWARZ("Kaffee schwarz", new Zutat[]{
            new Zutat(Produkt.WASSER, 0.2),
            new Zutat(Produkt.KAFFEE, 0.2),
    }), KAFFEE_ZUCKER("Kaffee Zucker", new Zutat[]{
            new Zutat(Produkt.WASSER, 0.2),
            new Zutat(Produkt.KAFFEE, 0.2),
            new Zutat(Produkt.ZUCKER, 0.2),
    }), KAFFEE_MILCH("Kaffee Milch", new Zutat[]{
            new Zutat(Produkt.WASSER, 0.2),
            new Zutat(Produkt.KAFFEE, 0.2),
            new Zutat(Produkt.MILCH, 0.2),
    }), KAFFEE_MILCH_ZUCKER("Kaffee Milch/Zucker", new Zutat[]{
            new Zutat(Produkt.WASSER, 0.2),
            new Zutat(Produkt.KAFFEE, 0.2),
            new Zutat(Produkt.ZUCKER, 0.2),
            new Zutat(Produkt.MILCH, 0.2),
    }), KAKAO("Kakao", new Zutat[]{
            new Zutat(Produkt.WASSER, 0.2),
            new Zutat(Produkt.KAKAO, 0.2),
            new Zutat(Produkt.ZUCKER, 0.2),
            new Zutat(Produkt.MILCH, 0.2),
    });

    private final Zutat[] zutaten;
    private final String bezeichnung;

    Rezept ( String bezeichnung, Zutat[] zutaten ) {
        this.zutaten = zutaten;
        this.bezeichnung = bezeichnung;
    }

    public Zutat[] getZutaten () {
        return this.zutaten;
    }

    public String getBezeichnung () {
        return bezeichnung;
    }
}
