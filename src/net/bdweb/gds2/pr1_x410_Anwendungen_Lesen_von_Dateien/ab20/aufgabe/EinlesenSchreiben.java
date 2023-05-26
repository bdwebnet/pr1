package net.bdweb.gds2.pr1_x410_Anwendungen_Lesen_von_Dateien.ab20.aufgabe;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class EinlesenSchreiben {

    public static void main ( String[] args ) {

        String inputFilePath = "src/net/bdweb/gds2/pr1_x410_Anwendungen_Lesen_von_Dateien/ab20/aufgabe/Vorlage_Debug.info";
        String outputFilePath = "src/net/bdweb/gds2/pr1_x410_Anwendungen_Lesen_von_Dateien/ab20/aufgabe/DebugKopie.Info";

        Path inputPath = Path.of(inputFilePath);
        Path outputPath = Path.of(outputFilePath);

        Charset charset = StandardCharsets.UTF_8;

        if ( !inputPath.toFile().exists() ) {
            System.out.println("Input File not found!");
        } else if ( !outputPath.toFile().exists() ) {
            // Create output File
            try {
                outputPath.toFile().createNewFile();
            } catch ( Exception e ) {
                e.printStackTrace();
            }
        }

        // Read Input-File and overwrite Output-File
        try ( BufferedReader reader = Files.newBufferedReader(inputPath, charset) ) {
            BufferedWriter writer = Files.newBufferedWriter(outputPath, charset);

            String line = null;
            while ( ( line = reader.readLine() ) != null ) {
                writer.write(line);
                writer.newLine();
            }
        } catch ( Exception e ) {
            e.printStackTrace();
        }

    }

}
