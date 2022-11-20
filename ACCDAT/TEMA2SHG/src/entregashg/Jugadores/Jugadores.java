package entregashg.Jugadores;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Jugadores {
    static File ficherocalcular = new File("D:\\TEMA02SHG\\src\\entregashg\\Jugadores");
    public static void main(String[] args) {
        
        String texto;
        double sumaEdad = 0;
        double sumaAltura= 0;
        int media = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(ficherocalcular+"\\jugadores.txt"))) {
            texto= br.readLine();

            while(texto !=null){
                media++;
                String[] numero = texto.split(" ");
                sumaEdad += Double.parseDouble(numero[1]);
                sumaAltura += Double.parseDouble(numero[2]);
                System.out.println(texto);
                texto=br.readLine();
            }
            System.out.println("Media altura = "+sumaAltura/media);
            System.out.println("Media edad = "+sumaEdad/media);
            br.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    } 
}
