package entregashg.Banco;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BancoSebastian {
    final static String RUTA_FICHERO = "D:\\TEMA02SHG\\src\\entregashg\\Banco";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List<Cliente> listaclientes = new ArrayList<Cliente>();
        int Opcion = 0;
        String Dnieliminar, sTexto, dni, nombre, fechanacSTR;
        LocalDate fechanac;
        LocalDate FechaActual = LocalDate.now();
        double saldo;
        double mediasaldos = 0;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(RUTA_FICHERO + "\\Clientes.txt"));
                BufferedReader br = new BufferedReader(new FileReader(RUTA_FICHERO + "\\Clientes.txt"))) {

            while (Opcion != 5) {
                System.out.println("1 Alta de cliente\n2 Baja de cliente\n3 Lista de clientes\n4 Saldo medio\n5 Salir");
                Opcion = sc.nextInt();

                if (Opcion == 1) {
                    System.out.println("DNI:");
                    dni = sc.next();
                    System.out.println("Nombre:");
                    nombre = sc.next();
                    System.out.println("Fecha nacimiento:");
                    fechanacSTR = sc.next();
                    fechanac = LocalDate.parse(fechanacSTR, formatter);
                    System.out.println("Saldo:");
                    saldo = sc.nextDouble();

                    String textainsertar = dni + " " + nombre + " " + fechanac + " " + saldo;
                    bw.write(textainsertar + "\n");
                    bw.flush();
                    sTexto = br.readLine();

                    while (sTexto != null) {
                        String[] numero = sTexto.split(" ");

                        dni = (numero[0]);
                        nombre = (numero[1]);
                        fechanac = LocalDate.parse(numero[2]);
                        saldo = Double.parseDouble(numero[3]);

                        Cliente cli = new Cliente(dni, nombre, fechanac, saldo);
                        listaclientes.add(cli);
                        sTexto = br.readLine();
                    }
                }

                else if (Opcion == 2) {

                    System.out.println("Introduce el DNI del cliente que desea eliminar");
                    Dnieliminar = sc.next();

                    for (int i = 0; i < listaclientes.size(); i++) {
                        if (listaclientes.get(i).getsDni().equalsIgnoreCase(Dnieliminar)) {
                            listaclientes.remove(i);
                        }
                    }
                    for (int i = 0; i < listaclientes.size(); i++) {
                        String str = String.valueOf(listaclientes.get(i));
                        bw.write(str + "\n");
                        bw.flush();
                    }

                } else if (Opcion == 3) {
                    listaclientes.sort(Comparator.comparing(Cliente::getdSaldo));

                    for (Cliente cli : listaclientes) {
                        Period edad = Period.between(cli.getLdFechaNac(), FechaActual);
                        System.out.println(cli + " edad= " + edad.getYears());
                    }
                }

                else if (Opcion == 4) {
                    for (Cliente cli : listaclientes) {
                        mediasaldos += cli.getdSaldo();
                    }
                    if (mediasaldos == 0) {
                        System.out.println("No hay saldos que calcular");
                    } else {
                        mediasaldos /= listaclientes.size();
                        System.out.println("La media de saldos es: " + mediasaldos);
                    }
                }
            }
            /* FIN */
            sc.close();
            br.close();
            bw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
