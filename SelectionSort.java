public class SelectionSort {

    public static void main(String[] args) {
        int[] numbers = {9, 5, 6, 2, 4, 1, 8, 7, 3};
        selectionSort(numbers);
    }

    // Algoritmo de ordenamiento de selection sort. Complejidad temporal de O(n^2)
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) { // Iterar el array completo

            boolean changes = false; // Para registrar cambios en el ordenamiento
            System.out.println(Arrays.toString(array)); // Para monitorear el comportamiento

            for (int j = 0; j < array.length - i - 1; j++) { // Iterar el subarray desordenado
                int pointer = array[j]; // Puntero que indica el inicio del subarray desordenado

                // Posicionar el menor elemento encontrado al inicio del subarray desordenado
                if (array[j + 1] < pointer) {
                    array[j] = array[j + 1];
                    array[j + 1] = pointer;
                    changes = true;
                }
            }

            if (!changes) { // Si no existen cambios en una iteracion completa quiere decir que ya esta ordenado
                break;
            }
        }
    }
