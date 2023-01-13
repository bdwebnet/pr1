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

    // Gleichheit prüfen
    public boolean gleichheit ( Punkt p2 ) {
        return this.getX() == p2.getX() && this.getY() == p2.getY();
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
        return this.x;
    }

    public void setX ( double x ) {
        this.x = x;
    }

    public void setX ( int x ) {
        this.x = x;
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

    public void drucken () {
        System.out.println("Punkt: (" + this.getX() + ", " + this.getY() + ")");
    }

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
