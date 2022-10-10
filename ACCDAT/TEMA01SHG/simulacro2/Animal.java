package simulacro2;

public abstract class Animal {
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
        this.iEnergia += paramEnergia;
        if (this.iEnergia > 100){
            this.iEnergia = MAX_ENERGIA;
        }
        else if (this.iEnergia < 0){
            this.iEnergia = MIN_ENERGIA;
        }
    }  
}
