/**
 * Bankkonto (abstrakt)
 *
 * @author BD
 * @version 1.0
 */

package net.bdweb.gds2.pr1_x280_x290_Vererbung.ab20_override;

public abstract class Bankkonto {

    /**
     * Kontostand
     *
     * @since 1.0
     */
    protected double kontoStand;

    /**
     * Bankkonto-Konstruktor
     *
     * @param anfangsBetrag Initialer Kontostand
     * @since 1.0
     */
    public Bankkonto ( double anfangsBetrag ) {
        this.kontoStand = anfangsBetrag;
    }

    /**
     * Aktuellen Kontostand erhalten
     *
     * @return kontoStand
     * @since 1.0
     */
    public double getKontoStand () {
        return this.kontoStand;
    }

    /**
     * Methode zum Geld-Einzahlen (abstrakt)
     *
     * @param x Einzahlungsbetrag
     * @since 1.0
     */
    public abstract void einzahlen ( double x );

    /**
     * Methode zum Geld-Abheben (abstrakt)
     *
     * @param x Abhebungsbetrag
     * @since 1.0
     */
    public abstract void abheben ( double x );

}
