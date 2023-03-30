package net.bdweb.gds2.pr1_x425_Aggregation_Komposition.ab30.a01;

public abstract class Werkzeug {

    protected int verschleiss = 0;
    private String art;

    public Werkzeug ( String art, int verschleiss ) {
        this.art = art;

        if ( verschleiss < 0 )
            verschleiss = 0;
        else if ( verschleiss > 100 )
            verschleiss = 100;

        this.verschleiss = verschleiss;
    }

    public abstract void ausgeben ();

}
