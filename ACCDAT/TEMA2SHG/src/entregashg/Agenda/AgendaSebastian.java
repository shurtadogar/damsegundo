package entregashg.Agenda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class AgendaSebastian {
    final static String RUTA_FICHERO = "D:\\ACCDAT\\TEMA2SHG\\src\\entregashg\\Agenda\\";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> listaAgenda = new HashMap<String, Integer>();
        TreeMap<String, Integer> tOrdenar = new TreeMap<>();
        int respuesta = 0;
        String sTexto = "";
        String buscarcontacto;
        String nombre;
        Integer numero;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(RUTA_FICHERO + "agenda.txt"));
                BufferedReader br = new BufferedReader(new FileReader(RUTA_FICHERO + "agenda.txt"));) {

            while (respuesta != 4) {
                System.out.println("Opciones:\n1. Crear contacto\n2. Buscar por nombre\n3. Mostrar contactos\n4. Salir");
                respuesta = sc.nextInt();

                if (respuesta == 1) {
                    System.out.println("Nombre: ");
                    nombre = sc.next();
                    System.out.println("Número de teléfono: ");
                    numero = sc.nextInt();

                    if (listaAgenda.containsKey(nombre)) {
                        System.out.println("No ha sido posible crear el contacto porque ese nombre ya existe");
                    } else if (listaAgenda.size() >= 20) {
                        System.out.println("No ha sido posible crear el contacto porque ha llegado al límite");
                    } else {
                        listaAgenda.put(nombre, numero);
                        Agenda nuevocontacto = new Agenda(nombre, numero);
                        String str = String.valueOf(nuevocontacto);
                        bw.write(str + "\n");
                        bw.flush();
                    }

                } else if (respuesta == 2) {
                    System.out.println("Introduce el nombre del contacto que estás buscando");
                    buscarcontacto = sc.next();

                    sTexto = br.readLine();
                    while (sTexto != null) {
                        if (sTexto.contains(buscarcontacto)) {
                            System.out.println(sTexto);
                        }
                        sTexto = br.readLine();
                    }
                } else if (respuesta == 3) {
                    tOrdenar.putAll(listaAgenda);
                    System.out.println(tOrdenar);
                }
            }

            System.out.println("¡Hasta pronto!");
            sc.close();
            bw.close();
            br.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }

    }
}
