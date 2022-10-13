package clase.Ejercicios;

import java.io.File;
import java.util.Arrays;

public class DirSubdir {
    public static void main(String[] args) {
        /* Listado de ficheros del directorio actual */
        File miDir = new File(".");
        String[] archivos = miDir.list();

        /* Con lambda */
        System.out.println("\nCon Lambda");
        Arrays.asList(archivos).forEach(System.out::println);

        /* Sacar subdirectorios */
        File Subdir = new File(".", miDir + ".");
        String[] subarchivos = Subdir.list();
        Arrays.asList(subarchivos).forEach(System.out::println);
    }
}
