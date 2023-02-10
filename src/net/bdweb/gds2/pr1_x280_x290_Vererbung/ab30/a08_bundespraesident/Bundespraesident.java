package net.bdweb.gds2.pr1_x280_x290_Vererbung.ab30.a08_bundespraesident;

public class Bundespraesident extends Kunde {

    private int rabattProzent;

    public Bundespraesident ( String name, int rabattProzent ) {
        super(name);
        this.rabattProzent = rabattProzent;
    }

}
