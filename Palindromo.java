public class Palindromo {
    public static void main(String[] args) {
        // Cadena de texto que sera invertida
        String oldString = "anitalavalatina";

        // Convertirla en un arreglo de caracteres
        char[] array = oldString.toCharArray();

        // Cadena invertida
        StringBuilder newString = new StringBuilder();

        // Recorrer el arreglo de caracteres
        for (int i = array.length - 1; i >= 0; i--) {
            // Agregar a la nueva cadena desde el ultimo caracter hasta el primero
            newString.append(array[i]);
        }

        // Imprimir las cadenas
        System.out.println(oldString);
        System.out.println(newString);

        // verificar si es palindromo
        if (oldString.contentEquals(newString)) {
            System.out.println("\nSi es palindromo");
        } else {
            System.out.println("\nNo es palindromo");
        }
    }
}

