import java.util.Scanner;

public class ContarDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que introduzca un número
        System.out.print("Introduce un número: ");
        String numeroStr = scanner.nextLine();

        int contadorDigitos = 0;

        // Convertir el número a cadena y contar los dígitos
        for (int i = 0; i < numeroStr.length(); i++) {
            if (Character.isDigit(numeroStr.charAt(i))) {
                contadorDigitos++;
            }
        }

        // Mostrar el resultado al usuario
        System.out.println("El número de dígitos en el número es: " + contadorDigitos);

        scanner.close();
    }
}
