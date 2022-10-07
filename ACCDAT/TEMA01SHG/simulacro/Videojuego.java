package simulacro;

public class Videojuego extends MediatecaSebastian {

    /*
     * Sus atributos son título, horas estimadas, pendiente (quiero jugar), en curso
     * (jugando ahora) y terminado (si ya lo he jugado), género y compañía (Riot,
     * Supercell, Epic,etc).
     */
    private int iHorasEstimadas;

    /* Un constructor con el título y horas estimadas. El resto por defecto. */
    public Videojuego(String sTitulo, int iDuracion) {
        super(sTitulo, iDuracion);
        this.iHorasEstimadas = iDuracion;
    }

    /* Un constructor con todos los atributos, excepto de terminado. */
    public Videojuego(String sTitulo, int iDuracion, boolean bPendiente, boolean bEnCurso, boolean bTerminado,
            String sGenero, String sCompania, int iHorasEstimadas) {
        super(sTitulo, iDuracion, bPendiente, bEnCurso, bTerminado, sGenero, sCompania);
        this.iHorasEstimadas = iHorasEstimadas;
    }

    /* Métodos get y set de todos los atributos. */
    public int getiHorasEstimadas() {
        return iHorasEstimadas;
    }

    public void setiHorasEstimadas(int iHorasEstimadas) {
        this.iHorasEstimadas = iHorasEstimadas;
    }

    /* Sobrescribe los métodos toString. */
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    public int compareTo(MediatecaSebastian object){
        if (object instanceof Videojuego){
            Videojuego vAux = (Videojuego) object;
            int iMinGame = vAux.getiDuracion();
            return Integer.compare(this.iHorasEstimadas, iMinGame);
        }
        else if (object instanceof SerieStreaming){
            SerieStreaming serieAux = (SerieStreaming) object;
            int iMinSerie = serieAux.getiDuracion() * Constantes.NUM_MAX_CAP_TEMPORADA * Constantes.DURACION_CAP;
            return Integer.compare(this.iHorasEstimadas*60, iMinSerie);
        }
        return 0;
    }

}
