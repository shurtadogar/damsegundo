package simulacro2;

public class Gato extends Mamifero {
    
    public Gato(int iEnergia) {
        super(iEnergia);
    }

    public Gato() {
    }

    @Override
    public void habla() {
        if (getiEnergia() < 30){
            System.out.println("Miauuuu..");
        }
        else if (getiEnergia() >= 30 && getiEnergia()< 70) {
            System.out.println("Miau");
        }
        else if (getiEnergia()>70) {
            System.out.println("¡MIAU!");
        }
    }
    
}
