package service;

import model.Tour;
import model.Guia;
import util.Validaciones;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestorDatos {

    private ArrayList<Guia> listaGuias = new ArrayList<>();

    // --- MÉTODOS DE TOURS ---
    public ArrayList<Tour> leerArchivoTours() {
        ArrayList<Tour> listaTours = new ArrayList<>();
        String rutaArchivo = "resources/tours.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty()) continue;
                String[] datos = linea.split(";");
                if (datos.length >= 3) {
                    try {
                        String nombre = datos[0];
                        String ubicacion = datos[1];
                        int precio = Integer.parseInt(datos[2]);
                        Tour nuevoTour = new Tour(nombre, ubicacion, precio, null);
                        listaTours.add(nuevoTour);
                    } catch (NumberFormatException e) {
                        System.out.println("Error en precio: " + linea);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer tours: " + e.getMessage());
        }
        return listaTours;
    }

    // --- MÉTODOS DE GUÍAS ---
    public void cargarGuias() {
        String ruta = "resources/guias.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty()) continue;
                String[] datos = linea.split(";");
                if (datos.length >= 4) {
                    String rut = datos[0];
                    String nombre = datos[1];
                    String email = datos[2];
                    String idioma = datos[3];
                    if (Validaciones.validarRut(rut) && Validaciones.validarEmail(email)) {
                        Guia nuevoGuia = new Guia(rut, nombre, email, idioma);
                        listaGuias.add(nuevoGuia);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer guías: " + e.getMessage());
        }
    }


    public void mostrarTodosLosGuias() {
        System.out.println("\n--- LISTA DE GUÍAS ---");
        for (Guia g : listaGuias) {
            System.out.println(g.toString());
        }
    }

    public void buscarPorIdioma(String idioma) {
        System.out.println("\n--- BÚSQUEDA: " + idioma + " ---");
        boolean encontrado = false;
        for (Guia g : listaGuias) {
            if (g.getIdiomaEspecialidad().equalsIgnoreCase(idioma)) {
                System.out.println(g.toString());
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("No hay guías para ese idioma.");
    }
}