package entregashg.Agenda;

public class Agenda {
    private String sNombre;
    private Integer iNumero;
    
    public Agenda() {
    }

    public Agenda(String sNombre, Integer iNumero) {
        this.sNombre = sNombre;
        this.iNumero = iNumero;
    }

    public String getsNombre() {
        return sNombre;
    }

    public Integer getiNumero() {
        return iNumero;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public void setiNumero(Integer iNumero) {
        this.iNumero = iNumero;
    }

    @Override
    public String toString() {
        return  "Nombre: "+sNombre+ " Numero: " +iNumero;
    }  
}
