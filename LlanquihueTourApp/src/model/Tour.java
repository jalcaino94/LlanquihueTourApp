package model;

public class Tour {

    // 1. Atributos encapsulados
    private String nombre;
    private String ubicacion;
    private int precio;

    // 2. Constructor vacío
    public Tour() {
    }

    // 3. Constructor con parámetros
    public Tour(String nombre, String ubicacion, int precio) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.precio = precio;
    }

    // 4. Métodos Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    // 5. Sobrescritura del método toString()
    @Override
    public String toString() {
        return "Tour -> Nombre: " + nombre + " | Ubicación: " + ubicacion + " | Precio: $" + precio;
    }
}