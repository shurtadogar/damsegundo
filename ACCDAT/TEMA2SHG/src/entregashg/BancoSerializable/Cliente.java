package entregashg.BancoSerializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;

public class Cliente implements Serializable {
    private String sDni;
    private String sNombre;
    private LocalDate ldFechaNac;
    private double dSaldo;

    public Cliente() {
    }

    public Cliente(String sDni, String sNombre, LocalDate ldFechaNac, double dSaldo) {
        this.sDni = sDni;
        this.sNombre = sNombre;
        this.ldFechaNac = ldFechaNac;
        this.dSaldo = dSaldo;
    }

    public String getsDni() {
        return sDni;
    }

    public void setsDni(String sDni) {
        this.sDni = sDni;
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public LocalDate getLdFechaNac() {
        return ldFechaNac;
    }

    public void setLdFechaNac(LocalDate ldFechaNac) {
        this.ldFechaNac = ldFechaNac;
    }

    public double getdSaldo() {
        return dSaldo;
    }

    public void setdSaldo(double dSaldo) {
        this.dSaldo = dSaldo;
    }

    @Override
    public String toString() {
        return "DNI= " + sDni + " Nombre= " + sNombre + " FechaNac= " + ldFechaNac + " Saldo= " + dSaldo ;
    }

    public void resetearFichero(File paramFich){
        try (ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream(paramFich+"\\Clientes.dat"));
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream(paramFich+"\\Clientes.dat"))) {
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    } 
}
