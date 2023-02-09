package net.bdweb.gds2.pr1_x280_x290_Vererbung.ab20;

public class Fuehrungskraft extends Mitarbeiter {

    public String position;

    public Fuehrungskraft () {
        super();
    }

    public Fuehrungskraft ( String name, String vorname, double gehalt ) {
        super(name, vorname, gehalt);
        this.position = "A Boss";
    }

}
