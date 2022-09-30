package entregashg.tienda;

public class Ordenadores {
    /* Ambos tipos de ordenadores se caracterizan por su código, RAM, CPU y por su precio */
    private String sCodigo;
    private int iRam;
    private String sCpu;
    private double dPrecio;
    /* Constructor */
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
    public String getCaracterísiticas(){
        String caracteristicas = "Codigo del ordenador "+getsCodigo()+ "\nCPU "+getsCpu()+ "\nRAM "+getiRam()+"\nPrecio "+getdPrecio();
        return caracteristicas;
    }

    @Override
    public String toString() {
        return "Ordenadores [dPrecio=" + dPrecio + ", iRam=" + iRam + ", sCodigo=" + sCodigo + ", sCpu=" + sCpu + "]";
    }
}
