import java.util.Scanner;

public class ConvertirCadenaANumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una cadena que represente un número entero: ");
        String entrada = scanner.nextLine();

        try {
            int numero = Integer.parseInt(entrada);
            System.out.println("La cadena convertida a número entero es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("La entrada no es un número entero válido.");
        } finally {
            scanner.close();
        }
    }
}