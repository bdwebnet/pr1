package net.bdweb.gds2.pr1_x340_Java_Generics.ab20_uebungsaufgabe;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class FigureContainer {

    private List<Figure> figures;

    public FigureContainer () {
        this.figures = new Vector<Figure>();
    }

    public void add ( Figure f ) {
        this.figures.add(f);
    }

    public Figure getFigure ( int id ) {
        for ( Figure f : this.figures ) {
            if ( f.id == id ) {
                return f;
            }
        }
        return null;
    }

    public boolean contains ( int id ) {
        return this.getFigure(id) != null;
    }

    public Iterator<Figure> iterator () {
        return this.figures.iterator();
    }

    public int size () {
        return this.figures.size();
    }

    public void drawAll () {
        for ( Figure f : this.figures ) {
            f.draw();
        }
    }

}
