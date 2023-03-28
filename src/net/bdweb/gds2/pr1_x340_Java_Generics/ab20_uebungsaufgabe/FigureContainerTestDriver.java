package net.bdweb.gds2.pr1_x340_Java_Generics.ab20_uebungsaufgabe;

import java.util.Iterator;

public class FigureContainerTestDriver {

    public static void main ( String[] args ) {
        FigureContainer container = new FigureContainer();

        for ( int i = 1; i <= 100; i++ ) {

            if ( i % 3 == 0 ) {
                container.add(new Circle(i));
            } else if ( i % 3 == 1 ) {
                container.add(new Triangle(i));
            } else {
                container.add(new Square(i));
            }

        }

        System.out.println("Anzahl der Elemente: " + container.size());

        System.out.println("Enthält id 42? " + container.contains(42));
        System.out.println("-- Objekt 42: " + container.getFigure(42));

        System.out.println("Enthält id 8015? " + container.contains(8015));
        System.out.println("-- Objekt 42: " + container.getFigure(8015));

        int count = 0;

        Iterator<Figure> itr = container.iterator();

        while ( itr.hasNext() ) {
            itr.next();
            count++;
        }

        System.out.println("Anzahl der Elemente: " + count);

        container.drawAll();
    }

}
