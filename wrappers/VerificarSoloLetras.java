import java.util.Scanner;

public class VerificarSoloLetras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        String entrada = scanner.nextLine();

        boolean soloLetras = true;

        for (int i = 0; i < entrada.length(); i++) {
            if (!Character.isLetter(entrada.charAt(i))) {
                soloLetras = false;
                break;
            }
        }

        if (soloLetras) {
            System.out.println("La cadena contiene solo letras.");
        } else {
            System.out.println("La cadena no contiene solo letras.");
        }

        scanner.close();
    }
}
