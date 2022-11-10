package clase.fileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerFileReader2 {
    final static String RUTA_FICHERO="D:\\ABBDD\\ficheros\\";
    public static void main(String[] args) {
        String sTexto ="";
        try (BufferedReader brIn = new BufferedReader(new FileReader(RUTA_FICHERO+"prueba.txt"))) {
            sTexto = brIn.readLine();
            while (sTexto!=null){
                System.out.println(sTexto);
                sTexto = brIn.readLine();
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }  
    }    
}
