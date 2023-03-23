package net.bdweb.gds2.pr1_x340_Java_Generics.ab20_einfuehrung;

import java.util.List;
import java.util.Vector;

public class MAddierer_Sicher {

    public static void main ( String[] args ) {

        int zahl = 100;
        String name = "Max";

        List myList = new Vector();

        myList.add(zahl);
        myList.add(10);
        myList.add(15);
        //myList.add(name);

        // Addition aller Werte
        int sum = addiere(myList);

        System.out.println("Summe: " + sum);

    }

    private static int addiere ( List myList ) {
        int result = 0;

        for ( Object o : myList ) {
            if ( o instanceof Integer ) {
                result += ( ( Integer ) o ).intValue();
            } else {
                throw new ClassCastException("Die Liste darf nur Integer enthalten");
            }
        }

        return result;
    }

}
