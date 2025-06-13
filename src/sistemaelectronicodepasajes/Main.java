
package sistemaelectronicodepasajes;

import java.util.Scanner;

public class Main {

    public static final Scanner sc = new Scanner (System.in);
    private static  final GestorViajes gestor = new GestorViajes();
    
    public static void main(String[] args) {
        int opcion;
        
        do{
            mostrarMenu();
            opcion = leerEnteroSeguro("Opcion: ");
            
            switch (opcion) {
                case 1 -> registrarViaje();
                case 2 -> gestor.mostrarViajes();
                case 3 -> gestor.ordenarPorCosto();
                case 4 -> gestor.ordenarPorNombre();
                case 5 -> gestor.mostrarTotalRecaudado();
                case 6 -> System.out.println("Fin del programad");
                default -> System.out.println("Tocaste cualquier cosa menos una opcion valida");
            }
        }while(opcion !=6);
    }
    
    private static void mostrarMenu(){
        System.out.println("\n =========== MENU =========== ");
        System.out.println("1. Registrar nuevo viaje");
        System.out.println("2. Mostrar todos lso viajes");
        System.out.println("3. Ordenar viajes por costo");
        System.out.println("4. Ordenar viajes por nombre de pasajero");
        System.out.println("5. Mostrar total recaudado.");
        System.out.println("6. Salir.");
    }
    
    private static void registrarViaje(){
        String nombrePasajero = leerTextoSeguro("Nombre del pasajero: ");
        
        int tipoVehiculo;
        do{
            tipoVehiculo = leerEnteroSeguro("Tipo vehiculo \n1-Colectivo \n2-Tren \n3-Subte");
            if(tipoVehiculo < 1 || tipoVehiculo > 3){
                System.out.println("Opcion invalida");
            }
        }while(tipoVehiculo < 1 || tipoVehiculo > 3);
        String patente = leerTextoSeguro("Ingrese la patente: ");
        
        int capacidad = leerEnteroSeguro("Capacidad ");
        
        String empresa = leerTextoSeguro("Empresa: ");
        VehiculoTransporte vehiculo;
        
        switch (tipoVehiculo) {
                case 1 -> vehiculo = new Colectivo(patente, capacidad, empresa);
                case 2 -> vehiculo = new Tren(patente, capacidad, empresa);
                case 3 -> vehiculo = new Subte(patente, capacidad, empresa);
                default ->{
                    System.out.println("Tipo invalido");
                    return;
                }
        }
        
        int tipoPasaje;
        do{
            tipoPasaje = leerEnteroSeguro("Tipo de pasaje \n1-Comun \n2-Estudiante \n3-Junilado:");
            if(tipoPasaje < 1 || tipoPasaje > 3){
                System.out.println("Opcion invalida");
            }
        }while(tipoPasaje < 1 || tipoPasaje > 3);
        Pasaje pasaje;           
        switch (tipoPasaje) {
                case 1 -> pasaje = new PasajeComun();
                case 2 -> pasaje = new PasajeEstudiante();
                case 3 -> pasaje = new PasajeJubilado();
                default ->{
                    System.out.println("Tipo de pasaje invalido");
                    return;
                }
        }
        
        
        Viaje viaje = new Viaje(nombrePasajero, vehiculo, pasaje);
        gestor.agregarViaje(viaje);
    }
    
    
    private static int leerEnteroSeguro(String mensaje){
        int numero;
        System.out.println(mensaje);
        while(!sc.hasNextInt()){
            System.out.println("Ingrese un numero valido.");
            sc.next();
            System.out.print(mensaje);
        }
        numero = sc.nextInt();
        sc.nextLine();
        return numero;
    }
    
    private static String leerTextoSeguro(String mensaje){
        String texto;
        do{
            System.out.print(mensaje);
            texto = sc.nextLine().trim();
            if (texto.isEmpty()){
                System.out.println("El texto no puede estar vacio.");
            }
        }while (texto.isEmpty());
        return texto;
    }
}










































