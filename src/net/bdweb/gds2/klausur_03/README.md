# Übungsaufgaben für die 3. Klausur

Hier findest du ein paar Übungsaufgaben für die 3. Klausur.

Die Lösungen findest du in den jeweiligen Unterordnern.

## Aufgabe 1

Gebe dem Nutzer die Möglichkeit, einen beliebigen Text einzugeben.
Dieser soll anschließend so ausgegeben werden,
dass die einzelnen Wörter abwechselnd groß und kleingeschrieben werden.
Verwende u.a. den StringBuilder, um den Ausgabetext zu erzeugen.

## Aufgabe 2 (`StringBuilder` nutzen)

Erstelle einer Klasse `NutzerEingabe`.
In der `main`-Methode soll der Nutzer die Möglichkeit haben,
einen beliebigen Text einzugeben.
Dieser soll anschließend an eine statische Methode `reverse`
in einer Klasse `Helper` gegeben werden.
Diese Methode gibt den String mit umgekehrten Buchstaben zurück.

## Aufgabe 3: ToDo-Liste

Erstelle eine ToDo-Liste!
Verwende statische Methoden, um den Code übersichtlicher zu gestalten.

Der Nutzer gibt zuerst ein, wie viele Aufgaben er insgesamt eingeben möchte.
Anschließend gibt er die einzelnen Aufgaben ein.

Anschließend werden alle eingegebenen Aufgaben (alle sind unerledigt)
mit einem `☒` als Aufzählungszeichen
und am Ende einer durchlaufenden Nummer in Klammer (z.B. `(1)`) ausgegeben.

Nun kann der Nutzer solange Zahlen von erledigten Aufgaben eingeben,
bis er erneut `fertig` eingibt.   
Nach jeder Zahlen-Eingabe wird die aktualisierte Liste mit
aktualisierten Icons `☑` bei erledigten Aufgaben ausgegeben.