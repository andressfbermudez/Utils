/*
 * Ejercicio a desarrollar
 *
 * 2. Caballos
 *
 * a. Escriba un método java que reciba como entrada cuatro valores enteros, fila_cab, col_cab, fila_rey y col_rey;
 *    y decida si, en un tablero de ajedrez, un caballo en la posición (fila_cab, col_cab) ataca a un rey en la
 *    posición (fila_rey, col_rey).
 *
 * b. Escriba un programa que pida al usuario las posiciones de un caballo y un rey en un tablero de ajedrez, y
 *    muestre en consola si el rey es atacado por el caballo. El programa debe usar el método creado en el literal a.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ajedrez {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        // Posiciones de las fichas
        int filaCaballo = 0;
        int columnaCaballo = 0;
        int filaRey = 0;
        int columnaRey = 0;

        while (true) {
            System.out.println();
            System.out.println(":::::::::::::::::::::::::::: INICIO ::::::::::::::::::::::::::::::::::::");

            try {
                // Posicion del caballo
                System.out.print("Ingresa la fila en la que se encuentra posicionado el rey: ");
                filaRey = sc.nextInt();

                System.out.print("Ingresa la columna en la que se encuentra posicionado el rey: ");
                columnaRey = sc.nextInt();
                System.out.println("-----------------------------------------------------------------------");

                // Posicion del rey
                System.out.print("Ingresa la fila en la que se encuentra posicionado el caballo: ");
                filaCaballo = sc.nextInt();

                System.out.print("Ingresa la columna en la que se encuentra posicionado el caballo: ");
                columnaCaballo = sc.nextInt();
                System.out.println("-----------------------------------------------------------------------");

                // Verificar si los datos ingresados son compatibles con el tamaño de un tablero de ajedrez (8 x 8)
                if (filaCaballo < 1 || filaRey < 1 || columnaCaballo < 1 || columnaRey < 1 || filaCaballo > 8 ||
                        filaRey > 8 || columnaCaballo > 8 || columnaRey > 8) {
                    System.out.println();
                    System.out.println("¡Ingresaste algun dato invalido, recuerda que un tablero de ajedrez tiene un tamaño de 8 filas X 8 columnas!");
                    System.out.println("Nota: Recuerda usar solo valores numericos positivos.");
                } else {
                    verificarAtaqueRey(filaCaballo, columnaCaballo, filaRey, columnaRey);
                }
            } catch (InputMismatchException e) {
                System.out.println();
                System.out.println("Error: " + e);
                System.out.println("¡Recuerda ingresar solo valores numericos enteros!");
            }
        }
    }

    // Metodo literal a.
    public static void verificarAtaqueRey(int filaCaballo, int columnaCaballo, int filaRey, int columnaRey) {
        /*
         * Nota: El caballo se mueve en forma de L, teniendo en cuenta esto, se evalua cada caso
         *       posible de acuerdo a la posicion del rey, para determinar si este esta siendo atacado.
        */
        if (filaCaballo + 2 == filaRey && columnaCaballo + 1 == columnaRey) {
            System.out.println("¡EL REY ESTA SIENDO ATACADO POR EL CABALLO!");
            
        } else if (filaCaballo + 2 == filaRey && columnaCaballo - 1 == columnaRey) {
            System.out.println("¡EL REY ESTA SIENDO ATACADO POR EL CABALLO!");
            
        } else if (filaCaballo + 1 == filaRey && columnaCaballo - 2 == columnaRey) {
            System.out.println("¡EL REY ESTA SIENDO ATACADO POR EL CABALLO!");
            
        } else if (filaCaballo - 1 == filaRey && columnaCaballo - 2 == columnaRey) {
            System.out.println("¡EL REY ESTA SIENDO ATACADO POR EL CABALLO!");
            
        } else if (filaCaballo - 2 == filaRey && columnaCaballo - 1 == columnaRey) {
            System.out.println("¡EL REY ESTA SIENDO ATACADO POR EL CABALLO!");
            
        } else if (filaCaballo - 2 == filaRey && columnaCaballo + 1 == columnaRey) {
            System.out.println("¡EL REY ESTA SIENDO ATACADO POR EL CABALLO!");
            
        } else if (filaCaballo - 1 == filaRey && columnaCaballo + 2 == columnaRey) {
            System.out.println("¡EL REY ESTA SIENDO ATACADO POR EL CABALLO!");
            
        } else if (filaCaballo + 1 == filaRey && columnaCaballo + 2 == columnaRey) {
            System.out.println("¡EL REY ESTA SIENDO ATACADO POR EL CABALLO!");
            
        } else {
            System.out.println(" ... EL REY NO ESTA SIENDO ATACADO ...");
        }
    }
}
