package net.bdweb.gds2.pr1_x190_strings_bearbeiten.ab20;

import java.util.Arrays;
import java.util.Scanner;

public class Aufgabe03 {

    public static String reverse(String input) {
        char[] array = input.toCharArray();
        char[] outputArray = new char[array.length];

        int count = 0;
        if (array.length > 0) {
            for (int i = array.length - 1; i >= 0; i--) {
                outputArray[count] = array[i];
                count++;
            }
        }

        return new String(outputArray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bitte Text mit Vokalen eingeben: ");
        String input = sc.nextLine();

        System.out.println(reverse(input));
    }

}
