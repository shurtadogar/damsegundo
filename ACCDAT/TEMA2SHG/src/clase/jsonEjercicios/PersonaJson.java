package clase.jsonEjercicios;


import java.util.Arrays;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class PersonaJson {
    public static void main(String[] args) {
        Persona pers1 = new Persona("Pepe", "Perez", 50, Arrays.asList("Esgrima", "Futbol", "Perreo"));
        Persona pers2 = new Persona("Paco", "Jones", 21, Arrays.asList("Tenis", "Padel", "Petanca"));
    
        List<Persona> listaPersonasOut = Arrays.asList(pers1, pers2);
        // crear objetos gson
        Gson objGson = new Gson();

        String jsonPersonas = objGson.toJson(listaPersonasOut);
        System.out.println("listaPersonas: "+jsonPersonas);

        String cadenaJson ="[{\"nombre\":\"Pepe\",\"apellido\":\"Perez\",\"edad\":50,\"aficiones\":[\"Esgrima\",\"Futbol\",\"Perreo\"]},{\"nombre\":\"Paco\",\"apellido\":\"Jones\",\"edad\":21,\"aficiones\":[\"Tenis\",\"Padel\",\"Petanca\"]}]";
        List<Persona> listaPersonasIn = objGson.fromJson(cadenaJson, new TypeToken<List<Persona>>{}.getType());
    }  
}
