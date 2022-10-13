package entregas.puntos;

public class PuntoTest {
    public static void main(String[] args) {
        Punto p1 = new Punto(7,5);
        Punto p2 = new Punto(7, 5);
        System.out.println("Distancia entre puntos "+p1.distancia(p1, p2));
        System.out.println("Los puntos son iguales: "+p1.equals(p2));

        Punto3d o1 = new Punto3d(0,5, 0);
        Punto3d o2 = new Punto3d(0, 5, 8);
        System.out.println("Distancia entre puntos "+o1.distancia3d(o1, o2));
        System.out.println("Los puntos son iguales: "+o1.equals(o2));
    }
}
