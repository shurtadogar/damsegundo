package clase.coche;

import java.util.Scanner;

public class CocheTest {
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);

        Coche cocheSebas = new Coche("blanco", 180, 2.1f);
        Coche cocheMoises = new Coche("rojo", 120, 2.1f);
        Coche cocheAimane = new Coche("negro", 120, 2.1f);
        System.out.println("Coches creados");

        System.out.println(cocheSebas.toString());
        System.out.println(cocheMoises.toString());;
        System.out.println(cocheAimane.toString());;
        entrada.close();
    }
}
