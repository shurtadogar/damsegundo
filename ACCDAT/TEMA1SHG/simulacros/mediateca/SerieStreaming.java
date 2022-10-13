package simulacros.mediateca;

public class SerieStreaming extends MediatecaSebastian {
    /*
     * Sus atributos son título, número de temporadas, pendiente (la quiero ver), en
     * curso (la estoy viendo) y terminado (si ya la hemos visto), género y compañía
     * (Netflix, Prime, etc).
     */
    private int iNumeroTemporadas;

    /* Un constructor con el título y numTemporadas. El resto por defecto. */
    public SerieStreaming(String sTitulo, int iDuracion) {
        super(sTitulo, iDuracion);
        this.iNumeroTemporadas = iDuracion;
    }

    /* Un constructor con todos los atributos */
    public SerieStreaming(String sTitulo, int iDuracion, boolean bPendiente, boolean bEnCurso, boolean bTerminado,
            String sGenero, String sCompania, int iNumeroTemporadas) {
        super(sTitulo, iDuracion, bPendiente, bEnCurso, bTerminado, sGenero, sCompania);
        this.iNumeroTemporadas = iNumeroTemporadas;
    }

    /* Métodos get y set de todos los atributos. */
    public int getiNumeroTemporadas() {
        return iNumeroTemporadas;
    }

    public void setiNumeroTemporadas(int iNumeroTemporadas) {
        this.iNumeroTemporadas = iNumeroTemporadas;
    }

    /* Sobrescribe los métodos toString. */
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    public int compareTo(MediatecaSebastian object){
        if (object instanceof SerieStreaming){
            SerieStreaming serieAux = (SerieStreaming) object;
            int iMinSerie = serieAux.getiDuracion() * Constantes.NUM_MAX_CAP_TEMPORADA * Constantes.DURACION_CAP;
            return Integer.compare(this.iNumeroTemporadas*60, iMinSerie);
        }
        else if (object instanceof Videojuego){
            Videojuego vAux = (Videojuego) object;
            return Integer.compare(this.iNumeroTemporadas, vAux.getiDuracion());
        }
        return 0;
    }
}
