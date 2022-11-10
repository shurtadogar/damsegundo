package clase.fileReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerFileReader {
    final static String RUTA_FICHERO="D:\\ABBDD\\ficheros\\";
    public static void main(String[] args) {
        String sTexto ="";
        BufferedReader brIn = null;
        try {
            FileReader frIn = new FileReader(RUTA_FICHERO+"prueba.txt");
            brIn = new BufferedReader(frIn);
            sTexto = brIn.readLine();
            while (sTexto!=null){
                System.out.println(sTexto);
                sTexto = brIn.readLine();
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally {
            if (brIn != null){
                try {
                    brIn.close();
                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
            }
        }
    }
}
