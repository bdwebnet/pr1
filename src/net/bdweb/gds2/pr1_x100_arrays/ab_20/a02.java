package net.bdweb.gds2.pr1_x100_arrays.ab_20;

public class a02 {

    public static void main(String[] args) {

        // INIT
        int [] zahlen = new int[31];

        for (int i = 0; i <= 30; i++) {
            zahlen[i] = i;
        }

        for (int zahl : zahlen) {
            if (zahl % 3 == 0) {
                System.out.println(zahl);
            }
        }

    }

}
