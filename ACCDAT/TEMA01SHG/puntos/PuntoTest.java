package entregashg.puntos;

public class PuntoTest {
    public static void main(String[] args) {
        Punto p1 = new Punto();
        Punto p2 = new Punto(10, 5);
        System.out.println("Distancia entre puntos "+p1.distanciaPuntos(p1, p2));
    }
}
