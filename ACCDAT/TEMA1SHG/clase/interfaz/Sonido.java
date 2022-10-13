package clase.interfaz;

interface Sonido {
    void emitirSonido();

    default void silencio(){
        System.out.println("....");
    }
    
}