package net.bdweb.gds2.pr1_x130_oo_grundlagen_klassen.ab_40;

public class Plaetzchen {

    // Instanzvariablen
    String sorte;
    String groesse;
    String form;
    boolean verzierungJaNein;

    // Instanzmethode
    public void ausgeben()
    {
        // gibt Informationen über die Plätzchen aus
        System.out.println("Sorte: " + sorte + ", Größe: " + groesse + ", Form: " + form + ", Verzierung? " + (verzierungJaNein ? "Ja" : "Nein"));
    }

    // Test der Klasse Plaetzchen
    public static void main(String[] args) {

        Plaetzchen plaetzchen1 = new Plaetzchen();
        plaetzchen1.sorte = "Kokos";
        plaetzchen1.groesse = "mittel";
        plaetzchen1.form = "rund";
        plaetzchen1.verzierungJaNein = false;
        plaetzchen1.ausgeben();

        Plaetzchen plaetzchen2 = new Plaetzchen();
        plaetzchen2.sorte = "Affennuss";
        plaetzchen2.groesse = "klein";
        plaetzchen2.form = "rund";
        plaetzchen2.verzierungJaNein = false;
        plaetzchen2.ausgeben();

        Plaetzchen plaetzchen3 = new Plaetzchen();
        plaetzchen3.sorte = "Honigkuchen";
        plaetzchen3.groesse = "gross";
        plaetzchen3.form = "rechteckig";
        plaetzchen3.verzierungJaNein = true;
        plaetzchen3.ausgeben();

    }

}
