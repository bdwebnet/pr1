package net.bdweb.gds2.pr1_70_80_90_schleifen.ab_20_wiederholung;

public class a02_b_advanced {

    public static void main(String[] args) {

        String format = "%1$-20s %2$-10s %3$-10s \n";

        System.out.printf(format, "Zeichenvariable", "Dezimal", "Unicode");

        for (char c = 'A'; c <= 'Z'; c++) {

            System.out.printf(format, c, (int) c, "\\U00" + Integer.toHexString((int) c));

        }

    }

}
