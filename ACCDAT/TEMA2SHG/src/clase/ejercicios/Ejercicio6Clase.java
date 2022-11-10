package clase.ejercicios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Ejercicio6Clase {
    private static String RUTA_FICHERO = "D:\\ACCDAT\\ficheros\\";
    public static void main(String[] args) {
        Persona[] tablaPersonasOut = new Persona[4];

        tablaPersonasOut[0] = new Persona("Pepe", 20);
        tablaPersonasOut[1] = new Persona("Paco", 18);
        tablaPersonasOut[2] = new Persona("Lucas", 30);
        tablaPersonasOut[3] = new Persona("Santi", 25);

        // Mostramos la tabla antes de guardar en disco
        System.out.println("tablaPersonasOut="+Arrays.deepToString(tablaPersonasOut));
        // Creamos un flujo binario y escribir en el
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(RUTA_FICHERO + "personas.dat"))) {
            salida.writeObject(tablaPersonasOut);
        } 
        catch (IOException ioex) {
            ioex.printStackTrace();
        }

        /* Paso dos leer fichero */
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(RUTA_FICHERO + "personas.dat"))) {
            Persona[] tablaPersonasIn = (Persona[]) entrada.readObject();
            System.out.println("tablaPersonasIn ="+Arrays.deepToString(tablaPersonasIn));
        } catch (IOException | ClassNotFoundException ioex) {
            ioex.printStackTrace();
        }
    }
}
