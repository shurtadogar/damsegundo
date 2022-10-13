package simulacros.tablero;

public class Tablero {
    /* Número de filas y columnas serán constantes con valor 10. */
    private final static int NUMERO_COLUMNAS = 10;
    private final static int NUMERO_FILAS = 10;
    /* Tamaño del barco será constante con valor 3. */
    private final static int TAMANIO_BARCO = 3;
    /* Número de barcos será constante con valor 5. */
    private final static int NUMERO_BARCOS = 5;

    private int iFilas;
    private int iColumnas;
    private int iTamBarco;
    private int iNumeroBarcos;
    private int iNumAciertos = 0;

    private boolean[][] barcos;
    private boolean[][] disparos;
    
    /* Será necesario crear un constructor vacío que cree el tablero con los valores por defecto. */
    Tablero() {
        this (NUMERO_FILAS, NUMERO_COLUMNAS, TAMANIO_BARCO, NUMERO_BARCOS);
    }
    
    /* Será necesario crear un constructor con los valores pasados por parámetro. */
    public Tablero(int iFilas , int iColumnas, int iTamBarco, int iNumeroBarcos) {
        barcos = new boolean [iFilas][iColumnas];
        disparos = new boolean [iFilas][iColumnas];

        this.iFilas = iFilas;
        this.iColumnas = iColumnas;
        this.iTamBarco = iTamBarco;
        this.iNumeroBarcos = iNumeroBarcos;
        
        desplegarFlota();
    }

    /* Getters */
    public int getiColumnas() {
        return iColumnas;
    }

    public int getiFilas() {
        return iFilas;
    }

    public int getiTamBarco() {
        return iTamBarco;
    }

    public int getiNumeroBarcos() {
        return iNumeroBarcos;
    }

        public void setiColumnas(int iColumnas) {
        this.iColumnas = iColumnas;
    }

    public void setiFilas(int iFilas) {
        this.iFilas = iFilas;
    }

    public void setiTamBarco(int iTamBarco) {
        this.iTamBarco = iTamBarco;
    }

    public void setiNumeroBarcos(int iNumeroBarcos) {
        this.iNumeroBarcos = iNumeroBarcos;
    }

    /*  hayBarco(fila, columna): se le pasa un número de fila y de columna y devuelve un valor booleano.  */
    private boolean hayBarco(int paramFila, int paramColumna) {
        return barcos[paramFila][paramColumna];
    }

    /* disparo(fila, columna): se le pasa un número de fila y de columna y realiza el disparo en el tablero y devuelve boolean indicado si hemos acertado. */
    public boolean disparo(int paramFila, int paramColumna){
        boolean bResp = false;
        disparos[paramFila-1][paramColumna-1] = true;
        if (barcos[paramFila-1][paramColumna-1]){ // hayBarco(paramFila-1, paramColumna-1)
            iNumAciertos++;
            bResp = true;
        }
        return bResp;
    }

    /* flotaHundida(): devuelve un boolean indicando si se ha hundido la flota  */
    public boolean flotaHundida(){
        return (iNumAciertos == (this.iNumeroBarcos*this.iTamBarco));
    }

    /* desplegarFlota(): método privado que se llama desde el constructor para pintar los barcos. Hay que tener en cuenta el tamaño del tablero, número de barcos y tamaño de barcos y los coloca aleatoriamente en el tablero. */
    public void desplegarFlota() {
        int iBarcosPintados= 0;
        do {
            /* dos numeros aleatorios fila[0.9] y columna[0.7] */
            int iFila = (int) Math.floor(Math.random()* this.iFilas - 1);
            int iColumna = (int) Math.floor(Math.random()* this.iColumnas - this.iTamBarco - 1);
            /* no ponga 2 barcos en la misma posicion */
            if (!hayBarco(iFila, iColumna) && !hayBarco(iFila, iColumna + 1 ) && !hayBarco(iFila, iColumna + 2)){
                barcos[iFila][iColumna] = true;
                barcos[iFila][iColumna+1] = true;
                barcos[iFila][iColumna+2] = true;
                iBarcosPintados++;
            }
        } while (iBarcosPintados < this.iNumeroBarcos); /* hay que poner this.numbarcos */ 
    }

    /* pintarDisparos(): muestra los disparos actuales y aciertos en caso de haber alguno. Los símbolos a utilizar son: @ (tecla del 2) disparo acertado, ~ (ALT126) disparo fallado, · (tecla del 3) pendiente. */
    public void pintarDisparos() {
        for ( int filas = 0; filas<this.iFilas; filas++){
            int aux = filas + 1;
            System.out.println(" "+aux+" ");
            for (int columnas = 0; columnas<this.iColumnas; columnas++){
                /* miro si hay disparo en esa posicion */
                if (disparos[filas][columnas]){
                    /* miro si hay barco en en esa posicion */
                    if (barcos[filas][columnas]){
                        System.out.println(" @ ");
                    }
                    else {
                        System.out.println(" ~ ");
                    }
                }
                else {
                    System.out.println(" · ");
                }
            }
        }
        System.out.println(" ");
    }
}