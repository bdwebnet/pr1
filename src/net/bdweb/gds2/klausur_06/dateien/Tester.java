package net.bdweb.gds2.klausur_06.dateien;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;

public class Tester {

    public static void main ( String[] args ) {

        String path = "src/net/bdweb/gds2/klausur_06/dateien/test.txt";

        BufferedReader reader = null;

        try {
            reader = Files.newBufferedReader(Path.of(path));

            String test = null;

            int c = 0;

            System.out.println(c);

            while ( ( c = reader.read() ) != -1 ) {
                System.out.println(( char ) c);
            }

        } catch ( Exception e ) {
            e.printStackTrace();
        } finally {
            if ( reader != null ) {
                try {
                    reader.close();
                } catch ( Exception e ) {
                    System.out.println("Fehler: " + e.getMessage());
                }
            }
        }

    }

}
