package service;

import model.Cliente;
import model.Funcion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CineService {

    private static Scanner scanner = new Scanner(System.in);

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

    //do-while
    int opcion;
    boolean activo = true;

    llenarDatos();

        do

    {
        mostrarMenuService();
        opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {


            case 1 -> {
                crearCliente();
            }

            case 2 -> {
                verCartelera();
            }

            case 3 -> {
                comprarEntrada();
            }

            case 4 -> {
                verEntradasCliente();
            }

            case 0 -> {
                salir();
            }

            default -> System.out.println("⚠ Opción inválida");
        }

        if (activo) {
            System.out.println("Presiona ENTER para continuar...");
            scanner.nextLine();
            scanner.nextLine();
        }

    } while(opcion !=0);

        scanner.close();
}

    // Métodos del servicio
    public void mostrarMenuService() {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║        ===      CINE APP      ===      ║");
        System.out.println("╠════════════════════════════════════════╣");
        System.out.println("║   1. Crear cliente                     ║");
        System.out.println("║   2. Ver cartelera                     ║");
        System.out.println("║   3. Comprar entrada                   ║");
        System.out.println("║   4. Ver entradas del cliente          ║");
        System.out.println("║   0. Salir                             ║");
        System.out.println("╠════════════════════════════════════════╣");
        System.out.println("║         Seleccione una opción          ║");
        System.out.println("╚════════════════════════════════════════╝");
    // Métodos del servicio
    public void mostrarMenuService() {
        // Diego 
    }

    public void crearCliente() {
        // Angela 
    }

    public void verCartelera() {
        // Julio
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