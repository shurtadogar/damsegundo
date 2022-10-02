package TEMA01SHG.tienda;

public class Portatiles extends Ordenadores {
    /* Atributos */
    private double dPeso;
    /* Constructor recibiendo por parametros los valores */
    public Portatiles(String paramsCodigo, int paramiRam, String paramsCpu, double paramdPrecio, double paramdPeso) {
        super(paramsCodigo, paramiRam, paramsCpu, paramdPrecio);
        this.dPeso = paramdPeso;
    }
    /* Getters */
    public double getdPeso() {
        return dPeso;
    }
    /* Setters */
    public void setdPeso(double paramdPeso) {
        this.dPeso = paramdPeso;
    }
    /* Método getCaracterísiticas() heredado de Ordenadores.java*/
    @Override
    public void getCarateristicas() {
        // TODO Auto-generated method stub
        super.getCarateristicas();
        System.out.println("Peso: "+getdPeso());
    }
    /* Método toString() para ver los valores */
    @Override
    public String toString() {
        return "Portatiles [dPeso=" + dPeso + "]";
    }
}
