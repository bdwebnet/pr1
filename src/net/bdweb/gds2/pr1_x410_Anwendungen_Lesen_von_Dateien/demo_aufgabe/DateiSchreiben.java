package net.bdweb.gds2.pr1_x410_Anwendungen_Lesen_von_Dateien.demo_aufgabe;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.text.DecimalFormat;

public class DateiSchreiben {

    public static void main ( String[] args ) {

        String filePath = "src/net/bdweb/gds2/pr1_x410_Anwendungen_Lesen_von_Dateien/demo_aufgabe/daten_schreiben.txt";
        String trennzeichen = "\t";

        DecimalFormat df = new DecimalFormat("#.##");

        BufferedWriter writer = null;

        try {
            writer = Files.newBufferedWriter(Path.of(filePath), StandardCharsets.UTF_8, StandardOpenOption.CREATE);

            writer.write("Zahl" + trennzeichen + "Quadratzahl" + trennzeichen + "Quadratwurzel");
            writer.newLine();
            for ( int i = 0; i < 35; i++ ) {
                writer.write("*");
            }
            writer.newLine();

            for ( int i = 0; i <= 10; i++ ) {
                writer.write(i + trennzeichen + ( int ) Math.pow(i, 2) + trennzeichen + df.format(Math.sqrt(i)));
                writer.newLine();
            }
        } catch ( Exception e ) {
            e.printStackTrace();
        } finally {
            if ( writer != null ) {
                try {
                    writer.close();
                } catch ( IOException e ) {
                    e.printStackTrace();
                }
            }
        }

    }

}
