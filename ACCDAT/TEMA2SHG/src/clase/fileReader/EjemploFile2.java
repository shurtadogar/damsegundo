package clase.fileReader;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class EjemploFile2 {
    final static String RUTA_FICHEROS="D:\\ACCDAT\\ficheros";
    final static String TEXTO_BASE="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse vitae lectus quis nisl aliquam porta. Nullam condimentum dapibus lorem, vitae finibus ipsum pulvinar vitae. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Sed nec facilisis augue.";
    public static void main(String[] args) {
        /* Escribir un fichero usando java.nio.file y files.write */
        Path miRutaFich = Paths.get(RUTA_FICHEROS, "info.out");
        try {
            Files.write(miRutaFich, TEXTO_BASE.getBytes());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Fichero generado en "+RUTA_FICHEROS);

        /* Obtener informacion con path */
        System.out.println("Nombre del fichero: "+miRutaFich.getFileName());
        System.out.println("Numero de directorios: "+miRutaFich.getNameCount());
        System.out.println("Directorio base: "+miRutaFich.getName(0));
        System.out.println("Directorio padre: "+miRutaFich.getParent());
        System.out.println("¿Soy un fichero? "+Files.isRegularFile(miRutaFich));
        System.out.println("¿Soy un directorio? "+Files.isDirectory(miRutaFich));

        /* Leer un fichero con readAllLines*/
        Path miRutaFichero2 = Paths.get(RUTA_FICHEROS, "prueba.txt");
        List<String> fichPureba ;
        try {
            fichPureba = Files.readAllLines(miRutaFichero2, StandardCharsets.ISO_8859_1);
            System.out.println(fichPureba);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
