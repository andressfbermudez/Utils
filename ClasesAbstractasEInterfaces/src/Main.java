/*
 * Ejemplo de POO aplicando conceptos fundamentales:
 *
 * Abstraccion
 * Encapsulamiento
 * Herencia
 * Polimorfismo
 *
 * Principio de modularidad, cohesion y acoplamiento.
 * Uso de interfaces y clases abstractas.
*/
public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Andres", 23);
        System.out.println(persona1);
        persona1.comer();
        persona1.vestir();
        persona1.trabajar();

        System.out.println();

        Rottweiler perro1 = new Rottweiler("Nico", "Rottweiler", "Negro con Amarillo", 1, 35, 65, 15);
        System.out.println(perro1);
        perro1.comer();
        perro1.ladrar();
        perro1.proteger();

        System.out.println();

        Chihuahua perro2 = new Chihuahua("Copito", "Chihuahua", "Blanco", 2, 1, 18, 12);
        System.out.println(perro2);
        perro2.comer();
        perro2.darAmor();
        perro2.vestir();
        perro2.ladrar();
    }
}