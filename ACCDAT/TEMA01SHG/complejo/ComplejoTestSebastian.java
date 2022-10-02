package TEMA01SHG.complejo;

import java.util.Scanner;

public class ComplejoTestSebastian {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double x, y;
        /* Creamos los complejos usando el constructor por defecto dara un valor de (0, 0) */
        Complejo c1 = new Complejo();
        Complejo c2 = new Complejo();
        /* Pasamos a dar valores a la dPReal(x) y dPImag(y) de cada numero complejo */
        System.out.println("Introduzca valor de la parte real del primer complejo:");
        x = entrada.nextDouble();
        System.out.println("Introduzca valor de la parte imaginaria del primer complejo:");
        y = entrada.nextDouble();
        c1.asignar(x, y);
        System.out.println("Introduzca valor de la parte real del segundo complejo:");
        x = entrada.nextDouble();
        System.out.println("Introduzca valor de la parte imaginaria del segundo complejo:");
        y = entrada.nextDouble();
        c2.asignar(x, y);
        
        System.out.println("Primer complejo: ");
        c1.imprimir();
        System.out.println("Segundo complejo: ");
        c2.imprimir();
        System.out.println("Suma de los dos complejos: "+c1.sumar(c1, c2));
        
        entrada.close();
    }
}
