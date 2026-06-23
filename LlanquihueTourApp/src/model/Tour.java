package model;

public class Tour {

    private String nombre;
    private String ubicacion;
    private int precio;
    private Guia guiaAsignado;

    public Tour() {
    }

    // Constructor
    public Tour(String nombre, String ubicacion, int precio, Guia guiaAsignado) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.precio = precio;
        this.guiaAsignado = guiaAsignado;
    }

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

    public Guia getGuiaAsignado() {
        return guiaAsignado;
    }

    public void setGuiaAsignado(Guia guiaAsignado) {
        this.guiaAsignado = guiaAsignado;
    }

    @Override
    public String toString() {
        String infoTour = "Tour -> Nombre: " + nombre + " | Ubicación: " + ubicacion + " | Precio: $" + precio;
        // Si el tour tiene un guía asignado, mostramos su nombre
        if (guiaAsignado != null) {
            infoTour += "\n   L Guía a cargo: " + guiaAsignado.getNombre() + " (Especialidad: " + guiaAsignado.getIdiomaEspecialidad() + ")";
        } else {
            infoTour += "\n   L Guía a cargo: Sin guía asignado aún.";
        }
        return infoTour;
    }
}