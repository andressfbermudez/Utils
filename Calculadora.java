//Importamos la clase Scanner que usaremos mas adelante para tomar las entradas del usuario
import java.util.Scanner;

public class Calculadora {
    
    // Definimos las variables que vamos a utilizar a lo largo del algoritmo
    static double a;
    static double b;
    static int entradaUsuario;
    static double resultado;
    static String operacionSeleccionada;

    public static void main(String[] args) {
        
        //Despliegue de menu para darle una pequeña interfaz al programa
        do {
            System.out.println("Selecciona la operacion que quieres realizar");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Dividir");
            System.out.println("4. Multiplicar");
            System.out.println("0. Salir");
            
            //Insertamos un objeto Scanner que nos permite tomar una entrada del usuario
            Scanner sc = new Scanner(System.in);
            entradaUsuario = sc.nextInt();

            //Evaluamos los casos de acuerdo a nuestra eleccion
            switch(entradaUsuario) {
                case 0:
                    System.out.println("Gracias por usar Calculadora");
                    salir();
                    break;
                case 1:
                    operacionSeleccionada = "Sumar";
                    System.out.println("Seleccionaste: " + operacionSeleccionada);
                    ingresoValores();
                    sumar();
                    break;
                case 2:
                    operacionSeleccionada = "Restar";
                    System.out.println("Seleccionaste: " + operacionSeleccionada);
                    ingresoValores();
                    restar();
                    break;
                case 3:
                    operacionSeleccionada = "Division";
                    System.out.println("Seleccionaste: " + operacionSeleccionada);
                    ingresoValores();
                    dividir();
                    break;
                case 4:
                    operacionSeleccionada = "Multiplicacion";
                    System.out.println("Seleccionaste: " + operacionSeleccionada);
                    ingresoValores();
                    multiplicar();
                    break;
            }
        } while (entradaUsuario != 0);
    }

    //Funciones que nos ejecutan las operaciones a realizar
    public static void ingresoValores() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primer valor: ");
        a = sc.nextInt();

        Scanner scn = new Scanner(System.in);
        System.out.println("Ingresa el segundo valor: ");
        b = scn.nextInt();
    }

    public static void salir() {
        entradaUsuario = 0;
    }

    public static void sumar() {
        resultado = a + b;
        System.out.println("El resultado es: " + resultado);
        entradaUsuario = 1;
    }

    public static void restar() {
        resultado = a - b;
        System.out.println("El resultado es: " + resultado);
        entradaUsuario = 2;
    }

    public static void dividir() {
        //No es posible dividir por 0, entonces nos protegemos del error usando las siguientes lineas
        if (b == 0) {
            System.out.println("No se puede dividir entre Cero(0)");
            entradaUsuario = 3;
        } else {
            resultado = a / b;
            System.out.println("El resultado es: " + resultado);
            entradaUsuario = 3;
        }
    }

    public static void multiplicar() {
        resultado = a * b;
        System.out.println("El resultado es: " + resultado);
        entradaUsuario = 4;
    }
}

