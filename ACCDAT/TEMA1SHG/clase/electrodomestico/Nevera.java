package clase.electrodomestico;

public class Nevera extends Electrodomestico{
    /* Constantes */
    protected static double CAPACIDADFRIGO_BASE = 300;
    protected static double CAPACIDADCONG_BASE = 200 ;

    /* Atributos */
    private double dCapacidadFrigo;
    private double dCapacidadCong;
    private int iSonoridad;
   

    /* Constructores */
    public Nevera(String sMarca, String sModelo, double dPrecio, String sColor, double dPotenciaVatios, int iHorasUso,
    int iDiasUso, double dPrecioEnergia, double dCapacidadFrigo, double dCapacidadCong, int iSonoridad) {
        super(sMarca, sModelo, dPrecio, sColor, dPotenciaVatios, iHorasUso, iDiasUso, dPrecioEnergia);
        this.dCapacidadFrigo = dCapacidadFrigo;
        this.dCapacidadCong = dCapacidadCong;
        this.iSonoridad = iSonoridad;
    }

    /* Getters */
    public double getdCapacidadFrigo() {
        return dCapacidadFrigo;
    }

    public double getdCapacidadCong() {
        return dCapacidadCong;
    }

    public int getiSonoridad() {
        return iSonoridad;
    }

    /* Setters */
    public void setdCapacidadFrigo(double dCapacidadFrigo) {
        this.dCapacidadFrigo = dCapacidadFrigo;
    }

    public void setdCapacidadCong(double dCapacidadCong) {
        this.dCapacidadCong = dCapacidadCong;
    }

    public void setiSonoridad(int iSonoridad) {
        this.iSonoridad = iSonoridad;
    }  

    public double consumoAnual () {
        double dCosteAnual = super.consumoAnual();
        if (dCapacidadCong > 200 || dCapacidadFrigo > 300) {
            dCosteAnual += 50;
        }
        return dCosteAnual;
    }

    @Override
    public String toString() {
        return "Nevera [dCapacidadCong=" + dCapacidadCong + ", dCapacidadFrigo=" + dCapacidadFrigo + ", iSonoridad="
                + iSonoridad + "]";
    }
}

