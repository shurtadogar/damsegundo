package clase;

/* Crea una clase llamada Persona con los siguientes atributos:
    - nombre
    - edad
    - DNI
    - sexo (H hombre, M mujer (definidas como constantes)
    - peso
    - altura
 */
public class Persona {
    private String sNombre;
    private int iEdad;
    private String sDni;
    private char cSexo;
    private double dPeso;
    private double dAltura;

    private final static char HOMBRE = 'H';
    private final static char MUJER = 'M';

    /* constructor por defecto (nombre vacío, sexo HOMBRE y resto a 0). */
    public Persona() {
        this.sNombre = null;
        this.iEdad = 0;
        this.sDni = null;
        this.cSexo = HOMBRE;
        this.dPeso = 0;
        this.dAltura = 0;
    }
    /* constructor con nombre, edad, sexo */
    public Persona(String paramsNombre, int paramiEdad, char paramcSexo) {
        this.sNombre = paramsNombre;
        this.iEdad = paramiEdad;
        this.cSexo = paramcSexo;
    }

    /* constructor con todos los atributos como parámetro */
    public Persona(String paramsNombre, int paramiEdad, String paramsDni, char paramcSexo, double paramdPeso, double paramdAltura) throws Exception {
        this.sNombre = paramsNombre;
        this.iEdad = paramiEdad;
        if (paramsDni == null){
            this.sDni = generarDNI();
        }
        else if (validarDNI(paramsDni)) {
            this.sDni = paramsDni;
        }
        else {
            throw new Exception("DNI inconrrecto");
        }
        if (validarSexo(paramcSexo)){
            this.cSexo = paramcSexo;
        }
        else {
            throw new Exception("Sexo no valido.");
        } 
        this.dPeso = paramdPeso;
        this.dAltura = paramdAltura;
        calcularIMC();
    }

    /* Getters */
    public String getsNombre() {
        return sNombre;
    }
    public int getiEdad() {
        return iEdad;
    }
    public String getsDni() {
        return sDni;
    }
    public char getcSexo() {
        return cSexo;
    }
    public double getdPeso() {
        return dPeso;
    }
    public double getdAltura() {
        return dAltura;
    }
   
    /* Setters */
    public void setsNombre(String paramsNombre) {
        this.sNombre = paramsNombre;
    }
    public void setiEdad(int paramiEdad) {
        this.iEdad = paramiEdad;
    }
    public void setsDni(String paramsDni) {
        this.sDni = paramsDni;
    }
    public void setcSexo(char paramcSexo) {
        this.cSexo = paramcSexo;
    }
    public void setdPeso(double paramdPeso) {
        this.dPeso = paramdPeso;
    }
    public void setdAltura(double paramdAltura) {
        this.dAltura = paramdAltura;
    }
   
    /* calcularIMC (buscar fórmula en internet). Devuelve un int con el valor del IMC calculado. */
    private double calcularIMC () {
        double dIMC = getdPeso() / (getdAltura() * getdAltura());
        return dIMC;
    }

    /* vaidarDNI: método privado que valida el DNI. Es decir, si la letra del DNI que viene es la que corresponde si calculamos la letra nosotros. */
    public boolean validarDNI (String paramsDni) {
        boolean bValido = false;
        for (int i= 0; i<9; i++){
            System.out.println("numero "+paramsDni.charAt(i));
        }
        return bValido;
    }
    
    /* validaSexo: método privado que valida si el sexo es H o M. */
    private boolean validarSexo (char paramcSexo) {
        return(paramcSexo != HOMBRE && paramcSexo != MUJER) ? false : true;
    }

    /* generarDNI: método privado que es llamado desde el constructor cuando no se le pasa DNI y crea un DNI nuevo. Es decir, un número aleatorio de 8 cifras y calcula la letra correspondiente */
    private char generarLetraDNI(int valorDNI) {
        final int divisor = 23;
        int res = valorDNI - (valorDNI / divisor * divisor);
        char [] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        return letras[res];
    }

    private String generarDNI() {
        int numDni = ((int) Math.floor(Math.random())*(100000000 - 10000000) + 100000000);
        System.out.println("numDni =" +numDni);
        char cLetraDni = generarLetraDNI(numDni);
        return (Integer.toString(numDni) + cLetraDni);
    }

}
