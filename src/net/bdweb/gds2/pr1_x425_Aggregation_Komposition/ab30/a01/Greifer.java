package net.bdweb.gds2.pr1_x425_Aggregation_Komposition.ab30.a01;

public class Greifer extends Werkzeug {

    public Greifer ( String art, int verschleiss ) {
        super(art, verschleiss);
    }

    public void ausgeben () {
        System.out.println("Greifer mit Verschleiss " + this.verschleiss + " %");
    }

}
