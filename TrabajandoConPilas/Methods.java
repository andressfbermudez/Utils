import java.util.Scanner;
import java.util.Stack;

public class Methods {
    private static String inUser;
    private static Scanner sc = new Scanner(System.in);

    private static Stack<String> names = new Stack<>();

    public static void insertObject() {
        System.out.print("Enter object: ");
        inUser = sc.nextLine();

        names.add(inUser);
        System.out.println("Object added to stack");
    }

    public static void deleteObject() {
        System.out.print("Delete object: ");
        inUser = sc.nextLine();

        names.remove(inUser);
        System.out.println("Deleted Object");
    }

    public static void verififyContent() {
        if (names.isEmpty()) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("The stack is full");
        }
    }

    public static void lastObject() {
        System.out.println("The last object is: " + names.getLast());
    }

    public static void sizeStack() {
        System.out.println("The size stack is: " + names.size());
    }

    public static void clear() {
        names.clear();
        System.out.println("The stack is clean");
    }

    public static void printStack() {
        System.out.println("Stack: " + names);
    }
}
