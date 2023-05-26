package net.bdweb.gds2.pr1_x410_Anwendungen_Lesen_von_Dateien.demo_aufgabe;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.DecimalFormat;

public class DateiSchreiben {

    public static void main ( String[] args ) {

        Charset charset = StandardCharsets.UTF_8;

        String filePath = "src/net/bdweb/gds2/pr1_x410_Anwendungen_Lesen_von_Dateien/demo_aufgabe/daten_schreiben.txt";
        String trennzeichen = "\t";

        DecimalFormat df = new DecimalFormat("#.##");

        BufferedWriter writer = null;

        try {
            writer = Files.newBufferedWriter(Path.of(filePath), charset);

            writer.write("Zahl" + trennzeichen + "Quadratzahl" + trennzeichen + "Quadratwurzel");
            writer.newLine();
            for ( int i = 0; i < 35; i++ ) {
                writer.write("*");
            }
            writer.newLine();

            for ( int i = 1; i <= 10; i++ ) {
                writer.write(i + trennzeichen + i * i + trennzeichen + df.format(Math.sqrt(i)));
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
