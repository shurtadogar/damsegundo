package clase.instituto;

public class Profesores extends Personas {
    /* Atributos */
    private String sMateria;
    /* Constructor */
    public Profesores(String paramsNombre, int paramiEdad, String paramsAulaAsignada, String sMateria) throws Exception {
        super(paramsNombre, paramiEdad, paramsAulaAsignada);
        this.sMateria = sMateria;
    }
    /* Getters */
    public String getsMateria() {
        return sMateria;
    }
    /* Setters */
    public void setsMateria(String sMateria) {
        this.sMateria = sMateria;
    }

}
