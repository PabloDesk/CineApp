package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una funcion de cine.
 * Contiene una pelicula, horario, capacidad total y control de asientos ocupados.
 * 
 * @author Sary Viafara
 */
public class Funcion {
    
    // Atributos
    private Pelicula pelicula;
    private String horario;
    private int capacidadTotal;
    private List<Integer> asientosOcupados;
    
    /**
     * Constructor de la funcion.
     * 
     * @param pelicula La pelicula que se proyecta
     * @param horario Horario de la funcion (ej. "18:00")
     * @param capacidadTotal Capacidad total de la sala
     */
    public Funcion(Pelicula pelicula, String horario, int capacidadTotal) {
        this.pelicula = pelicula;
        this.horario = horario;
        this.capacidadTotal = capacidadTotal;
        this.asientosOcupados = new ArrayList<>();
    }
    
    // Getters
    public Pelicula getPelicula() {
        return pelicula;
    }
    
    public String getHorario() {
        return horario;
    }
    
    public int getCapacidadTotal() {
        return capacidadTotal;
    }
    
    /**
     * Calcula la cantidad de asientos disponibles.
     * 
     * @return Numero de asientos libres
     */
    public int asientosDisponibles() {
        return capacidadTotal - asientosOcupados.size();
    }
    
    /**
     * Verifica si hay disponibilidad de asientos.
     * 
     * @return true si hay al menos un asiento libre
     */
    public boolean hayDisponibilidad() {
        return asientosDisponibles() > 0;
    }
    
    /**
     * Vende una entrada para un asiento especifico.
     * 
     * @param numeroAsiento Numero del asiento a reservar (1 hasta capacidadTotal)
     * @return true si la venta fue exitosa, false en caso contrario
     */
    public boolean venderEntrada(int numeroAsiento) {
        if (numeroAsiento < 1 || numeroAsiento > capacidadTotal) {
            System.out.println("ERROR: Asiento invalido. Debe ser entre 1 y " + capacidadTotal);
            return false;
        }
        
        if (asientosOcupados.contains(numeroAsiento)) {
            System.out.println("ERROR: El asiento " + numeroAsiento + " ya esta ocupado.");
            return false;
        }
        
        asientosOcupados.add(numeroAsiento);
        System.out.println("Asiento " + numeroAsiento + " reservado correctamente.");
        return true;
    }
    
    /**
     * Muestra la informacion completa de la funcion.
     */
    public void mostrarInfo() {
        System.out.print("Funcion: ");
        pelicula.mostrarInfo();
        System.out.println("Horario: " + horario + " | Asientos disponibles: " + asientosDisponibles() + "/" + capacidadTotal);
    }
}