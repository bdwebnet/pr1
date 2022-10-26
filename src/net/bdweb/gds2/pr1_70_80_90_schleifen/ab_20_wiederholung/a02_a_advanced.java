package net.bdweb.gds2.pr1_70_80_90_schleifen.ab_20_wiederholung;

public class a02_a_advanced {

    public static void main(String[] args) {

        // INIT
        int min = 65;
        int max = 200;

        String format = "%1$-10s %2$-10s \n";

        System.out.printf(format, "Dezimal", "Zeichenvariable");

        for (int i = min; i <= max; i++) {

            char c = (char) i;
            System.out.printf(format, i, c);

        }

    }

}
