# LlanquihueTourApp
Proyecto en Java para la agencia Llanquihue Tour. El sistema lee datos de tours desde un archivo .txt, crea objetos y los almacena en un ArrayList. Incluye funcionalidades para recorrer el catálogo y filtrar los resultados por precio mediante Programación Orientada a Objetos.
Estructura de carpetas
El proyecto está organizado bajo una arquitectura de paquetes:
- `src/model/`: Contiene la clase `Tour` (molde de datos).
- `src/data/`: Contiene la clase `GestorDatos` (lógica de lectura de archivos).
- `src/ui/`: Contiene la clase principal `Main` (interfaz de consola).
- `src/resources/`: Directorio que almacena el archivo externo `tours.txt`.

Instrucciones para ejecutar
1. Clona este repositorio.
2. Abre el proyecto utilizando IntelliJ IDEA.
3. Asegúrate de que la carpeta `resources` esté correctamente vinculada y contenga el archivo `tours.txt`.
4. Dirígete al paquete `src/ui/` y abre el archivo `Main.java`.
5. Ejecuta la clase `Main` (Run 'Main.main()').
6. Visualiza el catálogo completo y el catálogo filtrado directamente en la consola del IDE.
