package net.bdweb.gds2.pr1_x190_strings_bearbeiten.ab20;

import java.util.Arrays;
import java.util.Scanner;

public class Aufgabe03 {

    public static String Reverse(String input) {
        char[] array = input.toCharArray();
        String output = "";

        for (int i = array.length - 1; i >= 0; i--) {
            output = output.concat(String.valueOf(array[i]));
        }

        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bitte Text eingeben: ");
        String input = sc.nextLine();

        System.out.println(Reverse(input));
    }

}
