package net.bdweb.gds2.pr1_x190_strings_bearbeiten.einfuehrung;

public class Einfuehrung {

    public static void main(String[] args) {
        // Variante 1 String-Variable
        // String s = "Hi, ich mag die ADV";

        // Variante 2 mit dem String-Objekt
        // String s = new String("Hi, ich mag die ADV");

        /*String s2 = "";
        System.out.println(s2.equalsIgnoreCase(""));

        String s1 = new String("Hi, ich mag die ADV");
        System.out.println(s1.equals("hi, ich mag die ADV")); // false
        System.out.println(s1.equalsIgnoreCase("hi, ich mag die adv")); // true

        System.out.println((new String("    Link: adv.de    ")));*/


        String bigString = new String("    Link: www.adv-gds2.de      ");
        System.out.println(bigString); // „    Link: www.adv-gds2.de      “;
        System.out.println(bigString.trim()); // „Link: www.adv-gds2.de“;

        // Replace
        String string = "Krokodil";

        System.out.println(string.replace("o", "8"));
        System.out.println(string.replace("oko", "7"));

    }

}
