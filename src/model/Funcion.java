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
            return false;
        }
        if (asientosOcupados.contains(numeroAsiento)) {
            return false;
        }
        asientosOcupados.add(numeroAsiento);
        return true;
    }

    public void mostrarInfo() {
        System.out.print("Funcion: ");
        pelicula.mostrarInfo();
        System.out.println(" Horario: " + horario);
    }
}