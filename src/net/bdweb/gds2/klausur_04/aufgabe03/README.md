# Aufgabe 3: Code kommentieren

Kommentiere den folgenden Code vollständig gemäß der Javadoc-Vorgaben
und generiere anschließend das Javadoc.

```java
public class Punkt {

    private double x;
    private double y;

    public Punkt ( double x, double y ) {
        this.x = x;
        this.y = y;
    }

    public static double dist ( Punkt p1, Punkt p2 ) {
        return Math.sqrt(Math.pow(( p1.x - p2.x ), 2) + Math.pow(( p1.y - p2.y ), 2));
    }

    public double dist ( Punkt p2 ) {
        return Math.sqrt(Math.pow(( this.x - p2.x ), 2) + Math.pow(( this.y - p2.y ), 2));
    }

    public boolean gleichheit ( Punkt p2 ) {
        return this.x == p2.x && this.y == p2.y;
    }

    public double getX () {
        return this.x;
    }

    public void setX ( double x ) {
        this.x = x;
    }

    public void drucken () {
        System.out.println("Punkt: (" + this.x + ", " + this.y + ")");
    }

    public void drucken ( String text ) {
        System.out.println(text);
        System.out.println("Punkt: (" + this.x + ", " + this.y + ")");
    }

}
```