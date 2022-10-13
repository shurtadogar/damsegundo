package clase.instituto;

import java.util.ArrayList;
import java.util.Iterator;

public class Aulas {
    /* Atributos */
   private String sNombreAula;
   private ArrayList<Profesores> listaProfesores;
   private ArrayList<Alumnos> listaAlumnos;
   private ArrayList<String> listaMaterias;

   public Aulas(String paramsNombreAula, ArrayList<Profesores> paramProfesores, ArrayList<Alumnos> paramAlumno) throws Exception {
        this.sNombreAula = paramsNombreAula;
        this.listaProfesores = paramProfesores;
        
        if (Constantes.MAX_ESTUDIANTES >= paramAlumno.size()){
            this.listaAlumnos = paramAlumno;
        }
        else {
            throw new Exception("Maximo de alumnos superado");
        }

        listaProfesores.removeIf(o1 -> !(o1.getsAulaAsignada().equals(this.sNombreAula)));
        listaAlumnos.removeIf(n1 -> !(n1.getsAulaAsignada().equals(this.sNombreAula)));

        cargarListaMaterias();
    }

    /* Getters */
    public String getsNombreAula() {
        return sNombreAula;
    }

    public ArrayList<Profesores> getListaProfesores() {
        return listaProfesores;
    }

    public ArrayList<Alumnos> getListaAlumnos() {
        return listaAlumnos;
    }

    public ArrayList<String> getListaMaterias() {
        return listaMaterias;
    }

    /* Setters */
    public void setsNombreAula(String paramsNombreAula) {
        this.sNombreAula = paramsNombreAula;
    }

    public void setListaProfesores(ArrayList<Profesores> listaProfesores) {
        this.listaProfesores = listaProfesores;
    }

    public void setListaAlumnos(ArrayList<Alumnos> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public void setListaMaterias(ArrayList<String> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }

    /* Metodos */
    private void cargarListaMaterias() {
        this.listaMaterias = new ArrayList<String>();
        /* Recorremos la lista de profesor */
        Iterator<Profesores> iter = listaProfesores.iterator();
        while (iter.hasNext()){
            Profesores profeAux = iter.next();
            this.listaMaterias.add(profeAux.getsMateria());
        }
    }

    @Override
    public String toString() {
        return "Aulas [listaAlumnos=" + listaAlumnos + ", listaMaterias=" + listaMaterias + ", listaProfesores="
                + listaProfesores + ", sNombreAula=" + sNombreAula + "]";
    }
}
