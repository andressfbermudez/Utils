import java.util.InputMismatchException;
import java.util.Scanner;

public class OptionsMenu {
    private static int inUser = 0;

    private static Scanner sc = new Scanner(System.in);

    public static void mainMenu() {
        int counter = 0;

        try {
            do {
                System.out.println();
                System.out.println(":: Main Menu ::");
                System.out.println(" 1. Insert object");
                System.out.println(" 2. Delete object");
                System.out.println(" 3. Is the stack empty?");
                System.out.println(" 4. What was the last object to enter");
                System.out.println(" 5. How many objects does the stack have");
                System.out.println(" 6. Clean stack");
                System.out.println(" 7. Print stack");
                System.out.println(" 0. Exit");
                System.out.print("Your option: ");

                inUser = sc.nextInt();
                System.out.println();

                switch (inUser) {
                    case 1:
                        Methods.insertObject();
                        break;
                    case 2:
                        Methods.deleteObject();
                        break;
                    case 3:
                        Methods.verififyContent();
                        break;
                    case 4:
                        Methods.lastObject();
                        break;
                    case 5:
                        Methods.sizeStack();
                        break;
                    case 6:
                        Methods.clear();
                        break;
                    case 7:
                        Methods.printStack();
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
            } while (counter == 0);

        } catch (InputMismatchException e) {
            System.out.println("Option not available");
        }
    }
}
