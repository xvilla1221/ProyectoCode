import java.util.Scanner;

/**
 * Clase principal que contiene el método main para ejecutar el programa de gestión de reseñas sobre películas.
 */
public class Main {
    /**
     * Método principal que inicia la ejecución del programa.
     * @param args Los argumentos de línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        // Se crea una instancia de la biblioteca de reseñas y un objeto Scanner para entrada del usuario
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        // Bucle principal que muestra el menú y maneja las acciones del usuario
        do {
            System.out.println("* * * * *  Menu  * * * * *");
            System.out.println("1. Explorar reseñas");
            System.out.println("2. Agregar reseña");
            System.out.println("3. Eliminar reseña");
            System.out.println("4. Editar reseña");
            System.out.println("5. Explorar reseña");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            // Se lee la opción ingresada por el usuario

            switch (opcion) {
                case 1:
                    explorarResennas(biblioteca);// Se invoca la función para explorar reseñas
                    break;
                case 2:
                    agregarResenna(scanner, biblioteca);// Se invoca la función para agregar reseña
                    break;
                case 3:
                    eliminarResenna(scanner, biblioteca);// Se invoca la función para eliminar reseña
                    break;
                case 4:
                    editarResenna(scanner, biblioteca);// Se invoca la función para editar reseña
                    break;
                case 5:
                    explorarResenna(scanner, biblioteca);// Se invoca la función para explorar reseña
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");// Se muestra un mensaje de salida
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");// Mensaje para opciones inválidas
                    break;
            }
        } while (opcion != 6);// El bucle se ejecuta hasta que el usuario elija salir (opción 6)

        scanner.close();// Se cierra el objeto Scanner al finalizar
    }

    /**
     * Función para explorar reseñas en la biblioteca.
     * @param biblioteca La biblioteca de reseñas.
     */
    private static void explorarResennas(Biblioteca biblioteca) {
        // Función para explorar reseñas - Falta implementación
    }

    /**
     * Función para agregar una nueva reseña a la biblioteca.
     * @param scanner Objeto Scanner para entrada del usuario.
     * @param biblioteca La biblioteca de reseñas.
     */
    private static void agregarResenna(Scanner scanner, Biblioteca biblioteca) {
        // Función para agregar reseña - Falta implementación
    }

    /**
     * Función para eliminar una reseña de la biblioteca.
     * @param scanner Objeto Scanner para entrada del usuario.
     * @param biblioteca La biblioteca de reseñas.
     */
    private static void eliminarResenna(Scanner scanner, Biblioteca biblioteca) {
        // Función para eliminar reseña - Falta implementación
    }

    /**
     * Función para editar una reseña existente en la biblioteca.
     * @param scanner Objeto Scanner para entrada del usuario.
     * @param biblioteca La biblioteca de reseñas.
     */
    private static void editarResenna(Scanner scanner, Biblioteca biblioteca) {
        // Función para editar reseña - Falta implementación
    }

    /**
     * Función para explorar una reseña específica en la biblioteca.
     * @param scanner Objeto Scanner para entrada del usuario.
     * @param biblioteca La biblioteca de reseñas.
     */
    private static void explorarResenna(Scanner scanner, Biblioteca biblioteca) {
        // Función para explorar reseña - Falta implementación
    }
}

