package sistemaelectronicodepasajes;


public class PasajeComun implements Pasaje{
    @Override
    public double calcularCostoFinal(double costoBase){
        return costoBase;
    }
    
    @Override
    public String getTipo(){
        return "comun";
    }
}
