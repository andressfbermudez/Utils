import java.util.Scanner;

/*
 * Politecnico Grancolombiano
 *
 * Facultad: Ingenieria Diseño e Innovacion
 * Materia: Programación de computadores
 *
 * Autores:
 *
 *  1. Jennifer Berrio Gonzalez
 *  2. Andrés Felipe Bermúdez Molano
 *  3. Brayan Stivel Bernal García
 *  4. Julian Steven Bojaca Ovalle
 *
 * Entrega previa 2 - Escenario 5
 *
 * Ejercicio a desarrollar:
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

public class VerificacionAtaquesAjedrez {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println();
            System.out.println(":::::::::::::::::::::::::::: INICIO ::::::::::::::::::::::::::::::::::::");
            System.out.println();

            int filaCab = validateDataEntry("Ingrese la fila del caballo (1-8): ");
            int colCab = validateDataEntry("Ingrese la columna del caballo (1-8): ");

            int filaRey = validateDataEntry("Ingrese la fila del rey (1-8): ");
            int colRey = validateDataEntry("Ingrese la columna del rey (1-8): ");

            boolean ataca = horseAttack(filaCab, colCab, filaRey, colRey);

            if (ataca) {
                System.out.println();
                System.out.println("(JAQUE) ¡EL REY ESTA SIENDO ATACADO!");
            } else {
                System.out.println();
                System.out.println("... El rey NO esta siendo atacado ...");
            }
            System.out.println("-------------------------------------------------------------------------");
        }
    }

    public static int validateDataEntry(String text) {
        int number = 0;

        while (true) {
            System.out.println(text);
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number > 0 && number < 9) {
                    return number; // Retorna si es válido
                } else {
                    System.out.println();
                    System.out.println("ENTRADA NO VALIDA: EL NUMERO DEBE SER MAYOR QUE 0 Y MENOR QUE 9.");
                    System.out.println();
                }
            } else {
                System.out.println();
                System.out.println("ENTRADA NO VALIDA: DEBES INGRESAR UN NUMERO MAYOR QUE 0 Y MENOR QUE 9.");
                System.out.println();
                scanner.next(); // Limpia la entrada inválida
            }
        }
    }

    public static boolean horseAttack(int filaCab, int colCab, int filaRey, int colRey) {
        // Movimientos posibles del caballo
        int[] movimientosFila = {-2, -2, 2, 2, -1, -1, 1, 1};
        int[] movimientosCol = {-1, 1, -1, 1, -2, 2, -2, 2};

        // Verificar si el caballo ataca al rey
        for (int i = 0; i < 8; i++) {
            int filaDestino = filaCab + movimientosFila[i];
            int colDestino = colCab + movimientosCol[i];
            if (filaDestino == filaRey && colDestino == colRey) {
                return true;
            }
        }
        return false;
    }
}
