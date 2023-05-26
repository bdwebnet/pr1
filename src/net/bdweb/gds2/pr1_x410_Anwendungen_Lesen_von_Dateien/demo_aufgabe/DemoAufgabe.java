package net.bdweb.gds2.pr1_x410_Anwendungen_Lesen_von_Dateien.demo_aufgabe;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DemoAufgabe {

    public static void main ( String[] args ) {

        String filePath = "src/net/bdweb/gds2/pr1_x410_Anwendungen_Lesen_von_Dateien/demo_aufgabe/123daten.txt";
        String trennzeichen = "\t";

        BufferedReader reader = null;
        String[] datenArray = null;
        String line, ersteZeile, zweiteZeile;
        double summeZahl = 0.0, summeQuadratzahl = 0.0, summeQuadratwurzel = 0.0;

        try {

            reader = Files.newBufferedReader(Path.of(filePath));

            ersteZeile = reader.readLine();
            System.out.println(ersteZeile);
            zweiteZeile = reader.readLine();
            System.out.println(zweiteZeile);

            while ( ( line = reader.readLine() ) != null ) {
                System.out.println(line);
                datenArray = line.split(trennzeichen);

                summeZahl += Double.parseDouble(datenArray[0].replaceAll(",", "."));
                summeQuadratzahl += Double.parseDouble(datenArray[1].replaceAll(",", "."));
                summeQuadratwurzel += Double.parseDouble(datenArray[2].replaceAll(",", "."));
            }

            System.out.println("Zahl1:" + summeZahl);
            System.out.println("Zahl2:" + summeQuadratzahl);
            System.out.println("Zahl3:" + summeQuadratwurzel);

        } catch ( FileNotFoundException e ) {
            System.out.println("Datei nicht gefunden");
        } catch ( IOException e ) {
            System.out.println("Fehler beim Lesen der Datei");
        } catch ( Exception e ) {
            e.printStackTrace();
        } finally {
            if ( reader != null ) {
                try {
                    reader.close();
                } catch ( IOException e ) {
                    e.printStackTrace();
                }
            }
        }

    }

}
