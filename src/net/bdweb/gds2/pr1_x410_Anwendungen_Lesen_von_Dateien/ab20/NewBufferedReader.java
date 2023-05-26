package net.bdweb.gds2.pr1_x410_Anwendungen_Lesen_von_Dateien.ab20;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NewBufferedReader {

    public static void main ( String[] args ) {

        Path debug_info_path = Paths.get("src/net/bdweb/gds2/pr1_x410_Anwendungen_Lesen_von_Dateien/ab20", "os.txt");
        Charset charset = StandardCharsets.UTF_8;
        String text = "OS Build : 18362.720";

        try ( BufferedWriter writer = Files.newBufferedWriter(debug_info_path, charset, StandardOpenOption.APPEND) ) {
            writer.append(text);
        } catch ( IOException e ) {
            e.printStackTrace();
        }

    }

}
