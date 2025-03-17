public class MergeSort {

    public static void main(String[] args) {
        int[] array = {8, 6, 4, 2, 9, 1, 7, 3, 5};
        System.out.println("\nArreglo original: " + Arrays.toString(array) + "\n");

        array = mergeSort(array);
        System.out.println("\nArreglo ordenado: " + Arrays.toString(array));
    }

    public static int[] mergeSort(int[] array) {
        System.out.println(Arrays.toString(array));
        // Dividir el arreglo hasta que sea un arreglo de 1 elemento
        if (array.length > 1) {
            int medium = array.length / 2; // Calcular el medio del arreglo

            // Dividir el arreglo a la mitad
            int[] left = Arrays.copyOfRange(array, 0, medium);
            int[] right = Arrays.copyOfRange(array, medium, array.length);

            // Dividir el arreglo en subarreglos hasta que tengan longitud de 1
            System.out.println("\nDividiendo la mitad izquierda en subarreglos");
            mergeSort(left);

            System.out.println("\nDividiendo la mitad derecha en subarreglos");
            mergeSort(right);

            // Punteros que recorreran las sublistas
            int i = 0;
            int j = 0;

            // Puntero que creara la lista ordenada
            int k = 0;

            // Comparar los primeros elementos de la lista izquierda
            // con los primeros elementos de la  lista derecha
            while (i < left.length && j < right.length) {
                System.out.println("\nComparando el (" + left[i] + ") con (" + right[j] + ") para saber cual es menor");
                if (left[i] < right[j]) {
                    array[k] = left[i];
                    i++;
                } else {
                    array[k] = right[j];
                    j++;
                }
                k++;
            }

            // Unir las sublistas ordenadas
            while (i < left.length) {
                array[k] = left[i];
                i++;
                k++;
                System.out.println("\nSubarreglo ordenado: " + Arrays.toString(array));
            }
            while (j < right.length) {
                array[k] = right[j];
                j++;
                k++;
                System.out.println("\nSubarreglo ordenado: " + Arrays.toString(array));
            }
            return array;
        }
        return null;
    }
}
