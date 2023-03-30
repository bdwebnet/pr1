package net.bdweb.gds2.pr1_x425_Aggregation_Komposition.ab30.a01;

public class Bohrer extends Werkzeug {

    private int groesse;

    public Bohrer ( String art, int verschleiss, int groesse ) {
        super(art, verschleiss);
        this.groesse = groesse;
    }

    public void ausgeben () {
        System.out.println("Bohrer mit Groesse " + this.groesse + " (Verschleiss: " + this.verschleiss + " %)");
    }

}
