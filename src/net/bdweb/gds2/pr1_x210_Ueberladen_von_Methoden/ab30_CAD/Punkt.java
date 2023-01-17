package net.bdweb.gds2.pr1_x210_Ueberladen_von_Methoden.ab30_CAD;

public class Punkt {

    // Objekt-Variablen
    private int norm; // 0 = normal, 1 = Manhatten-Methode
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
        this.norm = 0;
    }

    /**
     * Distanz zwischen zwei Punkten berechnen (als statische Methode)
     *
     * @param p1 Zu vergleichender Punkt
     * @param p2 Zu vergleichender Punkt
     * @return distance
     */
    public static double dist ( Punkt p1, Punkt p2 ) {
        double dist;

        if ( p1.getNorm() == 0 ) {
            dist = Math.sqrt(Math.pow(( p1.getX() - p2.getX() ), 2) + Math.pow(( p1.getY() - p2.getY() ), 2));
        } else {
            dist = Math.abs(p1.getX() - p2.getX()) + Math.abs(p1.getY() - p2.getY());
        }

        return dist;
    }

    /**
     * Distanz zwischen zwei Punkten berechnen (als Klassen-Methode)
     *
     * @param p2 Zu vergleichender Punkt
     * @return distance
     */
    public double dist ( Punkt p2 ) {
        double dist;

        if ( this.getNorm() == 0 ) {
            dist = Math.sqrt(Math.pow(( this.getX() - p2.getX() ), 2) + Math.pow(( this.getY() - p2.getY() ), 2));
        } else {
            dist = Math.abs(this.getX() - p2.getX()) + Math.abs(this.getY() - p2.getY());
        }

        return dist;
    }

    /**
     * Gleichheit von zwei Punkten prüfen
     *
     * @param p2 Zu vergleichender Punkt
     * @return gleichheit (haben Punkte die gleichen Koordinaten)
     */
    public boolean gleichheit ( Punkt p2 ) {
        return this.getX() == p2.getX() && this.getY() == p2.getY();
    }

    public double getX () {
        return this.x;
    }

    public void setX ( double x ) {
        this.x = x;
    }

    public void setX ( int x ) {
        this.x = x;
    }

    public int getNorm () {
        return this.norm;
    }

    public void setNorm ( int norm ) {
        this.norm = norm;
    }

    public double getY () {
        return this.y;
    }

    public void setY ( double y ) {
        this.y = y;
    }

    public void setY ( int y ) {
        this.y = y;
    }

    /**
     * Gibt Punkt-Kordinaten aus.
     */
    public void drucken () {
        System.out.println("Punkt: (" + this.getX() + ", " + this.getY() + ")");
    }

    /**
     * Gibt Punkt-Koordinaten mit zusätzlichem Text aus.
     *
     * @param text Text, der mit ausgegeben werden soll
     */
    public void drucken ( String text ) {
        System.out.println(text);
        System.out.println("Punkt: (" + this.getX() + ", " + this.getY() + ")");
    }

    /**
     * Spiegelt die y-Koordinate an der x-Achse und gibt die geändert y-Koordinate zurück.
     *
     * @return y
     */
    public double spiegelnAnXAchse () {
        this.y *= -1;
        return this.getY();
    }

    /**
     * Spiegelt die x-Koordinate an der y-Achse und gibt die geändert x-Koordinate zurück.
     *
     * @return x
     */
    public double spiegelnAnYAchse () {
        this.x *= -1;
        return this.getX();
    }

}
