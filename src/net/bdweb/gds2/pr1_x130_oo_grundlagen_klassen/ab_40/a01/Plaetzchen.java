package net.bdweb.gds2.pr1_x130_oo_grundlagen_klassen.ab_40.a01;

public class Plaetzchen {

    // Instanzvariablen
    private String sorte;
    private String groesse;
    private String form;

    private boolean verzierungJaNein;

    // Instanzmethode
    public void ausgeben()
    {
        // gibt Informationen über die Plätzchen aus

        String s;
        if (verzierungJaNein) {
            s = "Ja";
        } else {
            s = "Nein";
        }

        System.out.println("Sorte: " + sorte + ", Größe: " + groesse + ", Form: " + form);
    }

    // Test der Klasse Plaetzchen
    public static void main(String[] args) {

        // Standardkonstruktor
        Plaetzchen p1 = new Plaetzchen();

        p1.sorte = "Kokos";
        p1.groesse = "mittel";
        p1.form = "rund";
        p1.verzierungJaNein = true;
        p1.ausgeben();

        Plaetzchen plaetzchen2 = new Plaetzchen();
        plaetzchen2.sorte = "Affennuss";
        plaetzchen2.groesse = "klein";
        plaetzchen2.form = "rund";
        plaetzchen2.ausgeben();

        Plaetzchen plaetzchen3 = new Plaetzchen();
        plaetzchen3.sorte = "Honigkuchen";
        plaetzchen3.groesse = "gross";
        plaetzchen3.form = "rechteckig";
        plaetzchen3.ausgeben();

    }

}
