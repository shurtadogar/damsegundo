package simulacros.animales;

public abstract class Ave extends Animal{

    public Ave(int iEnergia) {
        super(iEnergia);
    }

    public Ave() {

    }

    @Override
    public void habla() {
        this.iEnergia -= 3;
    }

    
}
