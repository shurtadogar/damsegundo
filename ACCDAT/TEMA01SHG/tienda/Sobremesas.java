package entregashg.tienda;

public class Sobremesas extends Ordenadores {
    private String sTipoTorre;

    public Sobremesas(String sCodigo, int iRam, String sCpu, double dPrecio, String sTipoTorre) {
        super(sCodigo, iRam, sCpu, dPrecio);
        this.sTipoTorre = sTipoTorre;
    }

    public String getsTipoTorre() {
        return sTipoTorre;
    }

    public void setsTipoTorre(String sTipoTorre) {
        this.sTipoTorre = sTipoTorre;
    }

    
    @Override
    public String getCaracterísiticas() {
        // TODO Auto-generated method stub
        return super.getCaracterísiticas()+"\nTipo de torre "+getsTipoTorre();
    }

    @Override
    public String toString() {
        return "Sobremesas [sTipoTorre=" + sTipoTorre + "]";
    }
}
