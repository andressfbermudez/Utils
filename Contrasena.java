import java.util.Scanner;

public class Contrasena {

    private final String[] letrasMayusculas = {
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
            "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
    };

    private final String[] letrasMinusculas = {
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
            "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
    };

    private final String[] numeros = {
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
    };

    private final String[] caracteresEspeciales = {
            "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "=", "+",
            "[", "]", "{", "}", "|", ";", ":", "'", "\"", ",", ".", "<", ">", "/",
            "?", "`", "~", "¬"
    };

    private static int counter = 0;
    private boolean longitudContrasena = false;
    private boolean contieneLetrasMinusculas = false;
    private boolean contieneLetrasMayusculas = false;
    private boolean contieneNumeros = false;
    private boolean contieneCaracteresEspeciales = false;

    public static void main(String[] args) {
        Contrasena obj = new Contrasena();
        while (!obj.longitudContrasena || !obj.contieneLetrasMinusculas || !obj.contieneLetrasMayusculas ||
                !obj.contieneNumeros || !obj.contieneCaracteresEspeciales) {
            obj.ingresoDatos();
            counter++;
        }
    }

    public void ingresoDatos() {
        Scanner sc  = new Scanner(System.in);
        if (counter == 0) {
            String menu = """
                    ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
                    Debes superar los 5 filtros para que tu contraseña se considere segura:
                        1. Debe tener una longitud mayor o igual a 10 caracteres
                        2. Debe contener al menos una letra en minuscula.
                        3. Debe contener al menos una letra en mayuscula.
                        4. Debe contener al menos un numero.
                        5. Debe contener al menos un caracter especial.""";
            System.out.println(menu);
        }
        System.out.print("\nIngresa una contraseña: ");
        String contrasena = sc.nextLine();
        System.out.println();

        verificarContrasena(contrasena);
    }

    public void verificarContrasena(String contrasena) {
        if (contrasena.length() >= 10) {
            longitudContrasena = true;
        }
        for (String i : letrasMinusculas) {
            if (contrasena.contains(i)) {
                contieneLetrasMinusculas = true;
                break;
            }
        }
        for (String i : letrasMayusculas) {
            if (contrasena.contains(i)) {
                contieneLetrasMayusculas = true;
                break;
            }
        }
        for (String i : numeros) {
            if (contrasena.contains(i)) {
                contieneNumeros = true;
                break;
            }
        }
        for (String i : caracteresEspeciales) {
            if (contrasena.contains(i)) {
                contieneCaracteresEspeciales = true;
                break;
            }
        }
        caracteristicasContrasena();
        System.out.println();
        System.out.println("::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Conclusion:");

        if (longitudContrasena && contieneLetrasMinusculas && contieneLetrasMayusculas && contieneNumeros
                && contieneCaracteresEspeciales) {
            System.out.println("+++++ TU CONTRASEÑA ES SEGURA +++++");
        } else {
            System.out.println("***** La contraseña NO es segura *****");
        }
        System.out.println("::::::::::::::::::::::::::::::::::::::::::");
    }

    private void caracteristicasContrasena() {
        System.out.println("Caracteristicas de tu contraseña:");
        if (longitudContrasena) {
            System.out.println("    SI tiene un tamaño adecuado.");
        } else {
            System.out.println("    NO tiene un tamaño adecuado.");
        }

        if (contieneLetrasMinusculas) {
            System.out.println("    SI contiene letras minusculas.");
        } else {
            System.out.println("    NO contiene al menos una letra minuscula.");
        }

        if (contieneLetrasMayusculas) {
            System.out.println("    SI contiene letras mayusculas.");
        } else {
            System.out.println("    NO contiene al menos una letra mayuscula.");
        }

        if (contieneNumeros) {
            System.out.println("    SI contiene numeros.");
        } else {
            System.out.println("    NO contiene al menos un numero.");
        }

        if (contieneCaracteresEspeciales) {
            System.out.println("    SI contiene caracteres especiales.");
        } else {
            System.out.println("    NO contiene al menos un caracter especial.");
        }
    }
}
