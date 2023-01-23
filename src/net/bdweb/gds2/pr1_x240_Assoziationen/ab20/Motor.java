package net.bdweb.gds2.pr1_x240_Assoziationen.ab20;

public class Motor {

    private int leistung;
    private double hubraum;

    public Motor ( int pLeistung, double pHubraum ) {
        this.leistung = pLeistung;
        this.hubraum = pHubraum;
    }

    public int getLeistung () {
        return this.leistung;
    }

    public double getHubraum () {
        return this.hubraum;
    }

    public void gibInfo () {
        System.out.println("Motor: " + this.leistung + " PS, " + this.hubraum + " Liter");
    }

}
