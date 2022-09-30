package entregashg.tienda;

public class Portatiles extends Ordenadores {
    /* Atributos */
    private double dPeso;
    /* Constructor */
    public Portatiles(String sCodigo, int iRam, String sCpu, double dPrecio, double dPeso) {
        super(sCodigo, iRam, sCpu, dPrecio);
        this.dPeso = dPeso;
    }
    /* Getters */
    public double getdPeso() {
        return dPeso;
    }
    /* Setters */
    public void setdPeso(double dPeso) {
        this.dPeso = dPeso;
    }
    /* Metodos */
    
    @Override
    public String getCaracterísiticas() {
        // TODO Auto-generated method stub
        return super.getCaracterísiticas()+ "\nPeso "+getdPeso();
    }

    @Override
    public String toString() {
        return "Portatiles [dPeso=" + dPeso + "]";
    }
   
}
