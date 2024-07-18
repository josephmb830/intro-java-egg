import java.util.Scanner;

public class VerificarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce una cadena: ");
        String entrada = scanner.nextLine();
        
        try {
            Double numero = Double.valueOf(entrada);
            System.out.println("La cadena representa un número válido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("La entrada no es un número válido.");
        } finally {
            scanner.close();
        }
    }
}
