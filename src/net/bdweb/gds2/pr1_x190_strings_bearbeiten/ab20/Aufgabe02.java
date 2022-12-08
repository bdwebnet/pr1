package net.bdweb.gds2.pr1_x190_strings_bearbeiten.ab20;

import java.util.Scanner;

public class Aufgabe02 {

    public static String TextOhneVokale(String input) {
        String output = input;

        output = output.replaceAll("[aeiou]", "");

        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bitte Text mit Vokalen eingeben: ");
        String input = sc.nextLine();

        System.out.println(TextOhneVokale(input));
    }

}
