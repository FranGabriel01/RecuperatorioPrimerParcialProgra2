package sistemaelectronicodepasajes;


public class Viaje implements Comparable<Viaje>{
    private VehiculoTransporte vehiculo;
    private String pasajero;
    private Pasaje pasaje;
    private double costoFinal;
    
    public Viaje(String pasajero, VehiculoTransporte vehiculo, Pasaje pasaje){
        this.pasajero = pasajero;
        this.vehiculo = vehiculo;
        this.pasaje = pasaje;
        this.costoFinal = pasaje.calcularCostoFinal(vehiculo.calcularCostoBase());
    }
    
    public String getPasajero(){
        return pasajero;
    }

    public double getCostoFinal() {
        return costoFinal;
    }
    
    @Override
    public int compareTo(Viaje otro){
        return Double.compare(this.costoFinal, otro.costoFinal);
    }
    
    @Override
    public String toString(){
        return "Pasajero: " + pasajero + " vehiculo: " + vehiculo + " Tipo de pasaje: " + pasaje.getTipo() + " costo final: $" + costoFinal;
    }
}
