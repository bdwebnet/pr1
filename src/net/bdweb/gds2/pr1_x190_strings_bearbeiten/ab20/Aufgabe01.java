package net.bdweb.gds2.pr1_x190_strings_bearbeiten.ab20;

import java.util.Scanner;

public class Aufgabe01 {

    public static String LeerzeichenEntfernenAusString(String input) {
        return input.replace(" ", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bitte Text mit Leerzeichen eingeben: ");
        String input = sc.nextLine();

        System.out.println(LeerzeichenEntfernenAusString(input));
    }

}
