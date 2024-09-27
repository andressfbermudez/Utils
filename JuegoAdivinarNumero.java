import java.util.Random;
import java.util.Scanner;

/*
 * Crea un programa que simule un juego de adivinanzas. El programa debe generar un número
 * aleatorio entre 0 y 100, y pedir al usuario que intente adivinar ese número en un máximo
 * de 5 intentos. En cada intento, el programa debe informar si el número ingresado
 * por el usuario es mayor o menor que el número generado.
*/

public class Decisiones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int randomNumber = random.nextInt(101);

        int numberUser = 0;
        int counter = 1;

        System.out.println("Numero generado: " + randomNumber);

        while(counter <= 5) {
            System.out.println();
            System.out.print("Adivina el numero: ");
            numberUser = sc.nextInt();

            if (numberUser == randomNumber) {
                System.out.println("¡Felicitaciones!, lo lograste.");
                break;
            } else if (numberUser < randomNumber) {
                System.out.println("El numero es mayor.");
                counter++;
            } else {
                System.out.println("El numero es menor.");
                counter++;
            }
        }
        if (numberUser != randomNumber) {
            System.out.println();
            System.out.println("Lo siento, perdiste, Intentalo nuevamente.");
        }

        System.out.println();
        System.out.println("Fin del Juego.");
    }
}

