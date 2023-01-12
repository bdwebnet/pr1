package net.bdweb.gds2.pr1_x210_Ueberladen_von_Methoden.ab30_CAD;

public class Punkt {

    private int norm;
    private double x;
    private double y;

    public Punkt ( double x, double y ) {
        this.x = x;
        this.y = y;
        this.norm = 0;
    }

    public static void punkteGleich ( Punkt p1, Punkt p2 ) {
        if ( p1.getX() == p2.getX() && p1.getY() == p2.getY() ) {
            System.out.println("Die Punkte sind gleich.");
        } else {
            System.out.println("Die Punkte sind nicht gleich.");
        }
    }

    public void dist ( Punkt p2 ) {
        double dist;

        if ( this.norm == 0 ) {
            dist = Math.sqrt(Math.pow(this.getX() - p2.getX(), 2) + Math.pow(this.getY() - p2.getY(), 2));
        } else {
            dist = Math.abs(this.getX() - p2.getX()) + Math.abs(this.getY() - p2.getY());
        }

        System.out.println("Abstand zwischen Punkten: " + dist);
    }

    public double getX () {
        return x;
    }

    public void setX ( double x ) {
        this.x = x;
    }

    public void setNorm ( int norm ) {
        this.norm = norm;
    }

    public double getY () {
        return y;
    }

    public void setY ( double y ) {
        this.y = y;
    }

    public void drucken () {
        System.out.println("Punkt: (" + this.getX() + ", " + this.getY() + ")");
    }

    public void drucken ( String text ) {
        System.out.println(text);
        System.out.println("Punkt: (" + this.getX() + ", " + this.getY() + ")");
    }

    public void xSpiegeln () {
        this.x = -this.x;
    }

    public void ySpiegeln () {
        this.y = -this.y;
    }

}
