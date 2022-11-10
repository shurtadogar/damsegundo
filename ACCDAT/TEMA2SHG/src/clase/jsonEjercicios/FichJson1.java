package clase.jsonEjercicios;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class FichJson1 {
    final static String RUTA_FICHERO="D:\\ACCDAT\\ficheros\\";
    public static void main(String[] args) {
        JsonObject objetoJson1 = new JsonObject();
        objetoJson1.addProperty("coche", "rojo");
        objetoJson1.addProperty("temperatura", 22.5);
        objetoJson1.addProperty("año", 2012);

        JsonObject objetoJson2 = new JsonObject();
        objetoJson2.addProperty("Hola", "mundo");
        // Insertamos objeto 2 en objeto 1
        objetoJson1.add("mensaje", objetoJson2);

        // Creamos un array
        JsonArray jsonArrayMeses = new JsonArray();
        jsonArrayMeses.add("Enero");
        jsonArrayMeses.add("Febrero");
        jsonArrayMeses.add("Marzo");

        objetoJson1.add("meses", jsonArrayMeses);
        System.out.println("obj json= "+objetoJson1);
        
        Path path = Paths.get(RUTA_FICHERO+"objeto.json");
        try {
            Files.write(path, objetoJson1.toString().getBytes());
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    } 
}
