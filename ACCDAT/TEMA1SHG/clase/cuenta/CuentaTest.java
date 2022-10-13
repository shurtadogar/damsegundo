package clase.cuenta;
import java.util.Scanner;

public class CuentaTest {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        String paramsDni;
        String paramsIban;
        String paramsNombre;
        double paramdSaldo = 0;

        System.out.println("Inserta DNI:");
        paramsDni = entrada.next();
        System.out.println("Inserta nombre:");
        paramsNombre = entrada.next();
        System.out.println("Inserte numero de cuenta");
        paramsIban = entrada.next();
        Cuenta c1 = new Cuenta(paramsDni, paramsIban, paramsNombre, paramdSaldo);
        System.out.println("Cuenta creada " +c1.getsNombre()+ " dispone de "+c1.getdSaldo()+ " saldo en su cuenta.");
        
        entrada.close();
    }
    
    public boolean transferencia(Cuenta origen, Cuenta destino) {
        boolean bRespuesta = false;

        return bRespuesta;
    }
}
