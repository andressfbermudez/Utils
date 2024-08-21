/*
 * Una caracterı́stica fundamental de la multiplicación
 * entre matrices es que sólo es posible realizarla
 * cuando el número de columnas de A es igual al número de filas de B
*/

public class Main {
    public static void main(String[] args) {

        // Declaracion de la matriz uno
        int[][] matrizUno = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Declaracion de la matriz dos
        int[][] matrizDos = {
                {9, 8},
                {6, 5},
                {3, 2},
        };

        // Declaracion de la matriz resultado
        int [][] matrizResultado = new int[matrizUno.length][matrizDos[0].length];

        // Recorrido de las filas de la matriz uno
        for(int i = 0; i < matrizUno.length; i ++) {

            //Recorrido de las columnas de la matriz dos
            for(int j = 0; j < matrizDos[i].length; j++) {

                // Columnas de matrizUno y filas de matrizDos
                for(int k = 0; k < matrizUno[0].length; k++) {
                    matrizResultado[i][j] += matrizUno[i][k] * matrizDos[k][j];
                }
            }
        }

        // Imprimir en pantalla la matriz resultado
        System.out.println("Matriz Resultado:");
        for(int i = 0; i < matrizResultado.length; i++) {
            for(int j = 0; j < matrizResultado[i].length; j++) {
                System.out.print(matrizResultado[i][j] + ", ");
            }
            System.out.println();
        }
    }
}

/*
 * Matriz Resultado:
 * 
 *     30,  24, 
 *     84,  69, 
 *    138, 114,
*/
