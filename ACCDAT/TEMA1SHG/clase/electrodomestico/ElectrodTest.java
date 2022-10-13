package clase.electrodomestico;

import java.util.ArrayList;

public class ElectrodTest {
    public static void main(String[] args) {
        ArrayList<String> arrayElectro = new ArrayList<>();

        Electrodomestico electro1 = new Electrodomestico();
        Electrodomestico electro2 = new Electrodomestico();
        Electrodomestico electro3 = new Electrodomestico();
        Electrodomestico electro4 = new Electrodomestico();

        arrayElectro.add(electro1.toString());
        arrayElectro.add(electro2.toString());
        arrayElectro.add(electro3.toString());
        arrayElectro.add(electro4.toString());

        for (int i=0; i < arrayElectro.size(); i++){
            arrayElectro.get(i);
        }
    }
}
