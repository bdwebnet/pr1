package net.bdweb.gds2.pr1_x410_Anwendungen_Lesen_von_Dateien.Dateien_Schreiben.ab50_AB_Textdateien_schreiben.aufgabe01;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class AnhaltewegBerechnen {

    public static void main ( String[] args ) {

        String filePath = "src/net/bdweb/gds2/pr1_x410_Anwendungen_Lesen_von_Dateien/Dateien_Schreiben/ab50_AB_Textdateien_schreiben/aufgabe01/ausgabe.txt";
        String trennzeichen = "\t";

        DecimalFormat df = new DecimalFormat("#");

        BufferedWriter writer = null;

        try {
            writer = Files.newBufferedWriter(Path.of(filePath), StandardCharsets.UTF_8, StandardOpenOption.CREATE);

            writer.write("Geschwindigkeit [km/h]" + trennzeichen + trennzeichen + "ca. Anhalteweg [m]");
            writer.newLine();
            for ( int i = 0; i < 35; i++ ) {
                writer.write("_");
            }
            writer.newLine();

            for ( ArrayList list : calcBremsweg() ) {
                writer.write(list.get(0) + trennzeichen + trennzeichen + list.get(1));
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

    private static ArrayList<ArrayList<Integer>> calcBremsweg () {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for ( int i = 10; i <= 100; i += 10 ) {
            ArrayList<Integer> innerList = new ArrayList<>();
            innerList.add(i);

            int bremsweg = ( int ) Math.pow(i / 10, 2);
            int reaktionsweg = i / 10 * 3;
            int anhalteweg = bremsweg + reaktionsweg;
            
            innerList.add(anhalteweg);
            list.add(innerList);
        }

        return list;
    }

}
