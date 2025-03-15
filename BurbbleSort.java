import java.util.Arrays;

public class BurbbleSort {

    public static void main(String[] args) {
        int[] numbers = {9, 5, 6, 2, 4, 1, 8, 7, 3};
        bubbleSort(numbers);
    }

    // Algoritmo de ordenamiento de burbuja. Complejidad temporal de O(n^2)
    public static void bubbleSort(int[] array) {
        int longitudArray = array.length; // Obtener la longitud del arreglo

        for (int i = 0; i < array.length; i++) { // Bucle que itera el array

            boolean changes = false; // Para registrar si hay modificaciones en el array
            System.out.println(Arrays.toString(array)); // Para monitorear los cambios

            // Este bucle itera sobre el arreglo y va realizando los cambios necesarios
            for (int j = 0; j < (longitudArray - i - 1); j++) {
                if (array[j] > array[j + 1]) { // Para intercambiar las posiciones
                    int temp = array[j]; // Variable temporal que almacena la posicion del primer elemento a ordenar
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    changes = true; // Registrar los cambios
                }
            }

            // Si no hay cambios durante una ietracion completa del array quiere decir que ya esta ordenado
            if (!changes) {
                break;
            }
        }
    }
}
