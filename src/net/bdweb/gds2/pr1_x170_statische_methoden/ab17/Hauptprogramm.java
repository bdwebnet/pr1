package net.bdweb.gds2.pr1_x170_statische_methoden.ab17;

import java.util.Scanner;

public class Hauptprogramm {

    public static void main(String[] args) {

        int z1, n1, z2, n2, operation_typ;

        Scanner sc = new Scanner(System.in);

        System.out.print("Bitte gebe den Zähler des 1. Bruches ein: ");
        z1 = sc.nextInt();

        System.out.print("Bitte gebe den Nenner des 1. Bruches ein: ");
        n1 = sc.nextInt();

        System.out.print("Bitte gebe den Zähler des 2. Bruches ein: ");
        z2 = sc.nextInt();

        System.out.print("Bitte gebe den Nenner des 2. Bruches ein: ");
        n2 = sc.nextInt();

        System.out.print("Möchtest du die Brüche addieren (1), subtrahieren(2), multiplizieren (3) oder dividieren (4)? ");
        operation_typ = sc.nextInt();

        switch (operation_typ) {
            case 1 -> {
                System.out.println("Du möchtest die Brüche addieren.");
                Bruchrechnen.addieren(z1, n1, z2, n2);
            }
            case 2 -> {
                System.out.println("Du möchtest die Brüche subtrahieren.");
                Bruchrechnen.subtrahieren(z1, n1, z2, n2);
            }
            case 3 -> {
                System.out.println("Du möchtest die Brüche multiplizieren.");
                Bruchrechnen.multiplizieren(z1, n1, z2, n2);
            }
            case 4 -> {
                System.out.println("Du möchtest die Brüche dividieren.");
                Bruchrechnen.dividieren(z1, n1, z2, n2);
            }
            default -> System.out.println("Ungültige Eingabe.");
        }

    }

}
