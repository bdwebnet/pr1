# Aufgabe 1: Autovermietung

Du sollst eine Software für eine Autovermietung programmieren.
Erstelle die Klassen nach folgendem Schema,
implementiere die hervorgehenden Funktionalitäten
und ergänze eine Klasse `Tester`, um die Software zu testen.

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
        -String marke
        -String modell
        -Kunde ausleihenderKunde
        +Fahrzeug()
        +Fahrzeug(String modell)
        +Fahrzeug(String marke, String modell)
        +setMarke(String marke)
        +getMarke() String
        +setModell(String modell)
        +getModell() String
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
      
      Autovermietung --> Fahrzeug
      Fahrzeug --> Kunde
```
