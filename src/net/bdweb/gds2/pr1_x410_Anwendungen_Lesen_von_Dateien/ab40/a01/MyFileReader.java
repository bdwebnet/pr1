package net.bdweb.gds2.pr1_x410_Anwendungen_Lesen_von_Dateien.ab40.a01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MyFileReader {

    static String filePath = "src/net/bdweb/gds2/pr1_x410_Anwendungen_Lesen_von_Dateien/ab40/a01/namen.txt";

    public static void main ( String[] args ) {

        long nanoStartTime = System.nanoTime();
        long millisStartTime = System.currentTimeMillis();

        readWithFileReader();

        long nanoEndTime = System.nanoTime();
        long millisEndTime = System.currentTimeMillis();

        long nanoDurationFileReader = nanoEndTime - nanoStartTime;
        long millisDurationFileReader = millisEndTime - millisStartTime;

        // --------------------------------------------

        nanoStartTime = System.nanoTime();
        millisStartTime = System.currentTimeMillis();

        readWithBufferedReader();

        nanoEndTime = System.nanoTime();
        millisEndTime = System.currentTimeMillis();

        long nanoDurationBufferedReader = nanoEndTime - nanoStartTime;
        long millisDurationBufferedReader = millisEndTime - millisStartTime;

        // --------------------------------------------

        nanoStartTime = System.nanoTime();
        millisStartTime = System.currentTimeMillis();

        readWithBufferedReaderLines();

        nanoEndTime = System.nanoTime();
        millisEndTime = System.currentTimeMillis();

        long nanoDurationBufferedReaderLines = nanoEndTime - nanoStartTime;
        long millisDurationBufferedReaderLines = millisEndTime - millisStartTime;

        // --------------------------------------------

        System.out.println("--------------------------------------------------");

        // Sollte eigentlich schneller sein (bei MacOS ist es aber langsamer)
        System.out.println("Lesen mit dem FileReader:");
        System.out.println("Laufzeit in Nanosekunden: " + ( nanoDurationFileReader ) + "ns");
        System.out.println("Laufzeit in Millisekunden: " + ( millisDurationFileReader ) + "ms");

        System.out.println("--------------------------------------------------");

        // Sollte eigentlich langsamer sein (bei MacOS ist es aber schneller)
        System.out.println("Lesen mit dem BufferedReader:");
        System.out.println("Laufzeit in Nanosekunden: " + ( nanoDurationBufferedReader ) + "ns");
        System.out.println("Laufzeit in Millisekunden: " + ( millisDurationBufferedReader ) + "ms");

        System.out.println("--------------------------------------------------");

        System.out.println("Lesen mit dem BufferedReader (readLine()):");
        System.out.println("Laufzeit in Nanosekunden: " + ( nanoDurationBufferedReaderLines ) + "ns");
        System.out.println("Laufzeit in Millisekunden: " + ( millisDurationBufferedReaderLines ) + "ms");

    }

    public static void readWithFileReader () {

        try ( FileReader reader = new FileReader(filePath) ) {
            int c;
            int count = 0;
            while ( ( c = reader.read() ) != -1 ) {
                //System.out.println("Char: " + ( char ) c);
                count++;
            }
            System.out.println("Anzahl Zeichen: " + count);
        } catch ( FileNotFoundException e ) {
            System.out.println("Die Datei wurde nicht gefunden!");
        } catch ( IOException e ) {
            e.printStackTrace();
        }

    }

    public static void readWithBufferedReader () {

        try ( BufferedReader reader = Files.newBufferedReader(Path.of(filePath)) ) {
            int c;
            int count = 0;
            while ( ( c = reader.read() ) != -1 ) {
                //System.out.println("Char: " + ( char ) c);
                count++;
            }
            System.out.println("Anzahl Zeichen: " + count);
        } catch ( IOException e ) {
            e.printStackTrace();
        }

    }

    public static void readWithBufferedReaderLines () {

        try ( BufferedReader reader = Files.newBufferedReader(Path.of(filePath)) ) {
            String line;
            int count = 0;
            while ( ( line = reader.readLine() ) != null ) {
                //System.out.println("Char: " + ( char ) c);
                count++;
            }
            System.out.println("Anzahl Zeilen: " + count);
        } catch ( IOException e ) {
            e.printStackTrace();
        }

    }

}
