package sistemaelectronicodepasajes;

import java.util.*;



public class GestorViajes {
    private List<Viaje> viajes = new ArrayList<>();
    
    public void agregarViaje(Viaje v){
        viajes.add(v);
        System.out.println("El viaje se registro correctamente");
    }
    
    public void mostrarViajes(){
        if (viajes.isEmpty()){
            System.out.println("No hay viajes registrados");
        }else{
            viajes.forEach(System.out::println);
        }
    }
    
    public void ordenarPorCosto(){
        Collections.sort(viajes);
        mostrarViajes();
    }
    
    public void ordenarPorNombre(){
        viajes.sort(Comparator.comparing(Viaje::getPasajero, String.CASE_INSENSITIVE_ORDER));
        mostrarViajes();
    }
    
    public void mostrarTotalRecaudado(){
        double total = viajes.stream().mapToDouble(Viaje::getCostoFinal).sum();
        System.out.println("El total de lo recaudado es: $" + total);
    }
}
