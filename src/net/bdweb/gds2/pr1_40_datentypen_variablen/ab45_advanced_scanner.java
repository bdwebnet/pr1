package net.bdweb.gds2.pr1_40_datentypen_variablen;

import java.util.Scanner; // Imortanweisung für die Scannerklasse

public class ab45_advanced_scanner {
	
	public static void main(String[] args) {
		// Scanner anlegen
		Scanner sc = new Scanner(System.in);
		
		// Aufforderung zum Inhalt eingeben
		System.out.print("Bitte eine Ganzzahl eingeben: ");
		
		// Überprüfen, ob Eingabe Int ist
		if (sc.hasNextInt()) {
			// Input einlesen
			int i = sc.nextInt();
			
			// Zahl ausgeben
			System.out.println("Vielen Dank. Du hast die Zahl \"" + i + "\" eingegeben.");
		} else {
			// Fehler ausgeben, dass Eingabe kein int ist
			System.out.println("Du hast keine gültige Ganzzahl eingegeben.");
		}
			
		// Scanner schließen
		sc.close();
		
		
	}

}
