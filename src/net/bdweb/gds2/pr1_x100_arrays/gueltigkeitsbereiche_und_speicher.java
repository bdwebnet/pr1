package net.bdweb.gds2.pr1_x100_arrays;

public class gueltigkeitsbereiche_und_speicher {

    public static void main(String[] args) {

        int m = 13, n = 2, z = 0;

        m = m + n;

        {
            double x;
            x = m / n;
            int i = (int) x;
            z = i - n;
        }

        n++;
        int h = n + 1;

    }

}
