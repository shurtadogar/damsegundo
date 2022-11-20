package entregashg.Meteo;

import java.time.LocalDate;

public class Meteo {
    private String sCiudad;
    private LocalDate dFecha;
    private int iTempMax;
    private int iTempMin;

    public Meteo(String sCiudad, LocalDate dFecha, int iTempMax, int iTempMin) {
        this.sCiudad = sCiudad;
        this.dFecha = dFecha;
        this.iTempMax = iTempMax;
        this.iTempMin = iTempMin;
    }

    public String getsCiudad() {
        return sCiudad;
    }
    public void setsCiudad(String sCiudad) {
        this.sCiudad = sCiudad;
    }
    public LocalDate getdFecha() {
        return dFecha;
    }
    public void setdFecha(LocalDate dFecha) {
        this.dFecha = dFecha;
    }
    public int getiTempMax() {
        return iTempMax;
    }
    public void setiTempMax(int iTempMax) {
        this.iTempMax = iTempMax;
    }
    public int getiTempMin() {
        return iTempMin;
    }
    public void setiTempMin(int iTempMin) {
        this.iTempMin = iTempMin;
    }

    @Override
    public String toString() {
        return  sCiudad + "     " + dFecha + "      " + iTempMax + "        " + iTempMin;
    }
}
