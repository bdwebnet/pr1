package net.bdweb.gds2.pr1_x430_Collection_Classes.s300_ab20;

import java.util.ArrayList;

public class a01_GenerischeListCollection {

    public static void main ( String[] args ) {

        // Erzeugen einer Stringlist (ArrayList) mit dem Namen liste
        ArrayList<String> liste = new ArrayList<String>();

        // Hinzufügen von Stringelementen der Liste
        liste.add("Hans");
        liste.add("Emil");
        liste.add("Frauke");
        liste.add("Evelyn");
        liste.add("Emil");
        liste.add("Richard");
        liste.add("Evelyn");

        // Ausgabe der Liste
        System.out.println("Erste Ausgabe der Liste");
        for ( String element : liste ) {
            System.out.println(element);
        }

        // Ausgabe des Index von Frauke in der Liste
        System.out.println("Index von Frauke: " + liste.indexOf("Frauke"));

        // Einfügen von Hanna vor Frauke
        liste.add(liste.indexOf("Evelyn"), "Hanna");

        // Ausgabe der Liste
        System.out.println("Ausgabe der Liste mit eingefügtem Element Hanna");
        printListe(liste);

        // Frauke aus der Liste mit RemoveAll löschen
        ArrayList<String> listeFrauke = new ArrayList<String>();
        listeFrauke.add("Frauke");
        liste.removeAll(listeFrauke);

        // Alle Emils aus der Liste mit RemoveAll löschen
        ArrayList<String> listeEmil = new ArrayList<String>();
        listeEmil.add("Emil");
        liste.removeAll(listeEmil);

        printListe(liste);

    }

    public static void printListe ( ArrayList<String> liste ) {
        for ( String s : liste ) {
            System.out.println(s);
        }
    }

}
