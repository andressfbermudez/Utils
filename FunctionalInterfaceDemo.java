public class FunctionalInterfaceDemo {

    @FunctionalInterface
    public interface Operation {
        int sum(int a, int b);
    }

    public static void main(String[] args) {

        // Implementacion de una interfaz funcional usando Lambdas.
        Operation operation = (a, b) -> a + b;
        System.out.println(operation.sum(5, 8));


        // Implementacion de una interfaz funcional como clase anonima.
        Operation operation1 = new Operation() {
            @Override
            public int sum(int a, int b) {
                return (a + b) * 3;
            }
        };
        System.out.println(operation1.sum(5, 2));
    }
}

