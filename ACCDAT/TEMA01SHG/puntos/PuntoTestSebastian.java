package TEMA01SHG.puntos;

public class PuntoTestSebastian {
    public static void main(String[] args) {
        Punto p1 = new Punto();
        Punto p2 = new Punto(10, 5);
        System.out.println("Distancia entre puntos "+p1.distancia(p1, p2));
       
    }
}
