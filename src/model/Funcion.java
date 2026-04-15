package model;

import java.util.ArrayList;
import java.util.List;

public class Funcion {
    private Pelicula pelicula;
    private String horario;
    private int capacidadTotal;
    private List<Integer> asientosOcupados;

    public Funcion(Pelicula pelicula, String horario, int capacidadTotal) {
        this.pelicula = pelicula;
        this.horario = horario;
        this.capacidadTotal = capacidadTotal;
        this.asientosOcupados = new ArrayList<>();
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public String getHorario() {
        return horario;
    }

    public int getCapacidadTotal() {
        return capacidadTotal;
    }

    public int asientosDisponibles() {
        return capacidadTotal - asientosOcupados.size();
    }

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

    public void mostrarInfo() {
        System.out.print("Funcion: ");
        pelicula.mostrarInfo();
        System.out.println("Horario: " + horario + " | Asientos disponibles: " + asientosDisponibles() + "/" + capacidadTotal);
    }
}