package clase.instituto;

public class Alumnos extends Personas {
    /* Atributos */
    private int iNota;

    /* Constructor */
    public Alumnos(String paramsNombre, int paramiEdad, String paramsAulaAsignada, int iNota) throws Exception {
        super(paramsNombre, paramiEdad, paramsAulaAsignada);
        this.iNota = iNota;
    }

    /* Getters */
    public double getiNota() {
        return iNota;
    }
    
    /* Setters */
    public void setiNota(int iNota) {
        this.iNota = iNota;
    }

    /* Metodos */
    @Override
    public String toString() {
        return "Alumnos [iNota=" + iNota + "]";
    }
}
