package net.bdweb.gds2.pr1_x410_Anwendungen_Lesen_von_Dateien.Dateien_Schreiben.ab50_AB_Textdateien_schreiben.aufgabe03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Kopierer {

    public static void main ( String[] args ) {

        String basepath = "src/net/bdweb/gds2/pr1_x410_Anwendungen_Lesen_von_Dateien/Dateien_Schreiben/ab50_AB_Textdateien_schreiben/aufgabe03/";

        String nameQuelldatei = null;
        String nameZieldatei = null;

        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {

            System.out.print("Bitte gebe den Namen der Quelldatei ein: ");
            nameQuelldatei = basepath + scanner.nextLine();

            System.out.print("Bitte gebe den Namen der Zieldatei ein: ");
            nameZieldatei = basepath + scanner.nextLine();

            reader = Files.newBufferedReader(Path.of(nameQuelldatei), StandardCharsets.UTF_8);
            writer = Files.newBufferedWriter(Path.of(nameZieldatei), StandardCharsets.UTF_8, StandardOpenOption.CREATE);

            String line = null;
            while ( ( line = reader.readLine() ) != null ) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Datei wurde kopiert.");

        } catch ( NoSuchFileException e ) {
            System.out.println("Quelldatei wurde nicht gefunden.");
        } catch ( Exception e ) {
            e.printStackTrace();
        } finally {
            scanner.close();

            if ( reader != null ) {
                try {
                    reader.close();
                } catch ( Exception e ) {
                    System.out.println("Fehler: " + e.getMessage());
                }
            }

            if ( writer != null ) {
                try {
                    writer.close();
                } catch ( Exception e ) {
                    System.out.println("Fehler: " + e.getMessage());
                }
            }
        }

    }

}
