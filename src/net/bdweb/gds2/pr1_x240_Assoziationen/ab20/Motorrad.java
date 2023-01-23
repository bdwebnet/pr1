package net.bdweb.gds2.pr1_x240_Assoziationen.ab20;

public class Motorrad {

    private Motor meinMotor;
    private Reifen[] meineReifen;

    public Motorrad ( Motor pMotor, Reifen pVorne, Reifen pHinten ) {
        this.meinMotor = pMotor;

        this.meineReifen = new Reifen[2];
        this.meineReifen[0] = pVorne;
        this.meineReifen[1] = pHinten;
    }

    public Motor getMotor () {
        return this.meinMotor;
    }

    public Reifen getVorderreifen () {
        return this.meineReifen[0];
    }

    public Reifen getHinterreifen () {
        return this.meineReifen[1];
    }

}
