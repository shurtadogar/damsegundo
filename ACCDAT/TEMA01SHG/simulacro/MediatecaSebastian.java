package simulacro;

public abstract class MediatecaSebastian implements Comparable<MediatecaSebastian> {
    /* Atributos comunes */
    private String sTitulo;
    private int iDuracion;
    private boolean bPendiente;
    private boolean bEnCurso;
    private boolean bTerminado;
    private String sGenero;
    private String sCompania;

    /* Constructor recibiendo solo Titulo y duracion */
    public MediatecaSebastian(String sTitulo, int iDuracion) {
        this.sTitulo = sTitulo;
        this.iDuracion = iDuracion;
        this.bPendiente = Constantes.PENDIENTE;
        this.bEnCurso = Constantes.EN_CURSO;
        this.bTerminado = Constantes.TERMINADO;
        this.sGenero = Constantes.GENERO_DEFECTO;
        this.sCompania = Constantes.COMPANIA_DEFECTO;
    }

    /* Constructor recibiendo todos los parametros */
    public MediatecaSebastian(String sTitulo, int iDuracion, boolean bPendiente, boolean bEnCurso, boolean bTerminado,
            String sGenero, String sCompania) {
        this.sTitulo = sTitulo;
        this.iDuracion = iDuracion;
        this.bPendiente = bPendiente;
        this.bEnCurso = bEnCurso;
        this.bTerminado = bTerminado;
        this.sGenero = sGenero;
        this.sCompania = sCompania;
    }

    public String getsTitulo() {
        return sTitulo;
    }

    public int getiDuracion() {
        return iDuracion;
    }

    public boolean isbPendiente() {
        return bPendiente;
    }

    public boolean isbEnCurso() {
        return bEnCurso;
    }

    public boolean isbTerminado() {
        return bTerminado;
    }

    public String getsGenero() {
        return sGenero;
    }

    public String getsCompania() {
        return sCompania;
    }

    public void setsTitulo(String sTitulo) {
        this.sTitulo = sTitulo;
    }

    public void setiDuracion(int iDuracion) {
        this.iDuracion = iDuracion;
    }

    public void setbPendiente(boolean bPendiente) {
        this.bPendiente = bPendiente;
    }

    public void setbEnCurso(boolean bEnCurso) {
        this.bEnCurso = bEnCurso;
    }

    public void setbTerminado(boolean bTerminado) {
        this.bTerminado = bTerminado;
    }

    public void setsGenero(String sGenero) {
        this.sGenero = sGenero;
    }

    public void setsCompania(String sCompania) {
        this.sCompania = sCompania;
    }

    /* aPendiente(): cambia el atributo pendiente a true. */
    public void aPendiente() {
        this.bPendiente = true;
    }

    /* empezar(): aplica la lógica correspondiente */
    public void empezar() {
        this.bEnCurso = true;
        this.bTerminado = false;
    }

    /* inicializar(): pone a false los atributos booleanos */
    public void inicializar() {
        this.bPendiente = false;
        this.bTerminado = false;
        this.bEnCurso = false;
    }

    /* finalizar(): aplica la lógica correspondiente. */
    public void finalizar() {
        this.bEnCurso = false;
        this.bTerminado = true;
    }

    /* Metodo toString() */
    @Override
    public String toString() {
        return "\nMediatecaSebastian [sTitulo=" + sTitulo + ", iDuracion=" + iDuracion + ", bPendiente=" + bPendiente
                + ", bEnCurso=" + bEnCurso + ", bTerminado=" + bTerminado + ", sGenero=" + sGenero + ", sCompania="
                + sCompania + "]";
    }
}
