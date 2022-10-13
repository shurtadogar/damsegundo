package clase.electrodomestico;

public class Television extends Electrodomestico {
    /* Atributos */
    private int iResolucion;

    /* Constructores */
    public Television(String sMarca, String sModelo, double dPrecio, String sColor, double dPotenciaVatios,
            int iHorasUso, int iDiasUso, double dPrecioEnergia, int iResolucion) {
        super(sMarca, sModelo, dPrecio, sColor, dPotenciaVatios, iHorasUso, iDiasUso, dPrecioEnergia);
        this.iResolucion = iResolucion;
    }
    /* constructor por defecto con un valor que tu decidas. */
    public Television() throws Exception{
        this(MARCA_BASE, MODELO_BASE, PRECIO_BASE, COLOR_BASE, POTENCIA_BASE, HORASUSO_BASE, (DIASUSO_BASE*3), PRECIOENERGIA_BASE, 0);
    }

    /* constructor con la resolución que se indique resto de atributos heredados. Hay que llamar al constructor de la clase padre. */
    public Television(int paramResolucion) throws Exception{
        this(MARCA_BASE, MODELO_BASE, PRECIO_BASE, COLOR_BASE, POTENCIA_BASE, HORASUSO_BASE, (DIASUSO_BASE*3), PRECIOENERGIA_BASE, paramResolucion);
        //yo lo último lo añado al super pero, puedes ponerlo con el this como el constructor principal
    }

    /* Getters */
    public int getiResolucion() {
        return iResolucion;
    }
    /* Setters */
    public void setiResolucion(int iResolucion) {
        this.iResolucion = iResolucion;
    }

    /* consumoAnual(). Si el televisor tiene una resolución mayor de 50 pulgadas aplicar tasa adicional de 30€ al consumo.  */
    public double consumoAnual(){
        double dConsumo;
        if (iResolucion > 50){
            dConsumo = super.consumoAnual()+30;
        }
        else {
            dConsumo = super.consumoAnual();
        }
        return dConsumo;
    }
    
    @Override
    public String toString() {
        return "Television [iResolucion=" + iResolucion + "]";
    }

}
