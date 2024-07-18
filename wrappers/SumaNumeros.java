import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cadena que representa un número entero
        System.out.print("Introduce una cadena que represente un número entero: ");
        String cadenaEntero = scanner.nextLine();

        // Solicitar la cadena que representa un número decimal
        System.out.print("Introduce una cadena que represente un número decimal: ");
        String cadenaDecimal = scanner.nextLine();

        try {
            // Convertir las cadenas a sus respectivos tipos de datos
            int numeroEntero = Integer.valueOf(cadenaEntero);
            double numeroDecimal = Double.valueOf(cadenaDecimal);

            // Sumar los valores
            double suma = numeroEntero + numeroDecimal;

            // Imprimir el resultado
            System.out.println("La suma del número entero y el número decimal es: " + suma);
        } catch (NumberFormatException e) {
            System.out.println("Una de las entradas no es un número válido.");
        } finally {
            scanner.close();
        }
    }
}
