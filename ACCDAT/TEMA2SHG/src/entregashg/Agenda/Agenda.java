package entregashg.Agenda;

public class Agenda {
    private String NombreContacto;
    private Integer NumeroTelefono;

    public Agenda() {
    }

    public Agenda(String nombreContacto, Integer numeroTelefono) {
        NombreContacto = nombreContacto;
        NumeroTelefono = numeroTelefono;
    }


    public String getNombreContacto() {
        return NombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        NombreContacto = nombreContacto;
    }

    public int getNumeroTelefono() {
        return NumeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        NumeroTelefono = numeroTelefono;
    }

    @Override
    public String toString() {
        return  NombreContacto + " " + NumeroTelefono ;
    }
}
