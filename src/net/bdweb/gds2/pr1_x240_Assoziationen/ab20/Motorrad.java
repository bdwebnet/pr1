package net.bdweb.gds2.pr1_x240_Assoziationen.ab20;

public class Motorrad {

    private Motor meinMotor;
    private Reifen[] meineReifen = new Reifen[2];

    public Motorrad ( Motor pMotor, Reifen pVorne, Reifen pHinten ) {
        this.meinMotor = pMotor;

        this.meineReifen[0] = pVorne;
        this.meineReifen[1] = pHinten;
    }

    public Motor getMotor () {
        return this.meinMotor;
    }

    public Reifen getVorderreifen () {
        return this.meineReifen[0]; // meineReifen[0] ist der Vorderreifen
    }

    public Reifen getHinterreifen () {
        return this.meineReifen[1]; // meineReifen[1] ist der Vorderreifen
    }

    public void gibInfo () {
        System.out.println("Motorrad:");
        this.getMotor().gibInfo();
        this.getVorderreifen().gibInfo();
        this.getHinterreifen().gibInfo();
    }

}
