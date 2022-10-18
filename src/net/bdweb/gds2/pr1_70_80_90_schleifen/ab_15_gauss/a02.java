package net.bdweb.gds2.pr1_70_80_90_schleifen.ab_15_gauss;

public class a02 {

    public static void main(String[] args) {

        for (int i = 10; i >= 0 ; i--) {
            System.out.print(i);

            for (int z = i-1; z >= 0 ; z--) {
                System.out.print("\t" + z);
            }

            System.out.println("");
        }

    }

}
