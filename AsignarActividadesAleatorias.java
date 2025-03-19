import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
/*
 * Author:  Andres Bermudez
 * Date: 2025
*/
public class AsignarActividadesAleatorias {
    public static void main(String[] args) {

        // Temas y estudiantes disponibles
        List<String> students = List.of("Andres Bermudez",
                                        "Andres Buelvas",
                                        "Diego Giraldo",
                                        "Kheslly Rosado",
                                        "Juan Zamora");

        List<String> issues = List.of("Regla del trapecio",
                                      "Sistema de ecuaciones lineales de 2x2",
                                      "Teorema fundamental del calculo",
                                      "Regla del punto medio",
                                      "Funciones definidas a trozos");

        // Generar 5 numeros aleatorios del 0 al 4, que corresponderan a los indices
        // de la lista de los 5 temas asignados de forma aleatoria
        List<Integer> randomNumbers = new ArrayList<>();

        // Llenar la lista con la cantidad de temas disponibles
        for (int i = 0; i < issues.size(); i++) {
            randomNumbers.add(i); // Agrega los numeros de forma ordenada(0, 1, 2 ...)
        }
        // Mezclar los números
        Collections.shuffle(randomNumbers);

        // Asignar una actividad a cada estudiante de forma aleatoria
        System.out.println("\nTareas asignadas de forma aleatoria:\n");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i) + ": " + issues.get(randomNumbers.get(i)));
        }
    }
}
