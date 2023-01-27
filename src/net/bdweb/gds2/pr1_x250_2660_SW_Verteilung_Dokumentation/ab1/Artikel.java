package net.bdweb.gds2.pr1_x250_2660_SW_Verteilung_Dokumentation.ab1;

/**
 * Artikel dienen zum Einlagern im Warehouse mit Preis und Artikelnummer.
 *
 * @author Andreas Wellstein
 * @version 4.0
 * @see Lager
 * @since 3.0
 */

public class Artikel {

    /**
     * Der aktuelle Mehrwertsteuersatz.
     * Er liegt zurzeit bei {@value}.
     *
     * @since 1.0
     */
    private static final double mehrwertsteuer = 0.21;

    private String artikelname;

    /**
     * Liefert den Namen eines Artikels zurück
     *
     * @return Name des Artikels
     */
    public String getArtikelname () {
        return artikelname;
    }

    /**
     * Setzen eines neuen Artikelnamens
     *
     * @param artikelname Zeichenkette die den Namen des Artikels übergibt
     */
    public void setArtikelname ( String artikelname ) {
        this.artikelname = artikelname;
    }

}
