package clase.electrodomestico;

/* Crea una clase llamada Electrodoméstico con los siguientes atributos:
   marca
   modelo
   precio
   color
   potencia en watios
   horas de utilización al día
   días de utilización al año
   precio de la energía (€/kWh) */
public class Electrodomestico {
    /* Constantes */
    protected static String MARCA_BASE = "Bosch";
    protected static String MODELO_BASE = "7200";
    protected static int PRECIO_BASE = 400;
    protected static String COLOR_BASE = "Gris";
    protected static double POTENCIA_BASE = 2300;
    protected static int HORASUSO_BASE = 1;
    protected static int DIASUSO_BASE = 3;
    protected static double PRECIOENERGIA_BASE = 0.40397;

    /* Atributos */
    private String sMarca;
    private String sModelo;
    private double dPrecio;
    private String sColor;
    private double dPotenciaVatios;
    private int iHorasUso;
    private int iDiasUso;
    private double dPrecioEnergia;
    
    /* constructor por defecto (marca bosch, modelo 7200, precio 400€, color gris, potencia 2300W, 1h al día ,3 veces por semana y 0,40397 €/kWh */
    public Electrodomestico( ) {
        this.sMarca = MARCA_BASE;
        this.sModelo = MODELO_BASE;
        this.dPrecio = PRECIO_BASE;
        this.sColor = COLOR_BASE;
        this.dPotenciaVatios = POTENCIA_BASE;
        this.iHorasUso = HORASUSO_BASE;
        this.iDiasUso = DIASUSO_BASE;
        this.dPrecioEnergia = PRECIOENERGIA_BASE;
    }

    /* constructor con marca, modelo y precio. Resto por defecto */
    public Electrodomestico(String sMarca, String sModelo, double dPrecio) {
        this.sMarca = sMarca;
        this.sModelo = sModelo;
        this.dPrecio = dPrecio;
        this.sColor = null;
        this.dPotenciaVatios = 0;
        this.iHorasUso = 0;
        this.iDiasUso = 0;
        this.dPrecioEnergia = 0;
    }

    /* constructor con todos los atributos como parámetro */
    public Electrodomestico(String sMarca, String sModelo, double dPrecio, String sColor, double dPotenciaVatios,
            int iHorasUso, int iDiasUso, double dPrecioEnergia) {
        this.sMarca = sMarca;
        this.sModelo = sModelo;
        this.dPrecio = dPrecio;
        this.sColor = sColor;
        this.dPotenciaVatios = dPotenciaVatios;
        this.iHorasUso = iHorasUso;
        this.iDiasUso = iDiasUso;
        this.dPrecioEnergia = dPrecioEnergia;
    }

    /* Getters */
    public String getsMarca() {
        return sMarca;
    }

    public String getsModelo() {
        return sModelo;
    }

    public double getdPrecio() {
        return dPrecio;
    }

    public String getsColor() {
        return sColor;
    }

    public double getdPotenciaVatios() {
        return dPotenciaVatios;
    }

    public int getiHorasUso() {
        return iHorasUso;
    }

    public int getiDiasUso() {
        return iDiasUso;
    }

    public double getdPrecioEnergia() {
        return dPrecioEnergia;
    }
    
    /* Setters */
    public void setsMarca(String sMarca) {
        this.sMarca = sMarca;
    }

    public void setsModelo(String sModelo) {
        this.sModelo = sModelo;
    }

    public void setdPrecio(double dPrecio) {
        this.dPrecio = dPrecio;
    }

    public void setsColor(String sColor) {
        this.sColor = sColor;
    }

    public void setdPotenciaVatios(double dPotenciaVatios) {
        this.dPotenciaVatios = dPotenciaVatios;
    }

    public void setiHorasUso(int iHorasUso) {
        this.iHorasUso = iHorasUso;
    }

    public void setiDiasUso(int iDiasUso) {
        this.iDiasUso = iDiasUso;
    }

    public void setdPrecioEnergia(double dPrecioEnergia) {
        this.dPrecioEnergia = dPrecioEnergia;
    }

    /* consumoAnual(): devuelve el consumo energético anual en euros de ese electrodoméstico. Busca la fórmula en internet. */
    public double consumoAnual() {
        double dConsumo;
        dConsumo = (getdPotenciaVatios()/1000)*iHorasUso*iDiasUso*dPrecioEnergia;
        return dConsumo;
    }

    @Override
    public String toString() {
        return "Electrodomestico [dPotenciaVatios=" + dPotenciaVatios + ", dPrecio=" + dPrecio + ", dPrecioEnergia="
                + dPrecioEnergia + ", iDiasUso=" + iDiasUso + ", iHorasUso=" + iHorasUso + ", sColor=" + sColor
                + ", sMarca=" + sMarca + ", sModelo=" + sModelo + "]";
    }
}
