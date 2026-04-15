package service;

import model.Cliente;
import model.Funcion;
import model.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class CineService {

    private List<Cliente> listaClientes;
    private List<Funcion> listaFunciones;

    // Constructor
    public CineService() {
        this.listaClientes = new ArrayList<>();
        this.listaFunciones = new ArrayList<>();
    }

    // Getters y setters
    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Funcion> getListaFunciones() {
        return listaFunciones;
    }

    public void setListaFunciones(List<Funcion> listaFunciones) {
        this.listaFunciones = listaFunciones;
    }

    // Métodos del servicio
    public void mostrarMenuService() {
        // Diego 
    }

    public void crearCliente() {
        // Angela 
    }

    public void verCartelera() {
        // Julio
        System.out.println("\n------- Cartelera  Disponible -------");

        if (listaFunciones.isEmpty()) {
            System.out.println("No hay funciones disponibles");
        } else  {
            for (int i=0; i<listaFunciones.size(); i++) {
                Funcion f =  listaFunciones.get(i);
                System.out.printf("%d. Peliculas: %-15s | Horario: % | Asientos: %d\n",
                        (i + 1),
                        f.getPelicula().getTitulo(),
                        f.getHorario(),
                        f.getAsientosDisponibles());
            }
        }
        System.out.println("---------------------------");
    }

    public void comprarEntrada() {
        // Constanza
    }

    public void verEntradasCliente() {
        // Alexander
    }

    public void salir() {
        // Sary
    }
}