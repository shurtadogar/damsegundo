package clase;

import java.io.File;

public class EjemploFile {
    final static String RUTA_FICHERO="D:\\ABBDD\\ficheros";
    public static void main(String[] args) {
        /* 1. Constructor con String */
        File fich1 = new File("fich1.txt");

        /* 2. Constructor con ruta + nombre */
        File fich2 = new File(RUTA_FICHERO, "prueba.txt");

        /* 3. Constructor de file + nombre */
        File direc = new File(RUTA_FICHERO);   
        File fich3 = new File(direc, "fich3.txt");
        
        /* Ver informacion del fichero */
        System.out.println("Nombre del fichero: "+fich1.getName());
        System.out.println("Ruta del fichero: "+fich1.getPath());
        System.out.println("Ruta absoluta: "+fich1.getAbsolutePath());
        System.out.println("Se puede leer: "+fich1.canRead());
        System.out.println("Tamaño: "+fich1.length());
        System.out.println("Saber si es directorio: "+fich1.isDirectory());
        System.out.println("Saber si es un fichero: "+fich1.isFile());

        System.out.println("Nombre del fichero: "+fich2.getName());
        System.out.println("Ruta del fichero: "+fich2.getPath());
        System.out.println("Ruta absoluta: "+fich2.getAbsolutePath());
        System.out.println("Se puede leer: "+fich2.canRead());
        System.out.println("Tamaño: "+fich2.length());
        System.out.println("Saber si es directorio: "+fich2.isDirectory());
        System.out.println("Saber si es un fichero: "+fich2.isFile());

        System.out.println("Nombre del fichero: "+fich3.getName());
        System.out.println("Ruta del fichero: "+fich3.getPath());
        System.out.println("Ruta absoluta: "+fich3.getAbsolutePath());
        System.out.println("Se puede leer: "+fich3.canRead());
        System.out.println("Tamaño: "+fich3.length());
        System.out.println("Saber si es directorio: "+fich3.isDirectory());
        System.out.println("Saber si es un fichero: "+fich3.isFile());
    }  
}
