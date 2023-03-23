package net.bdweb.gds2.pr1_x340_Java_Generics.ab20_uebungsaufgabe;

public class Figure {

    public int id;

    public Figure ( int id ) {
        this.id = id;
    }

    public void draw () {
        System.out.println("Figure.draw() mit id = " + this.id);
    }

}
