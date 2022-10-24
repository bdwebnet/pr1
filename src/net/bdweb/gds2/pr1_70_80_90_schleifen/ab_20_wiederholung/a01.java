package net.bdweb.gds2.pr1_70_80_90_schleifen.ab_20_wiederholung;

public class a01 {

    public static final int wirkstoffgehalt_anfang = 100;
    public static final int abnahme_pro_monat = 4;
    public static final int grenzwert = 50;

    public static void main(String[] args) {

        int wirkstoffgehalt = wirkstoffgehalt_anfang;
        int monate = 0;

        while (wirkstoffgehalt >= grenzwert) {
            wirkstoffgehalt -= abnahme_pro_monat;
            monate += 1;
        }

        System.out.println("Das Medikament hat nach " + monate + " Monaten " + wirkstoffgehalt + "% des Wirkstoffgehalts verloren.");

    }

}
