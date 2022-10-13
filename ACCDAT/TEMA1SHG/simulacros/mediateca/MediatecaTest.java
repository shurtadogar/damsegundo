package simulacros.mediateca;

import java.util.TreeSet;

public class MediatecaTest {
    public static void main(String[] args) {
        SerieStreaming serie1 = new SerieStreaming("Breking Bad", 9);
        SerieStreaming serie2 = new SerieStreaming("Mr Robot", 4);
        SerieStreaming serie3 = new SerieStreaming("Stranger Things", 5);
        
        Videojuego v1 = new Videojuego("Minecraft", 8);
        Videojuego v2 = new Videojuego("Gta", 32);
        Videojuego v3 = new Videojuego("Red Dead Redemption", 180);

        serie1.aPendiente();

        v1.finalizar();

        serie2.empezar();

        v2.empezar();

        TreeSet<Object> miLista = new TreeSet<>();
        miLista.add(serie1);
        miLista.add(serie2);
        miLista.add(serie3);
        miLista.add(v1);
        miLista.add(v2);
        miLista.add(v3);

        System.out.println("Total: " +miLista);
    }
}
