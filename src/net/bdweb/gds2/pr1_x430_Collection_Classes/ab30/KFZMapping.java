package net.bdweb.gds2.pr1_x430_Collection_Classes.ab30;

import java.util.HashMap;

public class KFZMapping {

    private HashMap<String, String> kfzMap = new HashMap<String, String>();

    public static void main ( String[] args ) {

        KFZMapping kfzMapping = new KFZMapping();

        kfzMapping.insert("S", "Stuttgart");
        kfzMapping.insert("A", "Augsburg");
        kfzMapping.insert("B", "Berlin");
        kfzMapping.insert("ES", "Esslingen");
        kfzMapping.insert("BB", "Böblingen");

        kfzMapping.printLandkreis("S");
        kfzMapping.printLandkreis("A");
        kfzMapping.printLandkreis("B");
        kfzMapping.printLandkreis("ES");
        kfzMapping.printLandkreis("BB");

        kfzMapping.remove("S");

        kfzMapping.printLandkreis("S");
        kfzMapping.printLandkreis("A");
        kfzMapping.printLandkreis("B");
        kfzMapping.printLandkreis("ES");
        kfzMapping.printLandkreis("BB");
    }

    public void insert ( String kennzeichen, String landkreis ) {
        kfzMap.put(kennzeichen, landkreis);
    }

    public void remove ( String kennzeichen ) {
        kfzMap.remove(kennzeichen);
    }

    public void printLandkreis ( String kennzeichen ) {
        System.out.println(kfzMap.get(kennzeichen));
    }

}
