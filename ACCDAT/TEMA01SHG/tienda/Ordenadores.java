package entregashg.tienda;

public class Ordenadores {
    /* Atributos */
    private String sCodigo;
    private int iRam;
    private String sCpu;
    private double dPrecio;
    /* Constructores */  
    public Ordenadores() {
        this.sCodigo = null;
        this.iRam = 0;
        this.sCpu = null;
        this.dPrecio = 0.0;
    }

    public Ordenadores(String sCodigo, int iRam, String sCpu, double dPrecio) {
        this.sCodigo = sCodigo;
        this.iRam = iRam;
        this.sCpu = sCpu;
        this.dPrecio = dPrecio;
    }
    /* Getters */
    public String getsCodigo() {
        return sCodigo;
    }

    public int getiRam() {
        return iRam;
    }

    public String getsCpu() {
        return sCpu;
    }

    public double getdPrecio() {
        return dPrecio;
    }
    /* Setters */
    public void setsCodigo(String sCodigo) {
        this.sCodigo = sCodigo;
    }

    public void setiRam(int iRam) {
        this.iRam = iRam;
    }

    public void setsCpu(String sCpu) {
        this.sCpu = sCpu;
    }

    public void setdPrecio(double dPrecio) {
        this.dPrecio = dPrecio;
    }
    /* Metodos */
    public void getCarateristicas(){
        System.out.println("Las caracteristicas del PC son: ");
        System.out.println("Codigo: "+getsCodigo());
        System.out.println("RAM: "+getiRam());
        System.out.println("CPU: "+getsCpu());
        System.out.println("Precio: "+getdPrecio());
    }

    @Override
    public String toString() {
        return "Ordenadores [sCodigo=" + sCodigo + ", iRam=" + iRam + ", sCpu=" + sCpu + ", dPrecio=" + dPrecio + "]";
    }
}

