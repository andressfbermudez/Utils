public class Persona implements SerVivo, Vestir {

    private String nombre;
    private int edad;
    private String id;
    private String profesion;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void trabajar() {
        System.out.println("La persona esta trabajando.");
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
             "\nEdad: " + edad;
    }

    @Override
    public void comer() {
        System.out.println("La persona esta comiendo.");
    }

    @Override
    public void dormir() {
        System.out.println("La persona esta durmiendo. Zzzz.");
    }

    @Override
    public void jugar() {
        System.out.println("La persona esta jugando.");
    }

    @Override
    public void vestir() {
        System.out.println("La persona viste ropa elegante(Sombrero, Traje y Zapatos negros).");
    }
}
