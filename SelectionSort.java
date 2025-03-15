public class SelectionSort {

    public static void main(String[] args) {
        int[] numbers = {9, 5, 6, 2, 4, 1, 8, 7, 3};
        selectionSort(numbers);
    }
    
    // Algoritmo de ordenamiento de selection sort. Complejidad temporal de O(n^2)
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) { // Iterar el array completo
            System.out.println(Arrays.toString(array)); // Para monitorear el comportamiento

            for (int j = i + 1; j < array.length; j++) { // Iterar el subarray desordenado
                // Posicionar el menor elemento encontrado al inicio del array
                if (array[i] > array[j]) {
                    int temp = array[i]; // Variable temporal para almacenar el valor a intercambiar
                    
                    // Intercambiar los elementos
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}

