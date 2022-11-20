package entregashg.Banco;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Cliente {
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

    public void resetearFichero(File paramFich){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(paramFich+"\\Clientes.txt"));
            BufferedReader br = new BufferedReader(new FileReader(paramFich+"\\Clientes.txt"))) {
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "DNI= " + sDni + " Nombre= " + sNombre + " FechaNac= " + ldFechaNac + " Saldo= " + dSaldo ;
    }
}
