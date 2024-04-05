import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Se crea una instancia de la biblioteca de reseñas y un objeto Scanner para entrada del usuario
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        // Bucle principal que muestra el menú y maneja las acciones del usuario
        do {
            System.out.println("* * * * *  Menú  * * * * *");
            System.out.println("1. Explorar reseñas");
            System.out.println("2. Agregar reseña");
            System.out.println("3. Eliminar reseña");
            System.out.println("4. Salir");
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
                    System.out.println("Saliendo del programa...");// Se muestra un mensaje de salida
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");// Mensaje para opciones inválidas
                    break;
            }
        } while (opcion != 4);// El bucle se ejecuta hasta que el usuario elija salir (opción 4)

        scanner.close();// Se cierra el objeto Scanner al finalizar
    }

    // Función para explorar reseñas
    private static void explorarResennas(Biblioteca biblioteca) {
        //falta la función
    }

    // Función para agregar reseña
    private static void agregarResenna(Scanner scanner, Biblioteca biblioteca) {
        // falta la función
    }

    // Función para eliminar reseña
    private static void eliminarResenna(Scanner scanner, Biblioteca biblioteca) {
        // falta la función
    }
}

