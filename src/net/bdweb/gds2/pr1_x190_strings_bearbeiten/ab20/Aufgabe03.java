package net.bdweb.gds2.pr1_x190_strings_bearbeiten.ab20;

import java.util.Scanner;

public class Aufgabe03 {

    public static String reverse(String input) {
        char[] array = input.toCharArray();

        String output = "";

        for (int i = array.length - 1; i >= 0; i--) {
            output = output.concat(String.valueOf(array[i]));
        }

        return output;

        /*
        Alternative Lösung mit zwei Laufzeitvariablen:

        for (int i = 0, j = array.length - 1; i < array.length/2; i++, j--) {
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        return new String(array);
        */
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bitte Text eingeben: ");
        String input = sc.nextLine();

        System.out.println(reverse(input));

        sc.close();
    }

}
