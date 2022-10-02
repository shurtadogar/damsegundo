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
    public double distancia3d(Punto3d p1, Punto3d p2) {
        double distanciaPuntos;
        int x = p2.getiX() - p1.getiX();
        int y = p2.getiY() - p1.getiY();
        int z = p2.getiZ() - p1.getiZ();
        distanciaPuntos = Math.sqrt(x + y + z);
        return distanciaPuntos;
    }
    /* Método equals() para Punto3D, teniendo en cuenta que dos puntos son iguales si todas sus coordenadas son iguales.*/
    public boolean equals(Object obj) {
        Punto3d p2 = (Punto3d) obj;
        if (p2.getiX() != this.iX || p2.getiY() != this.iY || p2.getiZ() != this.iZ){
            return false;
        }
        else {
            return true;
        }
    }
    /* Método toString() */
    @Override
    public String toString() {
        return "Punto3d [z=" + iZ + "]";
    }
}