package app;

import model.*;
import service.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static CineService servicio = new CineService();
    private static Scanner scanner = new Scanner(System.in);

    static List<Cliente> listaClientes = new ArrayList<>();

    public static void main(String[] args) {
        servicio.mostrarMenuService();
        scanner.close();
    }

    public static void crearCliente() {

        System.out.println("--- REGISTRAR NUEVO CLIENTE ---");

        System.out.print("Nombre del cliente: ");
        String nombre = scanner.nextLine().trim();

        if (nombre.isEmpty()) {
            System.out.println("ERROR: El nombre no puede estar vacío.");
            return;
        }

        for (Cliente c : listaClientes) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("ERROR: El cliente '" + nombre + "' ya está registrado.");
                return;
            }
        }

        System.out.print("Edad del cliente: ");
        int edad;
        try {
            edad = Integer.parseInt(scanner.nextLine().trim());
            if (edad < 0 ) {
                System.out.println("ERROR: Ingrese una edad válida.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("ERROR: La edad debe ser un número.");
            return;
        }

        Cliente nuevoCliente = new Cliente(nombre, edad);

        listaClientes.add(nuevoCliente);

        System.out.println("\n¡LISTO! Cliente " + nombre + " creado correctamente.");
    }
}