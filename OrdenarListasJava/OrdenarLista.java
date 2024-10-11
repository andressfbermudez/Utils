import java.util.ArrayList;
import java.util.Collections;

public class OrdenarLista {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Andres", 24, "Desarrollador"));
        personas.add(new Persona("Santiago", 42, "Abogado"));
        personas.add(new Persona("Natalia", 19, "Estudiante"));
        personas.add(new Persona("Jorge", 29, "Ingeniero civil"));

        //Lista sin ordenar
        for (Persona p : personas) {
            System.out.println(p.getNombre());
        }

        // Ordenamiento de la lista
        Collections.sort(personas);
        System.out.println();

        // Lista ordenada
        for (Persona p : personas) {
            System.out.println(p.getNombre());
        }
    }
}

