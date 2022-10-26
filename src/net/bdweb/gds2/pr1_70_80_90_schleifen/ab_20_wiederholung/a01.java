package net.bdweb.gds2.pr1_70_80_90_schleifen.ab_20_wiederholung;

import java.text.DecimalFormat;

public class a01 {
    public static final double dVerlust = 4;
    public static final double dGrenzwert = 50;

    public static void main(String[] args) {

        double dWirkstoffgehalt = 100;
        int iMonate = 0;

        DecimalFormat df = new DecimalFormat("#.00");

        while (dWirkstoffgehalt >= dGrenzwert) {
            dWirkstoffgehalt = dWirkstoffgehalt - dVerlust/100 * dWirkstoffgehalt;
            iMonate += 1;
        }

        System.out.println("Das Medikament hat nach " + iMonate + " Monaten " + df.format(dWirkstoffgehalt) + " % des Wirkstoffgehalts verloren.");

    }

}
