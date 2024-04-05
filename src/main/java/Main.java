import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("* * * * *  Menú  * * * * *");
            System.out.println("1. Explorar reseñas");
            System.out.println("2. Agregar reseña");
            System.out.println("3. Eliminar reseña");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    explorarResennas(biblioteca);
                    break;
                case 2:
                    agregarResenna(scanner, biblioteca);
                    break;
                case 3:
                    eliminarResenna(scanner, biblioteca);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
                    break;
            }
        } while (opcion != 4);

        scanner.close();
    }

    private static void explorarResennas(Biblioteca biblioteca) {
        //falta la función
    }

    private static void agregarResenna(Scanner scanner, Biblioteca biblioteca) {
        // falta la función
    }

    private static void eliminarResenna(Scanner scanner, Biblioteca biblioteca) {
        // falta la función
    }
}

