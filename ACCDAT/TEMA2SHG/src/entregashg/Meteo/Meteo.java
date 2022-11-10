package entregashg.Meteo;

import java.time.LocalDate;

public class Meteo {
    private String sCiudad;
    private LocalDate dFecha;
    private Integer iTempMin;
    private Integer iTempMax;
    
    public Meteo() {

    }

    public Meteo(String sCiudad, LocalDate dFecha, Integer iTempMin, Integer iTempMax) {
        this.sCiudad = sCiudad;
        this.dFecha = dFecha;
        this.iTempMin = iTempMin;
        this.iTempMax = iTempMax;
    }

    public String getsCiudad() {
        return sCiudad;
    }

    public LocalDate getdFecha() {
        return dFecha;
    }

    public Integer getiTempMin() {
        return iTempMin;
    }

    public Integer getiTempMax() {
        return iTempMax;
    }

    public void setsCiudad(String sCiudad) {
        this.sCiudad = sCiudad;
    }

    public void setdFecha(LocalDate dFecha) {
        this.dFecha = dFecha;
    }

    public void setiTempMin(Integer iTempMin) {
        this.iTempMin = iTempMin;
    }

    public void setiTempMax(Integer iTempMax) {
        this.iTempMax = iTempMax;
    }

    @Override
    public String toString() {
        return sCiudad + "          " + dFecha + "          " + iTempMin + "          " + iTempMax;
    }
}
