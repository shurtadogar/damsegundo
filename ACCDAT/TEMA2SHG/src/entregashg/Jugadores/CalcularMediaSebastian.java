package entregashg.Jugadores;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CalcularMediaSebastian {
    public static void main(String[] args) {
        File RutaFichero = new File("D:\\ACCDAT\\TEMA2SHG\\src\\entregashg\\Jugadores");

        String texto;
        double sumaEdad = 0;
        double sumaAltura= 0;
        int media = 0;

        try (BufferedReader bfIn = new BufferedReader(new FileReader(RutaFichero+"\\jugadores.txt"))) {
            texto= bfIn.readLine();

            while(texto !=null){
                media++;
                String[] numero = texto.split(" ");
                sumaEdad += Double.parseDouble(numero[1]);
                sumaAltura += Double.parseDouble(numero[2]);
                System.out.println(texto);
                texto=bfIn.readLine();
            }
            System.out.println("Media altura = "+sumaAltura/media);
            System.out.println("Media edad = "+sumaEdad/media);
            bfIn.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
