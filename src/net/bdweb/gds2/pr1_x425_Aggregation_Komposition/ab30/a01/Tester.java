package net.bdweb.gds2.pr1_x425_Aggregation_Komposition.ab30.a01;

public class Tester {

    public static void main ( String[] args ) {

        Industrieroboter ir = new Industrieroboter();

        Bohrer b1 = new Bohrer("Bohrer", 0, 10);
        Bohrer b2 = new Bohrer("Bohrer", 0, 10);

        ir.werkzeugHinzufuegen(5, b1);
        ir.werkzeugHinzufuegen(5, b2);
        ir.werkzeugHinzufuegen(10, b2);
        ir.werkzeugHinzufuegen(-1, b2);

        ir.werkzeugEntfernen(5);
        ir.werkzeugEntfernen(5);
        ir.werkzeugEntfernen(10);
        ir.werkzeugEntfernen(-1);

    }

}
