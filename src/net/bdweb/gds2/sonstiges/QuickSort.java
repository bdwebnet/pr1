package net.bdweb.gds2.sonstiges;

public class QuickSort {

    public static void main ( String[] args ) {
        int[] array = { 5, -1, 1, 3, 2 };
        quickSort(array, 0, array.length - 1);
    }

    public static void quickSort ( int[] array, int links, int rechts ) {
        System.out.println(java.util.Arrays.toString(array));

        if ( links < rechts ) {
            int teiler = teile(array, links, rechts);
            quickSort(array, links, teiler - 1);
            quickSort(array, teiler + 1, rechts);
        }
    }

    public static int teile ( int[] array, int links, int rechts ) {
        int pivot = array[links];
        int i = links;
        int j = rechts + 1;

        do {
            do {
                i++;
            } while ( i <= rechts && array[i] < pivot );

            do {
                j--;
            } while ( array[j] > pivot );

            if ( i < j ) {
                tausche(array, i, j);
            }
        } while ( i < j );

        tausche(array, links, j);
        return j;
    }

    public static void tausche ( int[] array, int index1, int index2 ) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}
