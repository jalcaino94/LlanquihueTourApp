package model;

public class Persona {

    // Atributos
    private String rut;
    private String nombre;
    private String email;

    // Constructor vacío
    public Persona() {
    }

    // Constructor parametro
    public Persona(String rut, String nombre, String email) {
        this.rut = rut;
        this.nombre = nombre;
        this.email = email;
    }

    // Getters y Setters
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "RUT: " + rut + " | Nombre: " + nombre + " | Email: " + email;
    }
}