package simulacros.animales;

public class Pajaro extends Ave {

    public Pajaro(int iEnergia) {
        super(iEnergia);
    }

    public Pajaro() {
        
    }

    @Override
    public void habla() {
        if (getiEnergia() < 30){
            System.out.println("Pioooo..");
        }
        else if (getiEnergia() >= 30 && getiEnergia()< 70) {
            System.out.println("Pio Pio");
        }
        else if (getiEnergia()>70) {
            System.out.println("¡PIO PIO!");
        }
    }

    @Override
    public void come(int cantidadComida) {
        this.iEnergia += cantidadComida * 5;
        super.come(cantidadComida);
    }

    @Override
    public String toString() {
        return "Pajaro ["+iEnergia+"]";
    }
}
