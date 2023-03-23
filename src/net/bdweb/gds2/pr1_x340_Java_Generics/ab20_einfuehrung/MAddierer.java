package net.bdweb.gds2.pr1_x340_Java_Generics.ab20_einfuehrung;

import java.util.List;
import java.util.Vector;

public class MAddierer {

    public static void main ( String[] args ) {

        int zahl = 100;
        String name = "Max";

        List myList = new Vector();

        myList.add(zahl);
        myList.add(10);
        myList.add(15);
        //myList.add(name);

        // Addition aller Werte
        int sum = 0;

        for ( Object o : myList ) {
            sum += ( ( Integer ) o ).intValue();
        }

        System.out.println("Summe: " + sum);

    }

}
