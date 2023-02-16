/**
 * Sparkonto
 *
 * @author BD
 * @version 1.0
 * @see Bankkonto
 */

package net.bdweb.gds2.pr1_x280_x290_Vererbung.ab20_override;

public class SparKonto extends Bankkonto {

    /**
     * Zinssatz
     *
     * @since 1.0
     */
    private double zinsSatz;

    /**
     * Sparkonto-Konstruktor
     *
     * @param anfangsBetrag Initialer Kontostand
     * @param zinsSatz      Zinssatz p.a., um den sich der Kontostand jährlich vermehrt
     * @since 1.0
     */
    public SparKonto ( double anfangsBetrag, double zinsSatz ) {
        super(anfangsBetrag);
        this.zinsSatz = zinsSatz;
    }

    /**
     * Zinsen auf Kontostand anrechnen
     *
     * @since 1.0
     */
    public void zinsenAnrechnen () {
        this.kontoStand = this.kontoStand * ( 1 + this.zinsSatz );
    }

}
