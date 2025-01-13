public class BurbleSort {
    public static void main(String[] args) {

        int[] randomNumbers = {45, 54, 98, 21, 5, 78, 32, 7, 90, 6};

        // Algoritmo de ordenamiento de burbuja (de menor a mayor)
        for (int i = 0; i < randomNumbers.length - 1; i++) {

            for (int j = 0; j < randomNumbers.length - 1 - i; j++) {
                if (randomNumbers[j] > randomNumbers[j + 1]) {
                    int temp = randomNumbers[j];
                    randomNumbers[j] = randomNumbers[j + 1];
                    randomNumbers[j + 1] = temp;
                }
            }
        }

        // Imprimir el resultado ordenado
        System.out.println("Array ordenado de menor a mayor: ");
        for (int number : randomNumbers) {
            System.out.print(number + " ");
        }

        /*
         * Resultado:
         *
         * 5 6 7 21 32 45 54 78 90 98
        */
    }
}
