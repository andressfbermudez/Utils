public abstract class Perro implements SerVivo {
    // Atributos
    protected String nombre;
    protected String raza;
    protected String color;
    protected int edad;
    protected int peso;
    protected int altura;
    protected int esperanzaVida;

    // Constructor
    public Perro() {
    }
    // Metodos de la interfaz SerVivo().
    @Override
    public void comer() {
        System.out.println("El perro esta comiendo.");
    }

    @Override
    public void dormir() {
        System.out.println("El perro esta durmiendo: Zzzz");
    }

    @Override
    public void jugar() {
        System.out.println("El perro esta jugando.");
    }

    // Metodo Abstracto
    public abstract void ladrar();

    // Sobreescritura del metodo toString(), para obtener una representacion de nuestro objeto.
    @Override
    public String toString() {
        return  "Nombre: " + nombre + "\n" +
                "Raza: " + raza + "\n" +
                "Color: " + color + "\n" +
                "Edad: " + edad + " año(s)" + "\n" +
                "Peso: " + peso + " Kg" + "\n" +
                "Altura: " + altura + " Cm" + "\n" +
                "Esperanza de vida: " + esperanzaVida + " año(s)";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getEsperanzaVida() {
        return esperanzaVida;
    }

    public void setEsperanzaVida(int esperanzaVida) {
        this.esperanzaVida = esperanzaVida;
    }
}
