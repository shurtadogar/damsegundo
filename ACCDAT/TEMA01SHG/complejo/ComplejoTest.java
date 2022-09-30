package entregashg.complejo;

public class ComplejoTest {
    public static void main(String[] args) {
        Complejo c1 = new Complejo();
        Complejo c2 = new Complejo();

        c1.asignar(0, 0);
        c2.asignar(2, 0);
        
        System.out.println("Primer complejo: ");
        c1.imprimir();
        System.out.println("Segundo complejo: ");
        c2.imprimir();
        System.out.println("Suma de los dos complejos: "+c1.sumarComplejo(c1, c2));
    }
}
