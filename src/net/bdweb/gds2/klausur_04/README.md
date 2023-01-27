# Übungsaufgaben für die 4. Klausur

Hier findest du Übungsaufgaben für die 4. Klausur in PR1.

## Klausurthemen

- Überladen von Methoden
- Objekte in Objekte / Objektbeziehungen
- Aufzählungstypen
- Assoziationen
- Javadoc (Code-Dokumentation)
- Rekursion
- Vererbung

## Aufgabe 1: Autovermietung

Du sollst eine Software für eine Autovermietung programmieren.
Erstelle die Klassen nach folgendem Schema
und ergänze eine Klasse ```Tester```, um die Software zu testen.

```mermaid
  classDiagram
      class Autovermietung {
        -Fahrzeug[] fahrzeuge
        +Autovermietung(Fahrzeug[] fahrzeuge)
        +getFahrzeuge() Fahrzeug[]
        +getFahrzeuge(int[] posInFahrzeugArray) Fahrzeug[]
        +getFahrzeug(int posInFahrzeugArray) Fahrzeug
      }
      
      class Fahrzeug {
        -String hersteller
        -String name
        -Kunde ausleihenderKunde
        +Fahrzeug()
        +Fahrzeug(String name)
        +Fahrzeug(String hersteller, String name)
        +setHersteller(String hersteller)
        +getHersteller() String
        +setName(String name)
        +getName() String
        +setAusleihenderKunde(Kunde kunde)
        +getAusleihenderKunde() Kunde
      }
      
      class Kunde {
        -String name
        -String adresse
        +Kunde(String name, String adresse)
        +aktualisieren(String name, String adresse)
        +setName(String name)
        +getName() String
        +setAdresse(String adresse)
        +getAdresse() String
      }
      
      Autovermietung --|> Fahrzeug
      Fahrzeug --|> Kunde
```
