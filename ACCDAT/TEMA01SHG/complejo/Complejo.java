package entregashg.complejo;

public class Complejo {
    /* ATRIBUTOS */
    private double dPReal;
    private double dPImag;

    /* CONSTRUCTOR */
    public Complejo( ) {

    }

    /* GETTERS */
    public double getdPReal() {
        return dPReal;
    }

    public double getdPImag() {
        return dPImag;
    }

    /* SETTERS */
    public void setdPReal(double dPReal) {
        this.dPReal = dPReal;
    }

    public void setdPImag(double dPImag) {
        this.dPImag = dPImag;
    }

    /* Metodos */
    /* public void asignar(double x, double y) asignar valores a los complejos */
    public void asignar(double x, double y)
    {
        this.dPReal = x;
        this.dPImag = y;
    };
    /* public Complejo sumar(Complejo c1, Complejo c2) sumar valores de complejos */
    public Complejo sumarComplejo (Complejo c1, Complejo c2){
        double x = c1.dPReal + c2.dPReal;
        double y = c1.dPImag + c2.dPImag;
        Complejo c3 = new Complejo();
        c3.asignar(x, y);
        return c3;
    };
  
    public void imprimir () {
       System.out.println("Datos: ("+getdPReal()+","+getdPImag()+")");
    }

    @Override
    public String toString() {
        return "Complejo [dPReal=" + dPReal + ", dPImag=" + dPImag + "]";
    };

}
