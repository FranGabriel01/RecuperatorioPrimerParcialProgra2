package sistemaelectronicodepasajes;


public class PasajeEstudiante implements Pasaje{
    @Override
    public double calcularCostoFinal(double costoBase){
        return costoBase * 0.5;
    }
    
    @Override
    public String getTipo(){
        return "Estudiante";
    }
}
