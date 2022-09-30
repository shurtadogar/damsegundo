package entregashg.puntos;

public class Punto {
    /* Atributos */
    private int x;
    private int y;
    
    /* Constructores */
    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    /* Getters */
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    /* Setters */
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    /* Metodos */
    public double distanciaPuntos(Punto p1, Punto p2){
        double iDistancia;
        int x = p2.getX() - p1.getX();
        int y = p2.getY() - p1.getY();
        iDistancia = Math.sqrt(x*x + y*y);
        return iDistancia;
    }

    @Override
    public String toString() {
        return "Punto [x=" + x + ", y=" + y + "]";
    }
}
