package clase.cuenta;

import java.math.BigInteger;
import java.util.Scanner;
import java.time.LocalDate;

public class Cuenta {
    /* Atributos: mínimo dni, nombre y saldo de la cuenta */
    private String sDni;
    private String sIban;
    private String sNombre;
    private double dSaldo;

    private LocalDate fechaIngresoHoy;
    private double dImporteIngresoHoy;

    /* Será necesario definir dos constantes para importe máximo a retirar (3000) e importe máximo a ingresar (6000). */
    private static double IMP_MAX_INGRESO = 6000;
    public static double IMP_MAX_RETIRO = 3000;

    /* Crear un constructor con todos los atributos como parámetro */
    public Cuenta(String paramsDni, String paramsIban, String paramsNombre, double paramdSaldo) throws Exception {
        this.sDni = paramsDni;
        if (validarCuentaBancaria(sIban)){
            this.sIban = paramsIban;
        }
        else {
            throw new Exception ("Numero de cuenta no valido");
        }
        this.sNombre = paramsNombre;
        this.dSaldo = paramdSaldo;
        /* Valores por defecto */
        this.fechaIngresoHoy = null;
        this.dImporteIngresoHoy = 0;
    }

    /* Crear constructor que admita como parámetro el saldo y el número de cuenta */
    public Cuenta (String paramsIban, double paramdSaldo) throws Exception{
        if (validarCuentaBancaria(sIban)){
            this.sIban = paramsIban;
        }
        else {
            throw new Exception ("Numero de cuenta no valido");
        }
        this.dSaldo = paramdSaldo;
    }


    public String getsDni() {
        return sDni;
    }

    public String getsIban() {
        return sIban;
    }

    public String getsNombre() {
        return sNombre;
    }

    public double getdSaldo() {
        return dSaldo;
    }

    public LocalDate getFechaIngresoHoy() {
        return fechaIngresoHoy;
    }

    public double getdImporteIngresoHoy() {
        return dImporteIngresoHoy;
    }

    public static double getIMP_MAX_INGRESO() {
        return IMP_MAX_INGRESO;
    }

    public static double getIMP_MAX_RETIRO() {
        return IMP_MAX_RETIRO;
    }

    public void setsDni(String sDni) {
        this.sDni = sDni;
    }

    public void setsIban(String sIban) {
        this.sIban = sIban;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public void setdSaldo(double dSaldo) {
        this.dSaldo = dSaldo;
    }

    public void setFechaIngresoHoy(LocalDate fechaIngresoHoy) {
        this.fechaIngresoHoy = fechaIngresoHoy;
    }

    public void setdImporteIngresoHoy(double dImporteIngresoHoy) {
        this.dImporteIngresoHoy = dImporteIngresoHoy;
    }

    public static void setIMP_MAX_INGRESO(double iMP_MAX_INGRESO) {
        IMP_MAX_INGRESO = iMP_MAX_INGRESO;
    }

    public static void setIMP_MAX_RETIRO(double iMP_MAX_RETIRO) {
        IMP_MAX_RETIRO = iMP_MAX_RETIRO;
    }

    /* El método ingresarDinero() debe además validar que no se supere el importemáximo a ingresar en un mismo día. */
    public boolean ingresarDinero(double paramdCantidad) {
        boolean bRespuesta = false;
        
        int iContador = 0;
        if (iContador < IMP_MAX_INGRESO){
            System.out.println("Operacion realizada con exito.");
            iContador += paramdCantidad;
            this.dSaldo += paramdCantidad;
            System.out.println("Su saldo actual es de "+dSaldo);
        }
        else {
            System.out.println("¡Error! Usted ha superado la cantidad maxima de ingreso diario.");
        }
        this.dSaldo += paramdCantidad;
        return bRespuesta;
    }

    /* El método retirarDinero() debe además validar que no se supere el importe máximo a retirar en un mismo día  */
    public boolean retirarDinero(double paramdRetiro) {
        boolean bRespuesta = false;
        int iContador = 0;
       if (iContador < IMP_MAX_RETIRO){
        if (paramdRetiro > this.dSaldo){
            bRespuesta = false;
            System.out.println("¡Error! Cantidad incorrecta.");
        }
        else {
            bRespuesta = true;
            System.out.println("Operacion realizada con exito");
        }
       }
       else {
        System.out.println("¡Error! Usted ha superado la cantidad maxima de retiro diario");
       }
       
        return bRespuesta;
    }

    /* mostrarSaldo() */
    public double mostrarSaldo () {
        return this.dSaldo;
    }

    public String cambioTitular (String paramsDni) {
        String sNuevoDni;
        Scanner entrada = new Scanner(System.in);
        if (paramsDni == sDni){
            System.out.println("Introduzca el dni del nuevo titular:");
            sNuevoDni = entrada.next();
            this.sDni = sNuevoDni;
        }
        else {
            System.out.println("Error! El DNI introducido no corresponde a ningun cliente");
        }
        entrada.close();
        return "Titular con dni: "+paramsDni;
    }

    /* Incluir el método validarCuentaBancaria() e incluir el algoritmo de validación de cuenta bancaria. */
    public static boolean validarCuentaBancaria(String paramsCuenta) {
		
        boolean bValido = false;
		int i = 2;
		int iCaracterASCII = 0;
		int iResto = 0;
		int iDC = 0;
		String sCadenaDc = "";

		BigInteger cuentaNumero = new BigInteger("0");
		BigInteger modo = new BigInteger("97");

		if (paramsCuenta.length() == 24 && paramsCuenta.substring(0,1).toUpperCase().equals("E") && paramsCuenta.substring(1,2).toUpperCase().equals("S")) {
			do {
                iCaracterASCII = paramsCuenta.codePointAt(i);
				bValido = (iCaracterASCII > 47 && iCaracterASCII < 58);
				i++;
            } while (i < paramsCuenta.length() && bValido);
			
            if(bValido) {
				cuentaNumero = new BigInteger(paramsCuenta.substring(4,24) + "142800");
				iResto = cuentaNumero.mod(modo).intValue();
				iDC = 98 - iResto;
				sCadenaDc = String.valueOf(iDC);
			}
			if (iDC < 10) {
				sCadenaDc = "0" + sCadenaDc;
			}
			// Comparamos los caracteres 2 y 3 de la cuenta (dígito de control IBAN) con sCadenaDc
			if(paramsCuenta.substring(2,4).equals(sCadenaDc)) {
				bValido = true;
			} 
			else {
				bValido = false;
			}
		}
		return bValido;
	}
}
