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
    final static String RUTA_FICHERO = "D:\\ACCDAT\\TEMA2SHG\\src\\entregashg\\Meteo";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        HashMap<String, Integer> listaMeteo = new HashMap<String, Integer>();
        int respuesta = 0;
        String sTexto = " ";
        String sCiudad;
        LocalDate dFecha = LocalDate.now();
        Integer iTempMin;
        Integer iTempMax;
        String titulo = "CIUDAD     FECHA       TEMP. MIN       TEMP. MAX";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(RUTA_FICHERO + "\\meteo.txt"));
                BufferedReader br = new BufferedReader(new FileReader(RUTA_FICHERO + "\\meteo.txt"));) {
            bw.write(titulo + "\n");
            while (respuesta != 4) {
                System.out.println("Opciones:\n1. Registrar nueva temperatura\n2. Mostrar historial de registros\n3. Mostrar media de temperatura\n4. Salir");
                respuesta = entrada.nextInt();
                if (respuesta == 1) {
                    System.out.println("Ciudad: ");
                    sCiudad = entrada.next();
                    System.out.println("Fecha: " + dFecha);
                    System.out.println("Temperatura Minima: ");
                    iTempMin = entrada.nextInt();
                    System.out.println("Temperatura Maxima: ");
                    iTempMax = entrada.nextInt();

                    if (listaMeteo.containsKey(sCiudad)) {
                        System.out.println("No ha sido posible crear el contacto porque ese nombre ya existe");
                    } else if (listaMeteo.size() >= 20) {
                        System.out.println("No ha sido posible crear el contacto porque ha llegado al límite");
                    } else {
                        listaMeteo.put(sCiudad, iTempMax);
                        Meteo nuevoRegistro = new Meteo(sCiudad, dFecha, iTempMin, iTempMax);
                        String str = String.valueOf(nuevoRegistro);
                        bw.write(str + "\n");
                        bw.flush();
                    }

                } else if (respuesta == 2) {
                    System.out.println("Introduce el nombre de la ciudad que estás buscando");
                    String buscarCiudad = entrada.next();
                    sTexto = br.readLine();
                    while (sTexto != null) {
                        if (sTexto.contains(buscarCiudad)) {
                            System.out.println(sTexto);
                        }
                        sTexto = br.readLine();
                    }
                } else if (respuesta == 3) {
                    String texto = br.readLine();
                    double sumaMin = 0;
                    double sumaMax= 0;
                    int media = 0;

                    while(texto !=null){
                        media++;
                        String[] numero = texto.split(" ");
                        sumaMin += Double.parseDouble(numero[2]);
                        sumaMax += Double.parseDouble(numero[3]);
                        System.out.println(texto);
                        texto=br.readLine();
                    }
                    System.out.println("Media altura = "+sumaMin/media);
                    System.out.println("Media edad = "+sumaMax/media);
                }
            }

            System.out.println("¡Hasta pronto!");
            entrada.close();
            bw.close();
            br.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }
    }
}
