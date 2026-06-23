package model;

public class Guia extends Persona {

    // Atributo específico
    private String idiomaEspecialidad;

    // Constructor vacío
    public Guia() {
        super(); // Llama al constructor vacío de Persona
    }

    // Constructor parámetros
    public Guia(String rut, String nombre, String email, String idiomaEspecialidad) {
        super(rut, nombre, email); // Envía estos 3 datos a la clase madre (Persona)
        this.idiomaEspecialidad = idiomaEspecialidad; // Guarda este dato en esta clase
    }

    // G y S
    public String getIdiomaEspecialidad() {
        return idiomaEspecialidad;
    }

    public void setIdiomaEspecialidad(String idiomaEspecialidad) {
        this.idiomaEspecialidad = idiomaEspecialidad;
    }


    @Override
    public String toString() {
        // Llama al texto de Persona y le suma el idioma
        return "[Guía] " + super.toString() + " | Especialidad: " + idiomaEspecialidad;
    }
}