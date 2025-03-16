import java.util.Arrays;
import java.util.List;

public class BusquedaBinaria {

    public static void main(String[] args) {
        List<Integer> lista = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9 ,10, 12, 13, 14, 15, 16);
        boolean seEncontro = busquedaBinaria(lista, 9, 0, lista.size() - 1);

        if (seEncontro) {
            System.out.println("El elemento SI esta en la lista");
            return;
        }
        System.out.println("El elemento NO esta en la lista");
    }

    // Algortimo de busqueda binaria. Complejidad temporal de O(log n)
    public static boolean busquedaBinaria(
            List<Integer> lista,
            Integer elementoBuscado,
            Integer inicio,
            Integer fin
    ) {
        // Verificar si el numero buscado esta dentro del rango esperado
        if (elementoBuscado < lista.getFirst() || elementoBuscado > lista.getLast()) {
            return false;
        }
        // Logs para monitorear como se comporta el algoritmo
        System.out.println("Buscando entre " + lista.get(inicio) + " y " + lista.get(fin));
        int centro = (inicio + fin) / 2;
        
        // Verificar si el elemento buscado esta en uno de los extremos de la lista o en el centro
        if (lista.get(inicio).equals(elementoBuscado) ||
                lista.get(fin).equals(elementoBuscado) || lista.get(centro).equals(elementoBuscado)) {
            return true;
        
        // Buscar el elemento dividiendo la lista entre 2 en cada iteracion    
        } else {
            if (elementoBuscado < lista.get(centro)) {
                return busquedaBinaria(lista, elementoBuscado, inicio, centro);
            }
            return busquedaBinaria(lista, elementoBuscado, centro, fin);
        }
    }
}
