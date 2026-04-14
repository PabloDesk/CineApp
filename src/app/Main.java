package app;

import model.*;
import service.*;

import java.util.Scanner;

public class Main {

    private static CineService servicio = new CineService();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        servicio.mostrarMenuService();
        scanner.close();
    }
}