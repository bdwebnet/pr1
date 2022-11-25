package net.bdweb.gds2.pr1_x170_statische_methoden.ab40;

public class ArrayTest {

    public static void main(String[] args) {
        String[] zahlennamenArray = {"eins", "zwei"};
        test(zahlennamenArray);

        for (String elem : zahlennamenArray) {
            System.out.println(elem);
        }

        swap(zahlennamenArray);

        for (String elem : zahlennamenArray) {
            System.out.println(elem);
        }
    }

    static void test(String[] array) {
        array = new String[] {"Alles", "ganz", "anders"};
    }

    static void swap(String[] array) {
        String temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }

}
