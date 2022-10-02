package TEMA01SHG.parking;

import java.text.ParseException;

interface Parking {
    boolean hayPlaza();
    void aparcaCoche(Vehiculo v);
    void sacaCoche(Vehiculo v);
    void getFactura(Vehiculo v) throws ParseException;
}
