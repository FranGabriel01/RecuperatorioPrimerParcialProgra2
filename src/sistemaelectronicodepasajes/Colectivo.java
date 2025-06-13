package sistemaelectronicodepasajes;


public class Colectivo extends VehiculoTransporte{
    public Colectivo(String patente, int capacidad, String empresa){
        super(patente, capacidad, empresa);
    }
    
    @Override
    public double calcularCostoBase(){
        return 120.0;
    }
}
