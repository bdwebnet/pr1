package net.bdweb.gds2.pr1_x410_Anwendungen_Lesen_von_Dateien.ab20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TxtDateiStrWrtr {

    public static void main ( String[] args ) {

        String dateiname = "src/net/bdweb/gds2/pr1_x410_Anwendungen_Lesen_von_Dateien/ab20/os.txt";
        String text = "OS Build : 18362.720";
        try {
            Files.writeString(Path.of(dateiname), text);
        } catch ( IOException e ) {
            e.printStackTrace();
        }

    }

}
