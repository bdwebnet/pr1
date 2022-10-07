import java.util.Scanner;

public class VerschachtelteIfBedingungen {

    public static void main(String[] args) {

        // Variablendeklaration & Eingabe
        Scanner sc = new Scanner(System.in);
        int iqwert = sc.nextInt();

        // Verarbeitung & Ausgabe
        if (iqwert < 100) {
            System.out.println("Schlechter als der Durchschnitt");
        } else {
            System.out.println("Besser als der Durchschnitt");

            if (iqwert > 130) {
                System.out.println("Gehört zu den intelligentesten 2% der Bevölkerung");
            } else {
                System.out.println("Aber nicht intelligent genug für Mensa");
            }
        }

    }

}
