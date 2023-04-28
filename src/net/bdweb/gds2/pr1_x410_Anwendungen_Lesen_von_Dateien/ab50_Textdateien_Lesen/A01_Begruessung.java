package net.bdweb.gds2.pr1_x410_Anwendungen_Lesen_von_Dateien.ab50_Textdateien_Lesen;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class A01_Begruessung {

    public static void main ( String[] args ) {

        ArrayList<String> namen = new ArrayList<String>();

        String filePath = "src/net/bdweb/gds2/pr1_x410_Anwendungen_Lesen_von_Dateien/ab50_Textdateien_Lesen/namen.txt";

        try ( BufferedReader myReader = Files.newBufferedReader(Path.of(filePath)) ) {

            String c;

            while ( ( c = myReader.readLine() ) != null ) {
                namen.add(c);
            }

        } catch ( FileNotFoundException e ) {
            System.out.println("Datei nicht gefunden");
        } catch ( IOException e ) {
            System.out.println("Fehler beim Lesen der Datei");
        } catch ( Exception e ) {
            e.printStackTrace();
        }

        namen.forEach(( name ) -> {
            System.out.println("Hallo " + name);
        });

    }

}
