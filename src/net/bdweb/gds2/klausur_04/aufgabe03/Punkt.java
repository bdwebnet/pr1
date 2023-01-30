package net.bdweb.gds2.klausur_04.aufgabe03;

public class Punkt {

    private double x;
    private double y;

    /**
     * Konstruktor
     *
     * @param x x-Koordinate
     * @param y y-Koordinate
     */
    public Punkt ( double x, double y ) {
        this.x = x;
        this.y = y;
    }

    /**
     * Distanz zwischen zwei Punkten berechnen (als statische Methode)
     *
     * @param p1 Zu vergleichender Punkt
     * @param p2 Zu vergleichender Punkt
     * @return distance
     */
    public static double dist ( Punkt p1, Punkt p2 ) {
        return Math.sqrt(Math.pow(( p1.x - p2.x ), 2) + Math.pow(( p1.y - p2.y ), 2));
    }

    /**
     * Distanz zwischen zwei Punkten berechnen (als Klassen-Methode)
     *
     * @param p2 Zu vergleichender Punkt
     * @return distance
     */
    public double dist ( Punkt p2 ) {
        return Math.sqrt(Math.pow(( this.x - p2.x ), 2) + Math.pow(( this.y - p2.y ), 2));
    }

    /**
     * Gleichheit von zwei Punkten prüfen
     *
     * @param p2 Zu vergleichender Punkt
     * @return gleichheit (haben Punkte die gleichen Koordinaten)
     */
    public boolean gleichheit ( Punkt p2 ) {
        return this.x == p2.x && this.y == p2.y;
    }

    /**
     * Getter für x-Koordinate
     *
     * @return x-Koordinate
     */

    public double getX () {
        return this.x;
    }

    /**
     * Setter für x-Koordinate
     *
     * @param x x-Koordinate
     */
    public void setX ( double x ) {
        this.x = x;
    }

    /**
     * Gibt Punkt-Kordinaten aus.
     */
    public void drucken () {
        System.out.println("Punkt: (" + this.x + ", " + this.y + ")");
    }

    /**
     * Gibt Punkt-Koordinaten mit zusätzlichem Text aus.
     *
     * @param text Text, der mit ausgegeben werden soll
     */
    public void drucken ( String text ) {
        System.out.println(text);
        System.out.println("Punkt: (" + this.x + ", " + this.y + ")");
    }

}
