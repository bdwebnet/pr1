package net.bdweb.gds2.pr1_70_80_90_schleifen.ab_15_gauss;

public class a01 {

    public static void main(String[] args) {

        int count = 0;

        for (int i = 1; i <= 100 ; i++) {
            if (i == 1) {
                System.out.print(i);
            } else {
                System.out.print(" + " + i);
            }

            count += i;
        }
        System.out.println(" = " + count);

    }

}
