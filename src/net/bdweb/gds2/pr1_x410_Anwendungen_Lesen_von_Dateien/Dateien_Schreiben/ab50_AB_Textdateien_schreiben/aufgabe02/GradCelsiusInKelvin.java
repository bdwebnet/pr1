package net.bdweb.gds2.pr1_x410_Anwendungen_Lesen_von_Dateien.Dateien_Schreiben.ab50_AB_Textdateien_schreiben.aufgabe02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class GradCelsiusInKelvin {

    public static void main ( String[] args ) {

        String filePath = "src/net/bdweb/gds2/pr1_x410_Anwendungen_Lesen_von_Dateien/Dateien_Schreiben/ab50_AB_Textdateien_schreiben/aufgabe02/gradcelsius.txt";
        String filePathWrite = "src/net/bdweb/gds2/pr1_x410_Anwendungen_Lesen_von_Dateien/Dateien_Schreiben/ab50_AB_Textdateien_schreiben/aufgabe02/kelvin.txt";
        
        DecimalFormat df = new DecimalFormat("#.###");

        BufferedReader reader = null;
        ArrayList<Double> datenListe = new ArrayList<>();

        try {

            reader = Files.newBufferedReader(Path.of(filePath), StandardCharsets.UTF_8);

            String line;
            while ( ( line = reader.readLine() ) != null ) {
                datenListe.add(Double.valueOf(line));
            }

        } catch ( Exception e ) {
            e.printStackTrace();
        } finally {
            if ( reader != null ) {
                try {
                    reader.close();
                } catch ( Exception e ) {
                    e.printStackTrace();
                }
            }
        }

        if ( !datenListe.isEmpty() ) {
            BufferedWriter writer = null;

            try {
                writer = Files.newBufferedWriter(Path.of(filePathWrite), StandardCharsets.UTF_8, StandardOpenOption.CREATE);

                for ( double s : datenListe ) {
                    double gradCelcius = s;
                    double kelvin = gradCelcius + 273.15;
                    String output = "Grad Celsius: " + df.format(s) + "; Grad Kelvin: " + df.format(kelvin);
                    System.out.println(output);
                    writer.write(output);
                    writer.newLine();
                }
            } catch ( Exception e ) {
                e.printStackTrace();
            } finally {
                if ( writer != null ) {
                    try {
                        writer.close();
                    } catch ( Exception e ) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }

}
