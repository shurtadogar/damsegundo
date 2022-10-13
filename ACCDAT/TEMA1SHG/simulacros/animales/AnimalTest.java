package simulacros.animales;

import java.util.ArrayList;
import java.util.Collections;

public class AnimalTest {
    public static void main(String[] args) {
        ArrayList<Animal> listaAnimal = new ArrayList<Animal>();        
        listaAnimal.add(new Pajaro(30));
        listaAnimal.add(new Perro(60));
        listaAnimal.add(new Gato(20));
        listaAnimal.add(new Gato(90));
        listaAnimal.add(new Pajaro(70));
        Collections.sort(listaAnimal);
        System.out.println("Lista animales inicial="+listaAnimal);
        for (int ronda=1; ronda<=10; ronda++) {
            for (Animal animalActual: listaAnimal){
                animalActual.habla();                
                animalActual.come( (int) (Math.floor(Math.random()*3)) );
            }        
        }
        //Volvemos a ordenar
        Collections.sort(listaAnimal);
        System.out.println("\nLista animales final="+listaAnimal);
        System.out.println("-------------------FIN--------------------------");
    }
    
}
