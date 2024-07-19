public class Chihuahua extends Perro implements Vestir {

    public Chihuahua(String nombre, String raza, String color, int edad, int peso, int altura, int esperanzaVida) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.esperanzaVida = esperanzaVida;
    }

    // Comportamiento propio de un Chihuahua
    public void darAmor() {
        System.out.println("Lame a su amo, Es un perro consentido!");
    }

    @Override
    public void ladrar() {
        System.out.println("Ladrando: Wif Wif Wif");
    }

    @Override
    public void vestir() {
        System.out.println("Vistiendo botitas y un pequeño chaleco para perro.");
    }
}
