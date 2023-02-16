/**
 * Girokonto
 *
 * @author BD
 * @version 1.0
 * @see Bankkonto
 */

package net.bdweb.gds2.pr1_x280_x290_Vererbung.ab20_override;

public class GiroKonto extends Bankkonto {

    /**
     * Transaktionsgebühr
     *
     * @since 1.0
     */
    private double gebuehr;

    /**
     * Girokonto-Konstruktor
     *
     * @param anfangsBetrag Initialer Kontostand
     * @param gebuehr       Transaktionsgebühr
     * @since 1.0
     */
    public GiroKonto ( double anfangsBetrag, double gebuehr ) {
        super(anfangsBetrag);
        this.gebuehr = gebuehr;
    }

    /**
     * Methode zum Geld-Einzahlen (berücksichtigt Transaktionsgebühr)
     *
     * @param x Einzahlungsbetrag
     */
    @Override
    public void einzahlen ( double x ) {
        this.kontoStand = this.kontoStand + x - gebuehr;
    }

    /**
     * Methode zum Geld-Abheben (berücksichtigt Transaktionsgebühr)
     *
     * @param x Abhebungsbetrag
     * @since 1.0
     */
    @Override
    public void abheben ( double x ) {
        this.kontoStand = this.kontoStand - x - gebuehr;
    }

}
