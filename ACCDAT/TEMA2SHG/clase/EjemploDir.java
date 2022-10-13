package clase;

import java.io.File;
import java.util.Arrays;

public class EjemploDir {
    public static void main(String[] args) {
        /* Listado de ficheros del directorio actual */
        File miDir = new File(".");
        String[] archivos = miDir.list();

        for (int i = 0; i < archivos.length; i++) {
            System.out.println(archivos[i]);
        }

        /* For-each */
        System.out.println("\nFor-each");
        for (String elem : archivos) {
            System.out.println(elem);
        }

        /* Con lambda */
        System.out.println("\nCon Lambda");
        Arrays.asList(archivos).forEach(System.out::println);

        /* Sacar subdirectorios */
        File Subdir = new File(".", miDir + ".");
        String[] subarchivos = Subdir.list();
        Arrays.asList(subarchivos).forEach(System.out::println);
    }
}
