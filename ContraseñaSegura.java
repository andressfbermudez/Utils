import java.util.Scanner;
import java.util.regex.Pattern;

public class ContraseñaSegura {

    private static final Pattern MAYUSCULAS = Pattern.compile("[A-ZÑ]");
    private static final Pattern MINUSCULAS = Pattern.compile("[a-zñ]");
    private static final Pattern NUMEROS = Pattern.compile("[0-9]");
    private static final Pattern CARACTERES_ESPECIALES = Pattern.compile("[!@#$%^&*()\\-_=+\\[\\]{}|;:'´\",.<>/?`~¬]");

    private static final String MENU = """
            \n----------------------------------------------------------------------------------------------
            Una contraseña se considera segura si su longitud es mayor o igual a 10, tiene al menos una
            letra (A-Z, a-z), tiene al menos un dígito (0-9), y tiene al menos un símbolo diferente a
            letras o dígitos. Escriba un programa que reciba como entrada una cadena y decida si esta
            corresponde a una contraseña segura.
            """;

    private boolean longitudContrasena;
    private boolean contieneLetrasMinusculas;
    private boolean contieneLetrasMayusculas;
    private boolean contieneNumeros;
    private boolean contieneCaracteresEspeciales;

    public static void main(String[] args) {
        ContraseñaSegura obj = new ContraseñaSegura();
        obj.mostrarMenu();
        while (obj.esContrasenaSegura()) {
            obj.ingresoDatos();
        }
        System.out.println("\nLA CONTRASEÑA ES SEGURA");
    }

    private void mostrarMenu() {
        System.out.println(MENU);
    }

    public void ingresoDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una contraseña: ");
        String contrasena = sc.nextLine().replace(" ", "");
        verificarContrasena(contrasena);
    }

    public void verificarContrasena(String contrasena) {
        longitudContrasena = contrasena.length() >= 10;
        contieneLetrasMinusculas = MINUSCULAS.matcher(contrasena).find();
        contieneLetrasMayusculas = MAYUSCULAS.matcher(contrasena).find();
        contieneNumeros = NUMEROS.matcher(contrasena).find();
        contieneCaracteresEspeciales = CARACTERES_ESPECIALES.matcher(contrasena).find();

        caracteristicasContrasena();
    }

    private void caracteristicasContrasena() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nTener en cuenta que la contraseña:\n");

        sb.append(longitudContrasena ? "1. SI tiene un tamaño adecuado.\n" : "1. NO tiene un tamaño adecuado.\n");
        sb.append(contieneLetrasMinusculas ? "2. SI contiene letras minusculas.\n" : "2. NO contiene al menos una letra minuscula.\n");
        sb.append(contieneLetrasMayusculas ? "3. SI contiene letras mayusculas.\n" : "3. NO contiene al menos una letra mayuscula.\n");
        sb.append(contieneNumeros ? "4. SI contiene numeros.\n" : "4. NO contiene al menos un numero.\n");
        sb.append(contieneCaracteresEspeciales ? "5. SI contiene caracteres especiales.\n" : "5. NO contiene al menos un caracter especial.\n");

        System.out.println(sb.toString());

        if (esContrasenaSegura()) {
            System.out.println("\nLA CONTRASEÑA NO ES SEGURA");
        }
        System.out.println("---------------------------------------------------");
    }

    private boolean esContrasenaSegura() {
        return !longitudContrasena || !contieneLetrasMinusculas || !contieneLetrasMayusculas || !contieneNumeros || !contieneCaracteresEspeciales;
    }
}

