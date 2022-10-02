package TEMA01SHG.puntos;

public class Punto {
    /* Atributos (X) (Y)*/
    protected int iX;
    protected int iY;
    
    /* Constructor por defecto da valores de 0 a los atributos */
    public Punto() {
        this.iX = 0;
        this.iY = 0;
    }
    /* Constructor recibiendo por parametros los valores */
    public Punto(int paramiX, int paramiY) {
        this.iX = paramiX;
        this.iY = paramiY;
    }
    
    /* Getters */
    public int getiX() {
        return iX;
    }

    public int getiY() {
        return iY;
    }

    /* Setters */
    public void setiX(int paramiX) {
        this.iX = paramiX;
    }

    public void setiY(int paramiY) {
        this.iY = paramiY;
    }

    /* Método distancia(Punto otroPunto) que devuelve la distancia a otro punto que se le pasa como parámetro. */
    public double distancia(Punto p1, Punto p2){
        double iDistancia;
        int x = p2.getiX() - p1.getiX();
        int y = p2.getiY() - p1.getiY();
        iDistancia = Math.sqrt(x*x + y*y);
        return iDistancia;
    }

    /* Método equals() para Punto teniendo en cuenta que dos puntos son iguales si todas sus coordenadas son iguales.*/
    @Override
    public boolean equals(Object obj) {
        Punto p2 = (Punto) obj;
        if (p2.getiX() != this.iX || p2.getiY() != this.iY){
            return false;
        }
        else {
            return true;
        }
    }

    /* Método toString() */
    @Override
    public String toString() {
        return "Punto [x=" + iX + ", y=" + iY + "]";
    }
}
