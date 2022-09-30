package net.bdweb.gds2.ab3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        // INIT
        double kgw = 0.0; // Körpergewicht
        double kgr = 0.0; // Körpergröße
        double bmi = 0.0; // Body Mass Index (BMI)

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();

        // Eingabe
        System.out.println("Dieses Programm berechnet deinen Body Mass Index (BMI).");

        System.out.print("Bitte gebe zuerst dein Körpergewicht in kg ein: ");
        kgw = sc.nextDouble();

        System.out.print("Bitte gebe deine Körpergröße in m ein: ");
        kgr = sc.nextDouble();

        // Berechnung des BMI
        bmi = kgw / Math.pow(kgr, 2);

        // Ausgabe des BMI
        System.out.println("Dein BMI beträgt " + df.format(bmi));
    }

}
