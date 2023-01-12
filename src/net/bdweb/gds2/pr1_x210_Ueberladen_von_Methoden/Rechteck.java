package net.bdweb.gds2.pr1_x210_Ueberladen_von_Methoden;

public class Rechteck {

    public static void main ( String[] args ) {
        double a = 8, b = 4;

        System.out.println("Rechteckfläche:\t" + rectangleArea(a, b));
        System.out.println("Quadratfläche:\t" + rectangleArea(a));
    }

    private static double rectangleArea ( double a, double b ) {
        return a * b;
    }

    public static double rectangleArea ( double a ) {
        return Math.pow(a, a);
    }

}
