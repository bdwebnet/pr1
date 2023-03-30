package net.bdweb.gds2.pr1_x425_Aggregation_Komposition.ab30.a01;

public class Schweisser extends Werkzeug {

    public Schweisser ( String art, int verschleiss ) {
        super(art, verschleiss);
    }

    public void ausgeben () {
        System.out.println("Schweisser mit Verschleiss " + this.verschleiss + " %");
    }

}
