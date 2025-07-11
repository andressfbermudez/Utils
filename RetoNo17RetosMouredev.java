/*
 * Reto No. 17 de los retos de programación de Mouredev.
 * https://retosdeprogramacion.com/ejercicios/
 *
 * Crea una función que reciba un String de cualquier tipo y se encargue de
 * poner en mayúscula la primera letra de cada palabra.
 * - No se pueden utilizar operaciones del lenguaje que
 *   lo resuelvan directamente.
 */
import java.util.Scanner; // Para tomar entradas del usuario

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput;

        System.out.print("Enter the text: ");
        userInput = sc.nextLine();

        System.out.println(convertText(userInput));
    }

    // Función que convierte la primera letra de cada palabra de un texto en mayúscula.
    public static String convertText(String text) {
        // Para verificar si lo que ingreso el usuario es valido o esta vació.
        if (text == null || text.isEmpty()) {
            return "The text entered is not valid!";
        }
        // Para convertir el texto ingresado por el usuario en un arreglo de palabras.
        String[] textInWords = text.split(" "); // Método split con parámetro de espacio vació para detectar palabra x palabra.

        // Para recorrer el arreglo elemento x elemento e intercambiar la primera letra por una mayúscula.
        for(int i = 0; i < textInWords.length; i++) {
            textInWords[i] = textInWords[i].substring(0, 1).toUpperCase() + textInWords[i].substring(1);
        }

        // Para convertir el arreglo anterior en una cadena de caracteres
        String textConverted = String.join(" ",textInWords); // join(" "), es para indicar como dividir cada palabra.
        // En este caso que no tenga delimitadores para que sea un texto completo.
        return "Solution: " + textConverted;
    }
}