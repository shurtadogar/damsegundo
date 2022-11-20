package entregashg.Meteo2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public class MeteoSebastian {
    final static String RUTA_FICHERO = "D:\\TEMA02SHG\\src\\Entregas\\Meteo2";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> listaMeteo = new HashMap<String, Integer>();
        LocalDate dFecha = LocalDate.now();
        String titulo = "CIUDAD     FECHA       TEMP. MIN       TEMP. MAX";
        int respuesta = 0;

        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(RUTA_FICHERO + "\\meteo.dat"));
                ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(RUTA_FICHERO + "\\meteo.dat"));) {
            salida.writeObject(titulo + "\n");
            while (respuesta != 4) {
                System.out.println(
                        "Opciones:\n1. Registrar nueva temperatura\n2. Mostrar historial de registros\n3. Mostrar media de temperatura\n4. Salir");
                respuesta = sc.nextInt();
                if (respuesta == 1) {
                    System.out.println("Ciudad: ");
                    String sCiudad = sc.next();
                    System.out.println("Fecha: " + dFecha);
                    System.out.println("Temperatura Maxima: ");
                    Integer iTempMax = sc.nextInt();
                    System.out.println("Temperatura Minima: ");
                    Integer iTempMin = sc.nextInt();

                    if (listaMeteo.containsKey(sCiudad)) {
                        System.out.println("No ha sido posible crear el contacto porque ese nombre ya existe");
                    } else if (listaMeteo.size() >= 20) {
                        System.out.println("No ha sido posible crear el contacto porque ha llegado al límite");
                    } else {
                        listaMeteo.put(sCiudad, iTempMax);
                        Meteo nuevoRegistro = new Meteo(sCiudad, dFecha, iTempMax, iTempMin);
                        salida.writeObject(nuevoRegistro+ "\n");
                        salida.flush();
                    }

                } else if (respuesta == 2) {
                    System.out.println("Introduce el nombre de la ciudad que estás buscando");
                    String buscarCiudad = sc.next();
                    String texto = entrada.readObject().toString();
                    while (texto != null){
                        if (texto.contains(buscarCiudad)){
                            System.out.println(texto);
                        }
                        texto = entrada.readObject().toString();
                    }
                } else if (respuesta == 3) {
                    System.out.println("Introduce el nombre de la ciudad que estás buscando");
                    String buscarCiudad = sc.next();
                    String texto = entrada.readObject().toString();
                    while (texto != null){
                        if (texto.contains(buscarCiudad)){
                            String[] numero = texto.split(" ");
                            Integer sumaTemp = Integer.parseInt(numero[3]) + Integer.parseInt(numero[4]);
                            System.out.println(texto);
                            System.out.println("Media de temperatura: "+sumaTemp/2);
                        }
                        texto = entrada.readObject().toString();
                    }
                }
            }

            System.out.println("¡Hasta pronto!");
            sc.close();
            salida.close();
            entrada.close();
        } catch (IOException | ClassNotFoundException ioex) {
            // TODO Auto-generated catch block
            ioex.printStackTrace();
        }
    }
}
