Llanquihue Tour App

Este proyecto es una aplicación de escritorio desarrollada en Java para la gestión de tours y guías turísticos de la agencia "Llanquihue Tour". El sistema permite cargar información desde archivos externos, validar datos críticos (como RUT y correos) y gestionar la asignación de guías a diferentes destinos.

Características Principales
Este proyecto fue desarrollado bajo los principios de la Programación Orientada a Objetos:

Herencia: Implementada en la jerarquía de clases para compartir atributos base.

Composición: Utilizada para relacionar Tours con Guías de manera lógica.

Validaciones: Lógica de negocio robusta para asegurar la integridad de los datos de entrada (RUT, Email).

Persistencia: Lectura y carga de datos desde archivos .txt planos.

Manejo de Errores: Implementación de try-catch para asegurar la estabilidad del programa ante archivos mal formados.

Estructura del Proyecto
El código está organizado en paquetes para asegurar la modularidad:

Plaintext
src/

├── app/            # Clase Main (Punto de entrada)

├── model/          # Clases base (Persona, Guia, Tour)

├── service/        # Lógica de negocio y lectura de archivos (GestorDatos)

├── util/           # Utilidades y validaciones (Validaciones)

resources/          # Archivos de datos (.txt)



Requisitos previos
Para ejecutar este proyecto, necesitas:

JDK 17 o superior.

IntelliJ IDEA (o tu IDE de Java favorito).

Git (opcional, para clonar el repositorio).

Cómo ejecutarlo
Clona este repositorio o descarga el archivo.

Abre la carpeta del proyecto en IntelliJ IDEA.

Asegúrate de marcar la carpeta src como "Sources Root".

Localiza el archivo src/app/Main.java.

Haz clic derecho y selecciona "Run 'Main.main()'".

Notas técnicas
Validaciones: El sistema no procesa guías si el RUT o el formato del correo electrónico son inválidos.

Formato de archivos: Los archivos tours.txt y guias.txt deben mantener el formato separado por punto y coma (;).

Desarrollado como proyecto de estudio para la asignatura de Programación Orientada a Objetos.

Estudiante: Juan Andrés Alcaino Sereño

Institución: Duoc UC

Año: 2026
