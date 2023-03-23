package net.bdweb.gds2.pr1_x340_Java_Generics.ab20_einfuehrung;

import java.util.List;
import java.util.Vector;

public class MAddierer_NochSicherer {

    public static void main ( String[] args ) {

        int zahl = 100;

        List<Integer> myList = new Vector<Integer>();

        myList.add(zahl);
        myList.add(10);
        myList.add(15);

        // Geht jetzt nicht mehr bzw. wird direkt im Editor gemeckert
        //myList.add("Max");

        // Addition aller Werte
        int sum = addiere(myList);

        System.out.println("Summe: " + sum);

    }

    private static int addiere ( List<Integer> myList ) {
        int result = 0;

        for ( Integer o : myList ) {
            result += o;
        }

        return result;
    }

}
