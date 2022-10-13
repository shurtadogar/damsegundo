package clase.instituto;

import java.util.ArrayList;

public class InstitutoTest {
    public static void main(String[] args) {
        try {
           Profesores profeRoberto = new Profesores("Roberto", 30, "2.6", "Programacion");
           Profesores profeJuan = new Profesores("Juan", 36, "2.6", "Base de datos");
           Profesores profeMiguel = new Profesores("Miguel", 40, "2.7", "Montaje");
           ArrayList<Profesores> listaProfesores = new ArrayList<Profesores>();
           listaProfesores.add(profeRoberto);
           listaProfesores.add(profeJuan);
           listaProfesores.add(profeMiguel);

           Alumnos alumnoSebas = new Alumnos("Sebas", 25, "2.6", 9);
           Alumnos alumnoAimane = new Alumnos("Aimane", 22, "2.6", 8);
           ArrayList<Alumnos> listaAlumnos = new ArrayList<Alumnos>();
           listaAlumnos.add(alumnoSebas);
           listaAlumnos.add(alumnoAimane);

            Aulas aula26 = new Aulas("2.6", listaProfesores, listaAlumnos);
            System.out.println("\nAula2.6 incluye=" + aula26);

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
