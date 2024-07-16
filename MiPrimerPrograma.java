import java.util.Scanner;

public class MiPrimerPrograma {
    public static void main(String[] args) {
        System.out.println("Hola Mundo!");
        System.out.println("Bienvenido a tu curso de Java");
        System.out.println("Mi nombre es Joseph");
        System.out.println("Mi edad es 29 años");

        //variables
        int miEntero;
        miEntero = 30;
        int edad = 29;
        String saludo = "Hola! soy Joseph ";
        boolean bool = true;
        char a = 'A';
        long distanciaExoplaneta = 4_014_964_610_000_000L; // Distancia en metros a un exoplaneta similar a la Tierra
        float time = 1.53f; // Los valores de tipo float deben terminar con 'f'
        System.out.println(saludo + "Mi edad es: " + edad + " no es: " + miEntero + " siempre intento llegar " + time + " minutos más temprano"  + ". también es " + bool + " que prefiero una nota de " + a + " y aunque la distancia hacia un explaneta cercano sea muy grande como de " + distanciaExoplaneta + " metros, hay que recordar que todo es posible.");
    
        //datos reales
        /*
         * Dato: "Temperatura media de una ciudad durante el verano"
         * Tipo de dato: double
         * Justificación: se permite decimal y cubre un amplio rango de valores posibles para la temperatura
         */
        double temperaturaVerano = 26.65;
        /*
         * Dato: "El precio de un producto en una tienda (en dólares y centavos)."
         * Tipo de dato: float
         * Justificación: permite decimal.
         */
        float productoTienda = 19.99f;
        /*
         * Dato: "El nombre completo de una persona."
         * Tipo de dato: String
         * Justificación: permite letras y espacios.
         */
        String nombreCompleto = "Joseph Morán";
        /*
         * Dato: "La fecha de nacimiento de una persona."
         * Tipo de dato: String
         * Justificación: permite numeros y caracteres especiales.
         */
        String cumpleaños = "21/08/94";
        /*
         * Dato: "El número de habitantes de una ciudad."
         * Tipo de dato: long
         * Justificación: permite números grandes.
         */
        long habitantesLima = 10_000_000L;
        /*
         * Dato: "La duración de una película (en minutos)."
         * Tipo de dato: byte
         * Justificación: permite un número acorde.
         */
        byte duracionPelicula = 125;
        /*
         * Dato: "Si un artículo está disponible o no en una tienda (true/false)."
         * Tipo de dato: boolean
         * Justificación: permite booleano.
         */
        boolean disponibilidadArticulo = true;
        /*
         * Dato: "La distancia entre dos ciudades (en kilómetros)."
         * Tipo de dato: short
         * Justificación: permite un número adecuado para la cantidad.
         */
        short distanciaEntreLimayArequipa = 765;
        /*
         * Dato: "El número de teléfono de una persona."
         * Tipo de dato: int
         * Justificación: permite un número adecuado para la cantidad.
         */
        int numeroDeTelefono = 999765473;
        /*
         * Dato: "La cantidad de existencias de un producto en una tienda."
         * Tipo de dato: byte
         * Justificación: permite un número adecuado para la cantidad.
         */
        byte existenciasDeProducto = 20;

        // Ejercicio Complementario

        String mensajeBienvenida = "Bienvenido a Java";
        byte temperaturaActual = 19;
        boolean datoLogico = true;

        System.out.println(mensajeBienvenida + " soy " + nombreCompleto + " y la temperatura actual es " + temperaturaActual + "C°"
        + " aunque la temperatura media en verano es de " 
        + temperaturaVerano + "C°"+ " la fecha de mi cumpleaños es " + cumpleaños + ". Aunque no es " + datoLogico + " que mi número de telefono es " + numeroDeTelefono +
        ". Y normalmente me gusta ver películas que duren en promedio " + duracionPelicula + " minutos. Si tuviera una tienda cada producto debería tener en promedio "
        + existenciasDeProducto + " unidades en stock. Y tener un precio aproximado de " + productoTienda + " soles. La disponibilidad de media de cada artículo es "
        + disponibilidadArticulo + " y se podrían hacer entregas a provincia ya que la distancia proximada en linea recta de lima a Arequipa es de " + distanciaEntreLimayArequipa 
        + " kilometros."
        + " Podría ser un e-commerce dirigido a toda la población de lima"
        + " que son aproximadamente " + habitantesLima + " de habitantes."
        );

        Scanner pepe = new Scanner(System.in);
        System.out.print("Por favor ingrese una edad: ");
        edad = pepe.nextInt();
        pepe.nextLine();
        System.out.print("Por favor ingrese un nombre: ");
        nombreCompleto = pepe.nextLine();
        System.out.println("Hola soy "+nombreCompleto+" y mi edad es: "+edad+" años.");

    }
}