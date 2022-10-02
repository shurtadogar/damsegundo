package entregashg.complejo;

public class Complejo {
    /* Atributos */
    private double dPReal;
    private double dPImag;

    /* Constructores */
    public Complejo( ) {
        this.dPReal = 0;
        this.dPImag = 0;
    }

    public Complejo(double dPReal, double dPImag) {
        this.dPReal = dPReal;
        this.dPImag = dPImag;
    }

    /* Getters */
    public double getdPReal() {
        return dPReal;
    }

    public double getdPImag() {
        return dPImag;
    }

    /* Setters */
    public void setdPReal(double dPReal) {
        this.dPReal = dPReal;
    }

    public void setdPImag(double dPImag) {
        this.dPImag = dPImag;
    }
   
    /* Método asignar(double x, double y) asignar valores a los complejos */
    public void asignar(double x, double y)
    {
        this.dPReal = x;
        this.dPImag = y;
    };

    /* Método sumar(Complejo c1, Complejo c2) sumar valores de complejos */
    public Complejo sumar(Complejo c1, Complejo c2){
        double x = c1.dPReal + c2.dPReal;
        double y = c1.dPImag + c2.dPImag;
        Complejo c3 = new Complejo();
        c3.asignar(x, y);
        return c3;
    };

    /* Método imprimir() imprimimos los datos del complejo */
    public void imprimir () {
       System.out.println("Datos del complejo: ("+getdPReal()+", "+getdPImag()+")");
    }

    /* Método toString() */
    @Override
    public String toString() {
        return "Complejo [dPReal=" + dPReal + ", dPImag=" + dPImag + "]";
    };
}
