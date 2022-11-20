package entregashg.Meteo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public class MeteoSebastian {
    final static String RUTA_FICHERO = "D:\\TEMA02SHG\\src\\entregashg\\Meteo";

    public static void main(String[] args) {
        /* Scanner */
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> listCiudad = new HashMap<String, Integer>();
        int respuesta = 0;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(RUTA_FICHERO + "\\meteo.txt"));
                BufferedReader br = new BufferedReader(new FileReader(RUTA_FICHERO + "\\meteo.txt"));) {
                bw.write("CIUDAD        FECHA       TEMP.MAX        TEMP.MIN\n");
            while (respuesta != 4) {
                System.out.println("Opciones:\n1. Nuevo registro.\n2. Buscar registros.\n3. Media de temperaturas\n4. Salir");
                respuesta = sc.nextInt();
                if (respuesta == 1) {
                    System.out.println("Ciudad:");
                    String nombre = sc.next();
                    LocalDate fecha = LocalDate.now();
                    System.out.println("Fecha actual : " + fecha);
                    System.out.println("Temperatura Maxima: ");
                    Integer tempMax = sc.nextInt();
                    System.out.println("Temperatura Minima: ");
                    Integer tempMin = sc.nextInt();

                    if (listCiudad.size() >= 20) {
                        System.out.println("No ha sido posible crear el registro porque ha llegado al límite");
                    } else {
                        listCiudad.put(nombre, tempMax);
                        Meteo nuevoRegistro = new Meteo(nombre, fecha, tempMax, tempMin);
                        String str = String.valueOf(nuevoRegistro);
                        bw.write(str + "\n");
                        bw.flush();
                    }

                } else if (respuesta == 2) {
                    System.out.println("Introduce el nombre de la ciudad que estás buscando: ");
                    String ciudad = sc.next();
                    String texto = br.readLine();
                    while (texto != null) {
                        if (texto.contains(ciudad)) {
                            System.out.println(texto);
                        }
                        texto = br.readLine();
                    }
                }

                else if (respuesta == 3) {
                    System.out.println("Introduce el nombre de la ciudad que estás buscando: ");
                    String ciudad = sc.next();
                    String texto = br.readLine();
                    while (texto != null) {
                        if (texto.contains(ciudad)) {
                            texto = br.readLine();
                            String[] numero = texto.split(" ");
                            int sumaTemp = Integer.parseInt(numero[3]) + Integer.parseInt(numero[4]);
                            System.out.println(texto);
                            texto = br.readLine();
                            System.out.println("Media de temperatura = " + sumaTemp / 2);
                        }
                        texto = br.readLine();
                    }
                }
            }
            System.out.println("Gracias por usar nuestra agenda");
            sc.close();
            bw.close();
            br.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }
    }
}
