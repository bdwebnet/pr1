package net.bdweb.gds2.pr1_x210_Ueberladen_von_Methoden.ab30_CAD;

public class Tester {

    public static void main ( String[] args ) {
        Punkt p1 = new Punkt(3, -4.5);
        Punkt p2 = new Punkt(4, -5);

        System.out.println("Punkte gleich?\t" + p1.gleichheit(p2));

        System.out.println("Punkt-Abstand:\t" + Punkt.dist(p1, p2));
        System.out.println("Punkt-Abstand:\t" + p1.dist(p2));
    }

}
