import java.util.Scanner;

public class Menu {
    private static double base = 0;
    private static double altura = 0;

    private static Scanner sc = new Scanner(System.in);

    public static void menu() {
        System.out.println();
        System.out.println("Calcular el area de:");
        System.out.println("1. Triangulo");
        System.out.println("2. Cuadrilatero");
        System.out.print("Ingresa tu opcion: ");

        int entradaUsuario = sc.nextInt();
        System.out.println();
        tomarDatos();

        switch (entradaUsuario) {
            case 1:
                System.out.println("Area triangulo: " + new Triangulo(base, altura).areaPoligono());
                break;
            case 2:
                System.out.println("Area cuadrilatero: " + new Cuadrilatero(base, altura).areaPoligono());
                break;
            default:
                System.out.println("¡Opcion no disponible!");
        }
    }

    private static void tomarDatos() {
        System.out.print("Ingresa la base del poligono: ");
        base = sc.nextDouble();

        System.out.print("Ingresa la altura del poligono: ");
        altura = sc.nextDouble();

        System.out.println();
    }
}
