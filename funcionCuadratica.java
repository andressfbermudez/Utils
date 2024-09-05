import java.util.Scanner;
import java.lang.Math;

/*
 * Su tarea es escribir un programa en el lenguaje de programación
 * Java que, "dados el área y el perímetro en m2 y m, respectivamente,
 * de un terreno rectangular, calcule y reporte las longitudes del largo
 * y el ancho del terreno en m".
*/

public class Main {
    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println();
            System.out.print("Ingresa el area: ");
            double area = sc.nextDouble();

            System.out.print("Ingresa el perimetro: ");
            double perimetro = sc.nextDouble();

            System.out.println();
            double largo = resolverCuadratica(2, -perimetro, 2 * area);
            double ancho = area / largo;

            System.out.println("Largo: " + largo);
            System.out.println("Ancho: " + ancho);
        }
    }

    // Formula para resolver una ecuacion cuadratica
    public static double resolverCuadratica(double a, double b, double c) {
        double largo = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        return largo;
    }
}

