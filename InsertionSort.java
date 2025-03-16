public class InsertionSort {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(8, 6, 4, 2, 9, 1, 7, 3, 5));
        insertionSort(list);

        list.forEach(number -> System.out.print(number + ", "));
    }

    // Algoritmo de ordenamiento por insercion. Complejidad temporal de O(n^2)
    public static void insertionSort(List<Integer> list) {
        // Recorrer la lista
        for (int i = 1; i < list.size(); i++) {
            int pointer = list.get(i); // Puntero que se va comparando

            // Para recorrer la sublista ordenada hacia atras
            for (int j = i - 1; j >= 0; j--) {
                System.out.println(i + ". " + list); // Para monitorear el comportamiento
                if (pointer < list.get(j)) {
                    // Si el valor que contiene el puntero es menor que el elemento anterior
                    // se realiza el swap(intercambio)
                    Collections.swap(list, list.indexOf(pointer), list.indexOf(list.get(j)));
                }
            }
        }
    }
}
