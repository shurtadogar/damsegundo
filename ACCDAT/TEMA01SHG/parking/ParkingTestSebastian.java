package TEMA01SHG.parking;

import java.text.ParseException;

public class ParkingTestSebastian {
    public static void main(String[] args) throws ParseException {
        Vehiculo v1 = new Vehiculo("5555AAA");
        Vehiculo v2 = new Vehiculo("5555BBB");
        Vehiculo v3 = new Vehiculo("5555CCC");
        Vehiculo v4 = new Vehiculo("6666AAA");
        Vehiculo v5 = new Vehiculo("6666BBB");
        ParkingVehiculo pv1 = new ParkingVehiculo("Calle preciados 54");
    
        v1.setdFechaInicio("02/10/2022 18:40"); 
        v2.setdFechaInicio("06/10/2022 17:00"); 
        v3.setdFechaInicio("09/10/2022 19:40");
        v4.setdFechaInicio("11/11/2022 10:26");
        v5.setdFechaInicio("15/11/2022 14:40");
    
        v1.setdFechaFin("06/10/2022 12:52");
        v2.setdFechaFin("12/10/2022 20:44");
        v3.setdFechaFin("15/10/2022 09:00");
        v4.setdFechaFin("11/11/2022 11:18");
        v5.setdFechaFin("17/11/2022 22:30");
    
        pv1.aparcaCoche(v1); pv1.aparcaCoche(v2); pv1.aparcaCoche(v3); pv1.aparcaCoche(v4); pv1.aparcaCoche(v5);
        pv1.sacaCoche(v1); pv1.sacaCoche(v2); pv1.sacaCoche(v3); pv1.sacaCoche(v4); pv1.sacaCoche(v5);
    
        pv1.getFactura(v1); pv1.getFactura(v2); pv1.getFactura(v3); pv1.getFactura(v4); pv1.getFactura(v5);
    }  
}
