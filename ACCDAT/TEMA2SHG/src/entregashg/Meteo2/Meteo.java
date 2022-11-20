package entregashg.Meteo2;

import java.io.Serializable;
import java.time.LocalDate;

public class Meteo implements Serializable {
    private String sCiudad;
    private LocalDate dFecha;
    private Integer iTempMin;
    private Integer iTempMax;
    
    public Meteo() {

    }

    public Meteo(String sCiudad, LocalDate dFecha, Integer iTempMax, Integer iTempMin) {
        this.sCiudad = sCiudad;
        this.dFecha = dFecha;
        this.iTempMax = iTempMax;
        this.iTempMin = iTempMin;
        ;
    }

    public String getsCiudad() {
        return sCiudad;
    }

    public LocalDate getdFecha() {
        return dFecha;
    }

    public Integer getiTempMax() {
        return iTempMax;
    }

    public Integer getiTempMin() {
        return iTempMin;
    }

    public void setsCiudad(String sCiudad) {
        this.sCiudad = sCiudad;
    }

    public void setdFecha(LocalDate dFecha) {
        this.dFecha = dFecha;
    }

    public void setiTempMax(Integer iTempMax) {
        this.iTempMax = iTempMax;
    }

    public void setiTempMin(Integer iTempMin) {
        this.iTempMin = iTempMin;
    }
    
    @Override
    public String toString() {
        return sCiudad + "      " + dFecha + "      " + iTempMax + "        " + iTempMin;
    } 
}
