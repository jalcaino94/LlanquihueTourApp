package ui;

import data.GestorDatos;
import model.Tour;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== SISTEMA GESTIÓN: LLANQUIHUE TOUR ===");

        // Instanciamos el gestor
        GestorDatos gestor = new GestorDatos();
        ArrayList<Tour> catalogo = gestor.leerArchivoTours();


        System.out.println("\n--- [CATÁLOGO COMPLETO DE TOURS] ---");
        for (Tour tour : catalogo) {
            System.out.println(tour.toString());
        }



        System.out.println("\n--- [FILTRO: TOURS SOBRE $30.000] ---");
        for (Tour tour : catalogo) {
            if (tour.getPrecio() > 30000) {
                System.out.println(tour.toString());
            }
        }
    }
}