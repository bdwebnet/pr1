package net.bdweb.gds2.pr1_x430_Collection_Classes.ab10;

import java.util.ArrayList;
import java.util.Iterator;

public class GenerischeListCollection {

    public static void main ( String[] args ) {

        // Erzeugen einer Stringlist (ArrayList) mit dem Namen liste
        ArrayList<String> liste = new ArrayList<String>();

        // Hinzufügen von Stringelementen der Liste
        liste.add("Hans");
        liste.add("Emil");
        liste.add("Frauke");
        liste.add("Evely");
        liste.add("Richard");

        // Ausgabe der Liste
        System.out.println("Ausgabe der Liste");
        for ( String element : liste ) {
            System.out.println(element);
        }

        // Ausgabe des Index von Frauke in der Liste
        System.out.println("Index von Frauke: " + liste.indexOf("Frauke"));

        // Einfügen von Hanna vor Frauke
        liste.add(liste.indexOf("Frauke"), "Hanna");

        // Ausgabe der Liste mit dem Iterator
        Iterator<String> it = liste.iterator();
        System.out.println("Ausgabe der Liste (Hanna wurde eingefügt) mit dem Iterator");
        while ( it.hasNext() ) {
            System.out.println(it.next());
        }

    }

}
