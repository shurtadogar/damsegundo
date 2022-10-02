package entregashg.tienda;

public class Sobremesas extends Ordenadores {
    /* Atributos */
    private String sTipoTorre;
    /* Constructor recibiendo por parametros los valores */
    public Sobremesas(String paramsCodigo, int paramiRam, String paramsCpu, double paramdPrecio, String paramsTipoTorre) {
        super(paramsCodigo, paramiRam, paramsCpu, paramdPrecio);
        this.sTipoTorre = paramsTipoTorre;
    }
    /* Getters */
    public String getsTipoTorre() {
        return sTipoTorre;
    }
    /* Setters */       
    public void setsTipoTorre(String paramsTipoTorre) {
        this.sTipoTorre = paramsTipoTorre;
    }

    /* Método getCaracterísiticas() heredado de Ordenadores.java*/
    @Override
    public void getCarateristicas() {
        // TODO Auto-generated method stub
        super.getCarateristicas();
        System.out.println("Tipo de torre: "+getsTipoTorre());
    }
    /* Método toString() para ver los valores  */
    @Override
    public String toString() {
        return "Sobremesas [sTipoTorre=" + sTipoTorre + "]";
    }
}
