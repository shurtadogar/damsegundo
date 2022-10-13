package clase;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EscribirFileWriter {
    final static String RUTA_FICHERO="D:\\ABBDD\\ficheros\\";
    public static void main(String[] args) {
        String sCadena = "Texto a escribir en el fichero";
        /* Opcion 1 java.io */
        try (FileWriter writer = new FileWriter(RUTA_FICHERO+"info.log"); BufferedWriter bw = new BufferedWriter(writer)){
            bw.write(sCadena);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Fin del fichero info1.log");

        /* Opcion 2 java.nio */
        Path path = Paths.get(RUTA_FICHERO+"info2.log");
        try {
            Files.write(path, sCadena.getBytes());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Fin del fichero info2.log");
    }
}
