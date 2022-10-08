package net.bdweb.gds2.sonstiges;

public class VerschiedeneVariablenTypen {

	public static void main(String[] args) {
		
		/*
		 * - Vaiablendeklaration -
		 * hier wird der Variablen ein Typ
		 * und  Speicherplatz festgelegt
		 */
		
		int ganzzahl;
		double kommazahl;
		char buchstabe;
		String text;
		
		/*
		 * - Initialisierung -
		 * Zuweisung von Anfangswerten
		 */
		
		ganzzahl = 3;
		kommazahl = 5.2;
		buchstabe = 'b';
		text = "Die ist ein Text, gaaaaaaaaanz toll gemacht.";

		System.out.println("Ganzzahl:\t"  + ganzzahl);
		System.out.println("Komazahl:\t"  + kommazahl);
		System.out.println("Buchstabe:\t"  + buchstabe);
		System.out.println("Text:\t\t"  + text);
		
	}

}
