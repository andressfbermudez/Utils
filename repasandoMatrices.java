public class Main {
    public static void main(String[] args) {
        String[][] names = {
                {"Andres", "Felipe", "Daniel"},
                {"Laura", "Cesar", "Albeiro"},
                {"Vanesa", "Andrea", "Carolina"}
        };

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.println(names[i][j]);
            }
        }
    }
}
