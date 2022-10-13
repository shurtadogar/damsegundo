package clase.lambda;

public class Cliente {
    /* Atributos */
    private String sNombre;
    private String sApellidos;
    private int iEdad;
    /* Constructor */
    public Cliente(String sNombre, String sApellidos, int iEdad) {
        this.sNombre = sNombre;
        this.sApellidos = sApellidos;
        this.iEdad = iEdad;
    }
    /* Getters */
    public String getsNombre() {
        return sNombre;
    }
    public String getsApellidos() {
        return sApellidos;
    }
    public int getiEdad() {
        return iEdad;
    }
    /* Setters */
    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }
    public void setsApellidos(String sApellidos) {
        this.sApellidos = sApellidos;
    }
    public void setiEdad(int iEdad) {
        this.iEdad = iEdad;
    }
    /* Metodos */
    @Override
    public String toString() {
        return "Cliente [iEdad=" + iEdad + ", sApellidos=" + sApellidos + ", sNombre=" + sNombre + "]";
    }
}
