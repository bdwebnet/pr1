package net.bdweb.gds2.pr1_x280_x290_Vererbung.ab_uebungen_vererbung.aufgabe02;

import java.util.ArrayList;

public class Starter {

    public static void main ( String[] args ) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("test");

        System.out.println(list.get(0).getClass().getName());

    }

}
