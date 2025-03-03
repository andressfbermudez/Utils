import java.util.function.*;

public class FunctionalInterfaces {

    public static void main(String[] args) {

        Function<String, Integer> stringLength = s -> s.length();
        System.out.println(stringLength.apply("Andres"));


        Predicate<Integer> numberEvaluation = number -> number >= 5;
        System.out.println(numberEvaluation.test(3));


        Consumer<String> printName = name -> System.out.println(name);
        printName.accept("Andres Felipe");


        UnaryOperator<String> unaryOperator = text -> "Hola " + text;
        System.out.println(unaryOperator.apply("Andres"));


        BiFunction<Integer, Integer, String> biFunction =
                (number1, number2) -> "Se recibieron dos enteros: " + number1 + ", " + number2;
        System.out.println(biFunction.apply(5, 6));


        BinaryOperator<String> quoteAdder = (text, quote) -> quote + text + quote;
        System.out.println(quoteAdder.apply("Hola", "\""));
    }
}
