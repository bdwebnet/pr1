package net.bdweb.gds2.sonstiges;

import java.util.Arrays;

public class BubbleSort {

    public static void main ( String[] args ) {

        int[] array = { 5, -1, 1, 3, 2 };

        System.out.println(Arrays.toString(array));

        for ( int i = 0; i < array.length; i++ ) {
            boolean notChanged = true;

            for ( int j = 0; j < array.length; j++ ) {
                if ( j + 1 < array.length && array[j] > array[j + 1] ) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    notChanged = false;
                }
                System.out.println(Arrays.toString(array));
            }

            if ( notChanged ) {
                i = array.length;
            }
        }

        System.out.println(Arrays.toString(array));

    }

}
