import java.util.Scanner;

public class MenuInteractivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("✏️  Menú Interactivo");
            System.out.println("1. Comprar producto");
            System.out.println("2. Realizar devolución");
            System.out.println("3. Ver mis pedidos");
            System.out.println("4. Preguntas frecuentes");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has elegido la opción: Comprar producto");
                    break;
                case 2:
                    System.out.println("Has elegido la opción: Realizar devolución");
                    break;
                case 3:
                    System.out.println("Has elegido la opción: Ver mis pedidos");
                    break;
                case 4:
                    System.out.println("Has elegido la opción: Preguntas frecuentes");
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción entre 1 y 5.");
                    break;
            }
            System.out.println();
        } while (opcion != 5);

        scanner.close();
    }
}