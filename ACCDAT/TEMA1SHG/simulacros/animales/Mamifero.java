package simulacros.animales;

public abstract class Mamifero extends Animal{

    public Mamifero(int iEnergia) {
        super(iEnergia);
    }

    public Mamifero() {
    }
 
    @Override
    public void habla() {
        this.iEnergia -= 5;
    }

    @Override
    public void come(int CantidadComida) {
       
    }
}
