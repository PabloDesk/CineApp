package model;

import java.util.ArrayList;
import java.util.List;

// Cliente hereda de Persona (Herencia)
public class Cliente extends Persona {

    // Atributo privado (Encapsulamiento) y uso de Colección (List)
    private List<Entrada> entradas;

    // Constructor que conecta con la clase padre
    public Cliente(String nombre, int edad) {
        super(nombre, edad);
        this.entradas = new ArrayList<>();
    }

    // Método para cumplir el requisito de "asociar entradas"
    public void agregarEntrada(Entrada entrada) {
        if (entrada != null) {
            this.entradas.add(entrada);
        }
    }

    // Getters y Setters (Encapsulamiento)
    public List<Entrada> getEntradas() {
        return entradas;
    }

    public void setEntradas(List<Entrada> entradas) {
        this.entradas = entradas;
    }

    // Opcional: Un método para mostrar cuántas entradas tiene
    public void mostrarEntradas() {
        System.out.println("Cliente: " + getNombre() + " | Entradas compradas: " + entradas.size());
    }
}