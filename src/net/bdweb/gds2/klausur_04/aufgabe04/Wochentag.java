package net.bdweb.gds2.klausur_04.aufgabe04;

public enum Wochentag {
    MONTAG, DIENSTAG, MITTWOCH, DONNERSTAG, FREITAG, SAMSTAG, SONNTAG;

    public boolean isWerktag () {
        return this != SAMSTAG && this != SONNTAG;
    }
}


