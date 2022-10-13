package simulacros.animales;

public class Perro extends Mamifero { 

    public Perro(int iEnergia) {
        super(iEnergia);
    }

    public Perro() {
    }

    @Override
    public void habla() {
        if (getiEnergia() < 30){
            System.out.println("Guauuuu..");
        }
        else if (getiEnergia() >= 30 && getiEnergia()< 70) {
            System.out.println("Guau guau");
        }
        else if (getiEnergia()>70) {
            System.out.println("¡GUAU!");
        }
    }
    
    @Override
    public void come(int cantidadComida) {
        this.iEnergia += cantidadComida* 7;
        super.come(cantidadComida);
    }

    @Override
    public String toString() {
        return "Perro ["+iEnergia+"]";
    }
}
