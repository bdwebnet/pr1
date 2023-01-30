# Zusatzaufgabe – Übung

Zusazuaufgaben vom Lehrer

## Aufgabe 1 - Übung Rekursion

Ein Patient nimmt jeden Morgen 5 mg des Medikaments ADVfit ein.

Im Laufe des Tages werden von dem gesamten, im Körper befindlichen Medikament 40 % abgebaut. Die
Methode `medikamentenmenge(n)` beschreibe die Menge des Medikaments (in mg), die sich am n-ten Tag
morgens nach Einnahme des Medikaments im Körper befindet.

Lösen Sie das Problem mit einer Rekursion.

## Aufgabe 2 - Übung Aufzählungstypen

- Definieren Sie eine typsichere Aufzählung (`enum`) für die vier Jahreszeiten
- Definieren Sie eine weitere typsichere Aufzählung für die Monate des Jahres.
    - Ein Objekt vom Typ `Monat` soll man abfragen können wie viele Tage dieser Monat hat und in
      welcher Jahreszeit er ist.
- Folgendes Code-Fragment soll mit der Implementation funktionsfähig sein:

```java
public class Tester {

    public static void main ( String[] args ) {
        Monat monat = Monat.FEBRUAR;

        System.out.println(monat.name() + " hat " + monat.getAnzahlTage() + " Tage.");

        if ( monat.in(Jahreszeit.WINTER) ) {
            System.out.println("Dieser Monat ist im Winter.");
        }
    }

}
```