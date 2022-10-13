package simulacros.animales;

public abstract class Animal implements Comparable<Animal> {
    public static final int MIN_ENERGIA = 0; 
    public static final int MAX_ENERGIA = 100;

    protected int iEnergia;

    /* constructor(es) que reciban la energía inicial del animal o si no se indica nada, será 100 */
    public Animal(int iEnergia) {
        this.iEnergia = iEnergia;
    }

    public Animal() {
        this.iEnergia = MAX_ENERGIA;
    }

    public int getiEnergia() {
        return iEnergia;
    }

    public void setiEnergia(int iEnergia) {
        this.iEnergia = iEnergia;
    }

    public void habla(){
        
    }

    public void come(int paramEnergia){
        if (this.iEnergia > 0 && this.iEnergia < 100) {
            this.iEnergia+= paramEnergia;
        }
        else  {
            this.iEnergia=0;
        }
    }  

    public int compareTo(Animal animal) { 
        return Integer.compare(this.iEnergia, animal.getiEnergia());
    }

}
