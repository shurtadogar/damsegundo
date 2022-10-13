package clase.interfaz;

public class Timbre implements Sonido {

    @Override
    public void emitirSonido() {
        // TODO Auto-generated method stub
        System.out.println("RING RING");   
    }

    @Override
    public void silencio() {
       System.out.println("rrrrrr");    
    }
}
