package clase.ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class CalculaNumeros {
    final static String RUTA_FICHERO = "D:\\ACCDAT\ficheros\\";
    public static void main(String[] args) {
        String sTexto = "";
        BufferedReader brIn = null;
        int iSuma = 0;
        int iMedia = 0;

        try (FileReader frIn = new FileReader(RUTA_FICHERO + "calculanumeros.txt")) {
            brIn = new BufferedReader(frIn);
            sTexto = brIn.readLine();
            StringTokenizer tokens = new StringTokenizer(sTexto);
            int iCont = tokens.countTokens();
            while(tokens.hasMoreTokens()){
                iSuma = iSuma + (Integer.parseInt(tokens.nextToken()));
                iMedia = iSuma / iCont;
            }
            System.out.println(iMedia);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
