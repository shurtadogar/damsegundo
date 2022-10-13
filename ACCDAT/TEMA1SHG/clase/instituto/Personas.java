package clase.instituto;

import java.util.Arrays;

public class Personas {
    /* Atributos */
    private String sNombre;
    private int iEdad;
    private String sAulaAsignada;
    
    /* Constructores */
    public Personas(String paramsNombre, int paramiEdad, String paramsAulaAsignada) throws Exception {
        /* Comprobamos si los objetos introducidos son instancias de tipo Profesores o Alumnos */
        if (this instanceof Profesores) {
            /* Comprobamos que el nombre introducido se encuentre en Constantes.LISTAS_PROFESORES  */
           if  (Arrays.asList(Constantes.LISTA_PROFESORES).contains(paramsNombre)) {
                this.sNombre = paramsNombre;
            }
            else {
                throw new Exception ("Error! El profesor no existe.");
            }
        }
        else if (this instanceof Alumnos){
            /* Comprobamos que el nombre introducido se encuentre en Constantes.LISTAS_ALUMNOS */
            if  (Arrays.asList(Constantes.LISTA_ALUMNOS).contains(paramsNombre)) {
                this.sNombre = paramsNombre;
            }
            else {
                throw new Exception ("Error! El alumno no existe.");
            }
        }
        this.iEdad = paramiEdad;
        /* Comprobamos que el aula introducido se encuentre en Constantes.LISTAS_CLASES */
        if  (Arrays.asList(Constantes.LISTA_CLASES).contains(paramsAulaAsignada)) {
            this.sAulaAsignada = paramsAulaAsignada;
        }
        else {
            throw new Exception ("Error! El aula no existe.");
        }
    }
    
    /* Getters */
    public String getsNombre() {
        return sNombre;
    }

    public int getiEdad() {
        return iEdad;
    }

    public String getsAulaAsignada() {
        return sAulaAsignada;
    }
    /* Setters */
    public void setsNombre(String paramsNombre) {
        this.sNombre = paramsNombre;
    }

    public void setiEdad(int paramiEdad) {
        this.iEdad = paramiEdad;
    }

    public void setsAulaAsignada(String paramsAulaAsignada) {
        this.sAulaAsignada = paramsAulaAsignada;
    }

     /* Metodos */
    @Override
    public String toString() {
        return "Personas [iEdad=" + iEdad + ", sAulaAsignada=" + sAulaAsignada + ", sNombre=" + sNombre + "]";
    }
}
