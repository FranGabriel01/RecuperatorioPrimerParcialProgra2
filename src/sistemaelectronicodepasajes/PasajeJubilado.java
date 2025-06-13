package sistemaelectronicodepasajes;

public class PasajeJubilado implements Pasaje{
    @Override
    public double calcularCostoFinal(double costoBase){
        return costoBase * 0.25;
    }
    
    @Override
    public String getTipo(){
        return "Jubilado";
    }
}
