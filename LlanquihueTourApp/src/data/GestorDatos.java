package data;

// Importaciones necesarias para manejo de archivos y listas
import model.Tour;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestorDatos {

    public ArrayList<Tour> leerArchivoTours() {
        // QArrayList
        ArrayList<Tour> listaTours = new ArrayList<>();


        String rutaArchivo = "resources/tours.txt";


        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;


            while ((linea = br.readLine()) != null) {


                String[] datos = linea.split(";");


                if (datos.length == 3) {
                    String nombre = datos[0];
                    String ubicacion = datos[1];

                    int precio = Integer.parseInt(datos[2]);


                    Tour nuevoTour = new Tour(nombre, ubicacion, precio);
                    listaTours.add(nuevoTour);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return listaTours;
    }
}