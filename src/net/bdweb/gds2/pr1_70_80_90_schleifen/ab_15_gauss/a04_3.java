package net.bdweb.gds2.pr1_70_80_90_schleifen.ab_15_gauss;

public class a04_3 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ", ");
        }
        for (int i = 9; i >= 1; i--) {
            if (i > 1) {
                System.out.print(i + ", ");
            } else {
                System.out.println(i);
            }
        }
    }
    
}
