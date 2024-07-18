import java.util.Scanner;

public class ContarEspaciosBlancos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        String entrada = scanner.nextLine();

        int contadorEspacios = 0;

        for (int i = 0; i < entrada.length(); i++) {
            if (Character.isWhitespace(entrada.charAt(i))) {
                contadorEspacios++;
            }
        }

        System.out.println("El número de espacios en blanco en la cadena es: " + contadorEspacios);

        scanner.close();
    }
}