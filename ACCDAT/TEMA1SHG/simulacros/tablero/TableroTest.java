package simulacros.tablero;

import java.util.Scanner;

public class TableroTest {
    public static void main(String[] args) {
        Tablero miFlota = new Tablero();
        System.out.println(" Los simbolos del tablero son: @disparo acertado, ~ disparo fallado y · pte");

        System.out.println("Comienza el juego...");
        Scanner teclado = new Scanner(System.in);

        while (!miFlota.flotaHundida()){
            System.out.println("Introduce el numero de fila en la que quieres disparar (de 1 a 10)");
            int iFilaDisparo = teclado.nextInt();
            System.out.println("Introduce el numero de columna en la que quieres disparar (de 1 a 10)");
            int iColumnaDisparo = teclado.nextInt();
            boolean bRes = miFlota.disparo(iFilaDisparo, iColumnaDisparo);
            if (bRes) {
                System.out.println("Bien flota tocada");
            }
            else {
                System.out.println("Sigue jugando...");
            }
            miFlota.pintarDisparos();
        }
        teclado.close();
    }
}
