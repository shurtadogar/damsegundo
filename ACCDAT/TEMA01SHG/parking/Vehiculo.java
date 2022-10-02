package TEMA01SHG.parking;

public class Vehiculo {
    /* Atributos de vehiculo */
    private String sMatricula;
    private String dFechaInicio;
    private String dFechaFin;
    
    /* Constructor */
    public Vehiculo(String paramsMatricula) {
        this.sMatricula = paramsMatricula;
    }
    
    /* Getters */
    public String getsMatricula() {
        return sMatricula;
    }

    public String getdFechaInicio() {
        return dFechaInicio;
    }

    public String getdFechaFin() {
        return dFechaFin;
    }

    /* Setters */
    public void setMatricula(String paramsMatricula) {
        this.sMatricula = paramsMatricula;
    }

    public void setdFechaInicio(String dFechaInicio) {
        this.dFechaInicio = dFechaInicio;
    }

    public void setdFechaFin(String dFechaFin) {
        this.dFechaFin = dFechaFin;
    }
    /* Método toString() */
    @Override
    public String toString() {
        return "Vehiculo [matricula=" + sMatricula + ", dFechaInicio=" + dFechaInicio + ", dFechaFin=" + dFechaFin + "]";
    }
}
