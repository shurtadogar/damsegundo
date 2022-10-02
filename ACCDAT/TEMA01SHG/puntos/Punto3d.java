package TEMA01SHG.puntos;

public class Punto3d extends Punto {
    /* Atributos */
    private int iZ;

    /* Constructor por defecto */
    public Punto3d() {
        this.iZ = 0;
    }
    /* Constructor recibiendo por parametros los valores */    
    public Punto3d(int paramiX, int paramiY, int paramiZ) {
        super(paramiX, paramiY);
        this.iZ = paramiZ;
    }
    /* Getters */
    public int getiZ() {
        return iZ;
    }
    /* Setters */
    public void setiZ(int paramiZ) {
        this.iZ = paramiZ;
    }
    /* Método distancia() para puntos 3D */
    public double distancia(Punto3d p1, Punto3d p2) {
        double distanciaPuntos;
        int x = p2.getiX() - p1.getiX();
        int y = p2.getiY() - p1.getiY();
        int z = p2.getiZ() - p1.getiZ();
        distanciaPuntos = Math.sqrt(x + y + z);
        return distanciaPuntos;
    }


    /* Método toString() */
    @Override
    public String toString() {
        return "Punto3d [z=" + iZ + "]";
    }
}
