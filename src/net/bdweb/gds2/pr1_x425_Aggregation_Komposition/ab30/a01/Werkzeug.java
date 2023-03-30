package net.bdweb.gds2.pr1_x425_Aggregation_Komposition.ab30.a01;

public class Werkzeug {

    protected int verschleiss = 0;
    private String art;

    public Werkzeug ( String art, int verschleiss ) {
        this.art = art;
        this.verschleiss = verschleiss;
    }

    public void ausgeben () {
        System.out.println("Werkzeug: " + this.art + " mit Verschleiss " + this.verschleiss);
    }

}
