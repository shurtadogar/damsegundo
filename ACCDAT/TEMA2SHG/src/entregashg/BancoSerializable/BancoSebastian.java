package entregashg.BancoSerializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BancoSebastian {
    final static File RUTA_FICHERO = new File("D:\\TEMA02SHG\\src\\entregashg\\Banco");

    public static void main(String[] args) {
        /* Scanner */
        Scanner sc = new Scanner(System.in);
        /* Formateador de fechas */
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        /* Lista de clientes */
        List<Cliente> listaclientes = new ArrayList<Cliente>();
        /* Variables */
        int Opcion = 0;
        LocalDate FechaActual = LocalDate.now();
        double saldo;
        double mediasaldos = 0;

        /* Creo los buffers y el fichero que voy a utilizar */
        try (ObjectOutputStream escribir = new ObjectOutputStream(
                new FileOutputStream(RUTA_FICHERO + "\\clientes.dat"));
                ObjectInputStream leer = new ObjectInputStream(new FileInputStream(RUTA_FICHERO + "\\clientes.dat"))) {

            while (Opcion != 5) {
                System.out.println("1 Alta de cliente\n2 Baja de cliente\n3 Lista de clientes\n4 Saldo medio\n5 Salir");
                Opcion = sc.nextInt();

                if (Opcion == 1) {
                    System.out.println("DNI:");
                    String dni = sc.next();

                    System.out.println("Nombre:");
                    String nombre = sc.next();

                    System.out.println("Fecha nacimiento:");
                    String fecha = sc.next();
                    LocalDate fechaNacimiento = LocalDate.parse(fecha, formatter);

                    System.out.println("Saldo:");
                    saldo = sc.nextDouble();

                    Cliente cli = new Cliente(dni, nombre, fechaNacimiento, saldo);
                    listaclientes.add(cli);
                    escribir.writeObject(listaclientes);

                }

                else if (Opcion == 2) {
                    System.out.println("Introduce el DNI del cliente que desea eliminar");
                    String dni = sc.next();
                    Cliente cli = new Cliente();
                    cli.resetearFichero(RUTA_FICHERO);
                    for (int i = 0; i < listaclientes.size(); i++) {
                        if (listaclientes.get(i).getsDni().equalsIgnoreCase(dni)) {
                            listaclientes.remove(i);
                        }
                    }
                    for (int i = 0; i < listaclientes.size(); i++) {
                        escribir.writeObject(listaclientes.get(i));
                        escribir.flush();
                    }

                } else if (Opcion == 3) {
                    try {
                        List<Cliente> leerClientes = (List<Cliente>) leer.readObject();
                        leerClientes.sort(Comparator.comparing(Cliente::getdSaldo));
                        for (Cliente cli : leerClientes) {
                            Period edad = Period.between(cli.getLdFechaNac(), FechaActual);
                            System.out.println(cli + " edad= " + edad.getYears());
                        }
                    } catch (ClassNotFoundException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }

                else if (Opcion == 4) {
                    try {
                        List<Cliente> leerClientes = (List<Cliente>) leer.readObject();
                        for (Cliente cli : leerClientes) {
                            mediasaldos += cli.getdSaldo();
                        }
                        if (mediasaldos == 0) {
                            System.out.println("No hay saldos que calcular");
                        } else {
                            mediasaldos /= leerClientes.size();
                            System.out.println("La media de saldos es: " + mediasaldos);
                        }
                    } catch (ClassNotFoundException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
            sc.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
