package util;

public class Validaciones {

    // Método estático para validar el RUT
    public static boolean validarRut(String rut) {
        // Verifica que no sea nulo ni esté vacío (solo espacios)
        if (rut == null || rut.trim().isEmpty()) {
            System.out.println("Error de validación: El RUT no puede estar vacío.");
            return false;
        }
        // Verifica que tenga al menos 8 caracteres
        if (rut.length() < 8) {
            System.out.println("Error de validación: El RUT ingresado es demasiado corto.");
            return false;
        }
        return true; // Si pasa las pruebas, el RUT es válido
    }

    // Método estático para validar el correo electrónico
    public static boolean validarEmail(String email) {
        // Verifica que no sea nulo y que contenga un '@' y un punto '.'
        if (email == null || !email.contains("@") || !email.contains(".")) {
            System.out.println("Error de validación: El correo '" + email + "' no tiene un formato válido.");
            return false;
        }
        return true; // Si pasa las pruebas, el email es válido
    }
}