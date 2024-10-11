public class Persona implements Comparable<Persona> {

    private String nombre;
    private int edad;
    private String profesion;

    public Persona(String nombre, int edad, String profesion) {
        this.nombre = nombre;
        this.edad = edad;
        this.profesion = profesion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getProfesion() {
        return profesion;
    }

    @Override
    public int compareTo(Persona persona) {
        return this.getNombre().compareTo(persona.getNombre());
    }
}
