package clase.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente("Ada", "Lovelance", 51);
        Cliente cli2 = new Cliente("Alan", "Turing", 25);
        Cliente cli3 = new Cliente("Margaret", "Hamilton", 42);
        Cliente cli4 = new Cliente("Ken", "Thomson", 18);
        Cliente cli5 = new Cliente("James", "Gosling", 34); 

        /* Incluir los clientes en una lista */
        List<Cliente> listaCliente = Arrays.asList(cli1, cli2, cli3, cli4, cli5);
        System.out.println("\nLista de clientes sin ordenar:"+listaCliente);
        /* Ordenamos los clientes */
        listaCliente.sort(new ClienteEdadComparator());
        System.out.println("\nLista de clientes ordenada: "+listaCliente);

        /* Solucion 2: Inner class */
        List<Cliente> listaCliente2 = Arrays.asList(cli1, cli2, cli3, cli4, cli5);
        System.out.println("\nLista de clientes 2 sin ordenar:"+listaCliente2);
        listaCliente2.sort(new Comparator<Cliente>() {
                @Override
                public int compare(Cliente o1, Cliente o2) {
                     /* Si A > B devolver 1, si A = B devuelve 0*/
                    return o1.getiEdad() > o2.getiEdad() ? 1 : -1; //OPERADORES CONDICIONALES
                }
            }
        );
        System.out.println("\nLista de clientes 2 ordenada:"+listaCliente2);
        
        /* Solucion 3: Java Lambda */
        List<Cliente> listaCliente3 = Arrays.asList(cli1, cli2, cli3, cli4, cli5);
        System.out.println("\nLista de clientes 3 sin ordenar:"+listaCliente3);
        listaCliente3.sort((Cliente o1, Cliente o2) -> {return o1.getiEdad() > o2.getiEdad() ? 1 : -1;});
        System.out.println("\nLista de clientes 3 ordenada:"+listaCliente3);

        /* Solucion 4: Java Lambda Simplificada */
        List<Cliente> listaCliente4 = Arrays.asList(cli1, cli2, cli3, cli4, cli5);
        System.out.println("\nLista de clientes 4 sin ordenar:"+listaCliente4);
        listaCliente4.sort((o1 , o2) -> {return o1.getiEdad() > o2.getiEdad() ? 1 : -1;});
        System.out.println("\nLista de clientes 4 ordenada:"+listaCliente4);

        /* Solucion 5: Java Lamba Super Simplificada */
        List<Cliente> listaCliente5 = Arrays.asList(cli1, cli2, cli3, cli4, cli5);
        System.out.println("\nLista de clientes 5 sin ordenar:"+listaCliente5);
        listaCliente5.sort((o1 , o2) -> o1.getiEdad() > o2.getiEdad() ? 1 : -1);
        System.out.println("\nLista de clientes 5 ordenada:"+listaCliente5);

        /* Ordenar por nombre */
        List<Cliente> listaCliente6 = Arrays.asList(cli1, cli2, cli3, cli4, cli5);
        System.out.println("\nLista de clientes 6 sin ordenar:"+listaCliente6);
        listaCliente6.sort ((o1, o2) -> o1.getsNombre().compareTo(o2.getsNombre()));
        System.out.println("\nLista de clientes 6 ordenada por nombre:"+listaCliente6);

        /* Quitar los nombres que empiezan por A */
        List<Cliente> listaCliente7 = Arrays.asList(cli1, cli2, cli3, cli4, cli5);
        ArrayList<Cliente> lista7aux = new ArrayList<Cliente>(listaCliente7);
        lista7aux.removeIf(o1 -> o1.getsNombre().startsWith("A"));
        System.out.println("\nLista de clientes 7 ordenada sin nombres que empiecen por A:"+lista7aux);

        /* Quitar las personas que tengan mas de 30*/
        List<Cliente> listaCliente8 = Arrays.asList(cli1, cli2, cli3, cli4, cli5);
        ArrayList<Cliente> lista8aux = new ArrayList<Cliente>(listaCliente8);
        lista8aux.removeIf(o1 -> o1.getiEdad()>30);
        System.out.println("\nLista de clientes 7 eliminando personas mayores de 30:"+lista8aux);
    }
}