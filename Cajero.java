//Nota: Mi siguiente proyecto sera hacerlo con una interfaz grafica, por ahora en terminal :)

// Importamos la libreria Scanner que nos va a ayudar
// a introducir datos desde nuestro teclado
import java.util.Scanner;

// Nota: Para acceder al sistema primero debes registrarte.
// Cuando te registres se te asignara dinero automaticamente por un valor de $1'000.000

public class Cajero {
    // Declaramos las variables que vamos a usar durante la ejecucion del algoritmo
    static int seleccionUsuarioIniciar = 0;
    
    static int dineroCuenta = 0;
    static int dineroDisponiblePrestamo = 500000;
    static int dineroRetiroUsuario;
    static int dineroARetirar = 0;
    static int confirmarRetiro = 0;
    static int dineroARetirarPrestamo = 0;
    static int confirmarRetiroPrestamo = 0;
    static int dineroActualizado;
    static int tipoCuentaSeleccionada = 0;
    static int dineroDepositado = 0;
    static int operacionSeleccionada = 0;
// ------------------------ Log in usuarios ------------------------    
    static String nombreUsuario = "";
    static String contraseña = "";
    static boolean ingreso = false;
    
    static String usuarioRegistrado = "";
    static String contraseñaRegistrada = "";
    static boolean seRegistroUnUsuario = false;
    
    static String usuarioCreado = "";
    static String contraseñaCreada = "";
    static String confirmarContraseñaCreada = "";
 
    public static void main (String[] args) {
        // Se crea un bucle/loop para que el sistema se ejecute continuamente
        while (true) {
            
            // El metodo inicioPrograma() nos abre una interfaz en la terminal
            do {
                inicioPrograma();
                // Si se cumple que hay un usuario registrado continuamos con el siguiente menu
                if (seRegistroUnUsuario == true) {
                    // Verificacion de coincidencia de datos
                    if (nombreUsuario.equalsIgnoreCase(usuarioRegistrado) && contraseña.equalsIgnoreCase(contraseñaRegistrada)) {
                        System.out.println(">>>>>>>> Bienvenido " + nombreUsuario + "<<<<<<<<<<<<<");
                        ingreso = true;
                        
                    } else {
                        System.out.println("Usuario o Contraseña Incorrectos!");
                        System.out.println("       ");
                    }
                }
                
            } while(ingreso == false);   

            // Inicio de operaciones a realizar en el "Cajero"
            while(ingreso == true) {
                System.out.println("¿Que operacion vas a realizar?");
                System.out.println("1. Retirar");
                System.out.println("2. Depositar");
                System.out.println("0. Salir");
                
                Scanner operacionInicial = new Scanner(System.in);
                operacionSeleccionada = operacionInicial.nextInt();

                switch (operacionSeleccionada) {
                    case 1:
                        retirar();
                        break;
                    case 2:
                        depositar();
                        break;
                    case 0:
                        System.out.println("Transaccion Cancelada!");
                        System.out.println("Gracias por usar nuestros servicios!");
                        System.exit(0);
                    default:
                        System.out.println("Eleccion Incorecta, Intentalo Nuevamente!");
                        inicioPrograma();
                        break;
                }
            }
        }
    }
// ------------------------------------------------------- Funciones ----------------------------------------------
    // Inicio de nuestro programa
    public static void inicioPrograma() {
        if (seRegistroUnUsuario == true) {
            System.out.println("|------------- Bienvenido a Banco Colombia Services ------------|");
            System.out.println("1. Iniciar Sesion");
            System.out.println("0. Salir");
            
            Scanner inicioPrograma = new Scanner(System.in);
            seleccionUsuarioIniciar = inicioPrograma.nextInt();
        
            seleccionDelUsuarioAlIniciar();
            
        } else {
            System.out.println("|------------- Bienvenido a Banco Colombia Services ------------|");
            System.out.println("1. Iniciar Sesion");
            System.out.println("2. Registrarse");
            System.out.println("0. Salir");

            Scanner inicioPrograma = new Scanner(System.in);
            seleccionUsuarioIniciar = inicioPrograma.nextInt();

            seleccionDelUsuarioAlIniciar();
        }
    }
    
    // Verificacion de lo que selecciono el usuario
    public static void seleccionDelUsuarioAlIniciar() {
        
        if (seRegistroUnUsuario == true) {
            switch (seleccionUsuarioIniciar) {
                case 0:
                    System.out.println("Transaccion Cancelada!");
                    System.out.println("Gracias por usar nuestros servicios!");
                    System.out.println("       ");
                    System.exit(0);
                    break;
                    
                case 1:
                    System.out.print("Introduce tu nombre de usuario: ");
                    Scanner entradaUsuario = new Scanner(System.in);      
                    nombreUsuario = entradaUsuario.nextLine();

                    System.out.print("Introduce tu contraseña: ");
                    Scanner entradaContraseña = new Scanner(System.in);
                    contraseña = entradaContraseña.nextLine();
                    System.out.println("       ");
                    break;
                    
                default:
                    System.out.println("¡Eleccion Incorrecta, intentalo nuevamente!");
                    System.out.println("       ");
                    break;
            }
            
        } else {
            switch (seleccionUsuarioIniciar) {
                case 0:
                    System.out.println("Transaccion Cancelada!");
                    System.out.println("Gracias por usar nuestros servicios!");
                    System.out.println("       ");
                    System.exit(0);
                    break;

                case 1:
                    System.out.print("Introduce tu nombre de usuario: ");
                    Scanner entradaUsuario = new Scanner(System.in);      
                    nombreUsuario = entradaUsuario.nextLine();

                    System.out.print("Introduce tu contraseña: ");
                    Scanner entradaContraseña = new Scanner(System.in);
                    contraseña = entradaContraseña.nextLine();
                    System.out.println("¡ESTE USUARIO NO EXISTE!");
                    System.out.println("       ");
                    break;

                case 2:
                    nuevoUsuario();
                    break;

                default:
                    System.out.println("¡Eleccion Incorrecta, intentalo nuevamente!");
                    break;
            }
        }
    }
    
    // Registro de un nuevo usuario
    public static void nuevoUsuario() {
        // ----------------------Creacion de nuevo Usuario --------------------
        System.out.print("Crea un nombre de usuario: ");
        
        Scanner crearUsuario = new Scanner(System.in);
        usuarioCreado = crearUsuario.nextLine();

        System.out.print("Crea una contraseña: ");
        
        Scanner crearContraseña = new Scanner(System.in);
        contraseñaCreada = crearContraseña.nextLine();

        System.out.print("Confirma tu contraseña: ");
        
        Scanner confirmacionContraseña = new Scanner(System.in);
        confirmarContraseñaCreada = confirmacionContraseña.nextLine();
        
        // --------------------------------- Verificacion del usuario creado ---------------------------
        if (contraseñaCreada.equals(confirmarContraseñaCreada)) {
            
            dineroCuenta = 1000000;
            usuarioRegistrado = usuarioCreado;
            contraseñaRegistrada = contraseñaCreada;
            
            System.out.println(">>>>>>>>>>>>>>>>>>USUARIO CREADO CON EXITO<<<<<<<<<<<<<<<<<<");
            System.out.println("       ");
            seRegistroUnUsuario = true;
            inicioPrograma();
                
        } else {
            System.out.println("¡LAS CONTRASEÑAS NO COINCIDEN!");
            System.out.println("       ");
            inicioPrograma();
        }
    }
    
    // Funcion para la opcion de retirar dinero
    public static void retirar() {
        switch (operacionSeleccionada) {
            case 1:
                System.out.println("1. Cuenta de Ahorros");
                System.out.println("2. Solicitar Prestamo");

                Scanner eleccionCuenta = new Scanner(System.in);
                tipoCuentaSeleccionada = eleccionCuenta.nextInt();
                
                if (tipoCuentaSeleccionada == 1) {
                    retiroNormal();
                    
                } else if (tipoCuentaSeleccionada == 2) {
                    prestamo();
                }
                break;

            case 2:
                System.out.println("¡Recuerda que con tu banco tu dinero se multiplica!");
                System.out.println("¿Cuanto Dinero Vas A Depositar? Escribe la cifra");
                Scanner dineroDepositar = new Scanner(System.in);
                dineroDepositado = dineroDepositar.nextInt();
                System.out.println("Confirmas depositar: $" + dineroDepositado + " pesos");
                System.out.println("1. Si");
                System.out.println("2. No");
                Scanner confirmarDepositoDinero = new Scanner(System.in);
                int ConfirmacionDeposito = confirmarDepositoDinero.nextInt();

                if (ConfirmacionDeposito == 1) {
                    dineroCuenta = dineroCuenta + dineroDepositado;
                    System.out.println("Haz depositado: " + dineroDepositado + " pesos");
                    System.out.println("Dinero Disponible: $" + dineroCuenta);
                    System.out.println("Gracias por usar nuestros servicios!");
                    System.out.println("       ");
                    break;

                } else {
                    System.out.println("Transaccion Cancelada!");
                    System.out.println("Gracias por usar nuestros servicios!");
                    System.out.println("       ");
                    break;
                }

            case 0:
                System.out.println("Transaccion Cancelada!");
                System.out.println("Gracias por usar nuestros servicios!");
                System.out.println("       ");
                System.exit(0);

            default:
                break;
        }
    }
    
    // Nota: Existe retiro normal de cuenta de ahorros o un retiro por prestamo de dinero
    // Esta funcion es la de retiro normal
    public static void retiroNormal() {
        System.out.println("¿Cuanto dinero quieres retirar?");
        System.out.println("1. $20.000");
        System.out.println("2. $50.000");
        System.out.println("3. $100.000");
        System.out.println("4. $200.000");
        System.out.println("5. $1'000.000");

        Scanner entradaDos = new Scanner(System.in);
        dineroARetirar = entradaDos.nextInt();
        
        switch (dineroARetirar) {
            case 1:
                dineroRetiroUsuario = 20000;
                System.out.println("Estas seguro de retirar $20.000?");
                System.out.println("1. Si");
                System.out.println("2. No");
                Scanner entradaTres = new Scanner(System.in);
                confirmarRetiro = entradaTres.nextInt();
                break;

            case 2:
                dineroRetiroUsuario = 50000;
                System.out.println("Estas seguro de retirar $50.000?");
                System.out.println("1. Si");
                System.out.println("2. No");
                Scanner entradaCuatro = new Scanner(System.in);
                confirmarRetiro = entradaCuatro.nextInt();
                break;

            case 3:
                dineroRetiroUsuario = 100000;
                System.out.println("Estas seguro de retirar $100.000?");
                System.out.println("1. Si");
                System.out.println("2. No");
                Scanner entradaCinco = new Scanner(System.in);
                confirmarRetiro = entradaCinco.nextInt();
                break;

            case 4:
                dineroRetiroUsuario = 200000;
                System.out.println("Estas seguro de retirar $200.000?");
                System.out.println("1. Si");
                System.out.println("2. No");
                Scanner entradaSeis = new Scanner(System.in);
                confirmarRetiro = entradaSeis.nextInt();
                break;

            case 5:
                dineroRetiroUsuario = 1000000;
                System.out.println("Estas seguro de retirar $1'000.000?");
                System.out.println("1. Si");
                System.out.println("2. No");
                Scanner entradaSiete = new Scanner(System.in);
                confirmarRetiro = entradaSiete.nextInt();
                break;
        }

        if (confirmarRetiro == 1) {
            if (dineroRetiroUsuario <= dineroCuenta) {
                System.out.println("Haz retirado: $" + dineroRetiroUsuario);
                dineroActualizado = dineroCuenta - dineroRetiroUsuario;
                System.out.println("Dinero Disponible: $" + dineroActualizado);
                System.out.println("Gracias por usar nuestros servicios!");
                System.out.println("       ");

            } else {
                System.out.println("No cuentas con los fondos suficientes para realizar esta transaccion");
                System.out.println("       ");
            }

        } else if (confirmarRetiro == 2) {
            System.out.println("Transaccion Cancelada!");
            System.out.println("Gracias por usar nuestros servicios!");
            System.out.println("       ");
        }
                
    }
    
    // Retiro de dinero por prestamo
    public static void prestamo() {
            System.out.println("Hola " + nombreUsuario + " tienes aprobado un prestamo de $500.000");
            System.out.print("¿Cuanto dinero quieres solicitar?: ");

            Scanner dineroPrestamo = new Scanner(System.in);
            dineroARetirarPrestamo = dineroPrestamo.nextInt();

            if (dineroARetirarPrestamo <= 500000) {
            System.out.println("Estas seguro de solicitar un prestamo de $" + dineroARetirarPrestamo + " Pesos");
            System.out.println("1. Si");
            System.out.println("2. No");

            Scanner retiroPrestamo = new Scanner(System.in);
            confirmarRetiroPrestamo = retiroPrestamo.nextInt();

            System.out.print("Confirma tu contraseña: ");
            Scanner confirmarContraseñaPrestamo = new Scanner(System.in);
            String contraseñaPrestamo = confirmarContraseñaPrestamo.nextLine();

            if (contraseñaPrestamo.equals(contraseñaRegistrada)) {
                switch (confirmarRetiroPrestamo) {
                    case 1:
                        dineroDisponiblePrestamo -= dineroARetirarPrestamo;
                        dineroCuenta += dineroARetirarPrestamo;
                        System.out.println("SOLICITUD DE PRESTAMO EXITOSA!");
                        System.out.println("TU PRESTAMO HA SIDO DESEMBOLSADO EN TU CUENTA DE AHORROS!");
                        System.out.println("       ");
                        System.out.println("Dinero Disponible: $" + dineroCuenta);
                        System.out.println("Gracias por usar nuestros servicios!");
                        System.out.println("       ");
                        break;

                    case 2:
                        System.out.println();
                        System.out.println("Transaccion Cancelada!");
                        System.out.println("Gracias por usar nuestros servicios!");
                        System.out.println("       ");
                        break;

                    default: 
                        System.out.println();
                        System.out.println("¡Eleccion Incorrecta, intentalo nuevamente!");
                        System.out.println("       ");
                        break;
                } 
            }

        } else {
            System.out.println("EL CUPO DE TU TARJETA NO PERMITE SOLICITAR ESTE MONTO DE DINERO!");
            System.out.println("       ");
        }           
    }
    
    // Opcion de depositar dinero a tu cuenta
    public static void depositar() {
        System.out.println("Bienevenido nuevamente " + usuarioCreado);
        System.out.println("¡Vas a depositar a tu cuenta!");
        System.out.println("¿Cuanto dinero vas a depositar?");
        
        Scanner deposito = new Scanner(System.in);
        int dineroADepositar = deposito.nextInt();
        
        if (dineroADepositar >= 5000) {
            System.out.println("¿ Estas seguro de depositar $" + dineroADepositar + " pesos?");
            System.out.println("1. Si");
            System.out.println("2. No");
            
            Scanner confirmacionDeposito = new Scanner(System.in);
            int confirmarDeposito = deposito.nextInt();
            
            if (confirmarDeposito == 1) {
                System.out.println("Haz depositado $" + dineroADepositar);
                dineroActualizado = dineroCuenta + dineroADepositar;
                System.out.println("Dinero Disponible: $" + dineroActualizado);
                System.out.println("Gracias por usar nuestros servicios!");
                System.out.println("       ");
                
            } else if (confirmarDeposito == 2) {
                System.out.println("Gracias por usar nuestros servicios!");
                System.out.println("       ");
                inicioPrograma();
            }
            
        } else {
            System.out.println("Debes depositar una cantidad mayor a $5.000 pesos");
            depositar();
        }
    }
}
