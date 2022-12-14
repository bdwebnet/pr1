package net.bdweb.gds2.pr1_x190_strings_bearbeiten.ab10_stringbuilder;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class AbhoerAI {

    private final static String[] buzzWordList = {"IS", "Bombe", "Gummibärchen"};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte gebe das Telefonatstranskript ein: ");

        String text = sc.nextLine();

        StringTokenizer moin = new StringTokenizer(text, " -");

        boolean terrWord = false;

        StringBuilder newString = new StringBuilder();

        while (moin.hasMoreTokens()) {
            String word = moin.nextToken();
            boolean currentTerr = false;

            for (String buzzWord : buzzWordList) {
                if (normalize(word).equals(normalize(buzzWord))) {
                    terrWord = true;
                    currentTerr = true;
                }
            }

            if (!currentTerr) {
                newString.append(word).append(" ");
            }
        }

        if (terrWord) {
            System.out.println("Du bist böse");
            System.out.println(newString.toString().trim());
        } else {
            System.out.println("Ich mag dich.");
        }

    }

    private static String normalize(String string) {
        string = string.toLowerCase();

        string = string.replace("ä", "ae");
        string = string.replace("ö", "oe");
        string = string.replace("ü", "ue");

        string = string.replaceAll("[^a-z]", "");

        return string;
    }

}
