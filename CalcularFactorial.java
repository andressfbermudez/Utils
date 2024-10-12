public class CalcularFactorial {
    public static void main(String[] args) {
        int numero = 6;
        System.out.println("El factorial de (" + numero + ") es igual a: " + factorial(numero));
    }

    public static int factorial(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }
}
