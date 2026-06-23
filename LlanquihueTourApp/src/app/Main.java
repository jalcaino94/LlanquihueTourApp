package app;

import service.GestorDatos; // Importamos desde el paquete service
import model.Tour;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE GESTIÓN: LLANQUIHUE TOUR ===");

        // 1. Instanciamos el gestor
        GestorDatos gestor = new GestorDatos();

        // 2. Cargamos los Guías
        System.out.println("\n>>> CARGANDO REGISTROS DE GUÍAS...");
        gestor.cargarGuias();

        // 3. Mostramos todos los guías validados
        gestor.mostrarTodosLosGuias();

        // 4. Probamos la búsqueda por idioma
        gestor.buscarPorIdioma("Ingles");

        // 5. Búsqueda de prueba
        gestor.buscarPorIdioma("Frances");

        // ==========================================================
        System.out.println("\n>>> CARGANDO CATÁLOGO DE TOURS...");
        ArrayList<Tour> listaTours = gestor.leerArchivoTours();

        for (Tour tour : listaTours) {
            System.out.println(tour.toString());
        }
    }
}