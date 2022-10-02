package TEMA01SHG.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ParkingVehiculo implements Parking {
    /* Atributos */
    protected static final double dPrecioPorMinuto = 0.0425;
    protected static final int iPlazas = 100;
    private String sDireccionParking;
    private int iPlazasOcupadas;

    /* Constructor */
    public ParkingVehiculo(String paramDireccionParking) {
        this.sDireccionParking = paramDireccionParking;
    }

    /* Getters */
    public static double getDprecioporminuto() {
        return dPrecioPorMinuto;
    }

    public static int getIplazas() {
        return iPlazas;
    }

    public String getsDireccionParking() {
        return sDireccionParking;
    }

    public int getiPlazasOcupadas() {
        return iPlazasOcupadas;
    }

    /* Setters */
    public void setsDireccionParking(String sDireccionParking) {
        this.sDireccionParking = sDireccionParking;
    }

    public void setiPlazasOcupadas(int iPlazasOcupadas) {
        this.iPlazasOcupadas = iPlazasOcupadas;
    }
    /* Método hayPlaza() que indique si hay sitio para aparcar */
    @Override
    public boolean hayPlaza() {
        boolean hayplaza;
        if(iPlazasOcupadas < 100){
            hayplaza = true;
        }
        else{
            hayplaza = false;
        }
        return hayplaza;
    }
    /* Método aparcaCoche() que estaciona un vehículo en el parking. Se pasa por parámetro el coche. */
    @Override
    public void aparcaCoche(Vehiculo v) {

        if (hayPlaza() == true){
        iPlazasOcupadas ++;
        System.out.println("Ha entrado un vehículo con matrícula: "+v.getsMatricula()+" En la fecha y hora: "+v.getdFechaInicio());
        }
        else{
            System.out.println("El vehículo con matrícula "+v.getsMatricula()+" intentó estacionar pero está lleno");
        }
        System.out.println("Hay en el parking "+iPlazasOcupadas+" coches.");

    }
    /* Método sacaCoche() que saca un vehículo del parking. Se pasa por parámetro el coche. */
    @Override
    public void sacaCoche(Vehiculo v) {
        iPlazasOcupadas --;
        System.out.println("Ha salido un vehículo con matrícula: "+v.getsMatricula()+" En la fecha y hora: "+v.getdFechaFin()
        +"\nHay en el parking "+iPlazasOcupadas+" coches.");

    }

    /* getFactura() que devuelve el importe a pagar por cada vehículo. Se pasa por parámetro el coche. */
    @Override
    public void getFactura(Vehiculo v) throws ParseException {

        SimpleDateFormat ParseadorFechas = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date Entra = ParseadorFechas.parse(v.getdFechaInicio());
        Date Sale = ParseadorFechas.parse(v.getdFechaFin());

        long diferenciaTiempo = Sale.getTime() - Entra.getTime();
        TimeUnit PasamosAMinutos = TimeUnit.MINUTES;
        long DiferenciaMinutos = PasamosAMinutos.convert(diferenciaTiempo, TimeUnit.MILLISECONDS);

        double Precio = DiferenciaMinutos*dPrecioPorMinuto;
        double PrecioFinal = Math.round(Precio*100.0)/100.0;
        System.out.println("El vehículo con matrícula "+v.getsMatricula()+" ha entrado el Día: "+Entra+" y ha salido el día: "+Sale
        +"\nEl precio de la factura asciende a: "+PrecioFinal + " Euros");
    }
}
