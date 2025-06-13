package sistemaelectronicodepasajes;

public abstract class VehiculoTransporte {
    protected String patente;
    protected int capacidad;
    protected String empresa;
    
    public VehiculoTransporte (String patente, int capacidad, String empresa){
        this.patente = patente;
        this.capacidad = capacidad > 0 ? capacidad : 1;
        this.empresa = empresa;
        }
    
    public String getpatente(){ return patente;}
    public int getcapacidad(){ return capacidad;}
    public String getempresa(){ return empresa;}
    
    public abstract double calcularCostoBase();
    
    @Override
    public String toString(){
        return getClass().getSimpleName() + "Empresa: " + empresa + ", Patente: " + patente + ", capacidad: " + capacidad;
    }
}
