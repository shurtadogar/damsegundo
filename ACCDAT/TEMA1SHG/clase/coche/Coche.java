package clase.coche;
/*
 * @author SHG
 * @since sept 2022
 */

public class Coche {
    /* ATRIBUTOS */
    private String sColor;
    private int iVelocidad;
    private float fTamanyo;

    /* CONSTRUCTOR */
    public Coche(String sColor, int iVelocidad, float fTamanyo) {
        this.sColor = sColor;
        this.iVelocidad = iVelocidad;
        this.fTamanyo = fTamanyo;
    }

    /* METODOS */
    public void avanzar() {};
    public void parar() {};
    public void girarIzquierda() {};
    public void girarDerecha() {}

    /* GETTERS */
    public String getsColor() {
        return sColor;
    }

    public int getiVelocidad() {
        return iVelocidad;
    }

    public float getfTamanyo() {
        return fTamanyo;
    }

    /* SETTERS */
    public void setsColor(String sColor) {
        this.sColor = sColor;
    }

    public void setiVelocidad(int iVelocidad) {
        this.iVelocidad = iVelocidad;
    }

    public void setfTamanyo(float fTamanyo) {
        this.fTamanyo = fTamanyo;
    }

    @Override
    public String toString() {
        return "Coche [fTamanyo=" + fTamanyo + ", iVelocidad=" + iVelocidad + ", sColor=" + sColor + "]";
    };   
}