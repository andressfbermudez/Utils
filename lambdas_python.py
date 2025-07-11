# Calculadora con funciones lambda

eleccionUsuario = 0
primerValor = 0
segundoValor = 0
resultado = 0

menu = [":: Calculadora ::", "    1. Sumar", "    2. Restar", "    3. Multiplicar", "    4. Dividir", "    0. Salir"]

# Funciones lambda con las operaciones matematicas
sumar = lambda primerValor, segundoValor : primerValor + segundoValor
restar = lambda primerValor, segundoValor : primerValor - segundoValor
multiplicar = lambda primerValor, segundoValor : primerValor * segundoValor
dividir = lambda primerValor, segundoValor : primerValor / segundoValor

# Tomar datos del usuario
def tomarDatos():
    global primerValor, segundoValor, eleccionUsuario
    #Verificacion del tipo de dato que ingresa el usuario y manejo de errores
    try:
        primerValor = int(input("Ingresa el primer valor: "))
        segundoValor = int(input("Ingresa el segundo valor: "))
    except ValueError:
        print("¡Recuerda ingresar unicamente datos numericos!")
        exit()

    if eleccionUsuario == 4 and segundoValor == 0:
        print("¡No es posible dividir entre 0!")
        exit()

# Verificacion de la entrada del usuario y ejecucion de las operaciones
def ejecutarOperaciones():
    tomarDatos()
    global primerValor, segundoValor

    if eleccionUsuario == 1:
        print("Resultado:", sumar(primerValor, segundoValor))
    elif eleccionUsuario == 2:
        print("Resultado:", restar(primerValor, segundoValor))
    elif eleccionUsuario == 3:
        print("Resultado:", multiplicar(primerValor, segundoValor))
    elif eleccionUsuario == 4:
        print("Resultado:", dividir(primerValor, segundoValor))

# Menu interactivo de bienvenida
def menuFunction():
    while True:
        for i in menu:
            print(i)

        global eleccionUsuario 
        #Verificacion del tipo de dato que ingresa el usuario y manejo de errores
        try:
            eleccionUsuario = int(input("Tu eleccion: "))
        except ValueError:
            print("¡Recuerda ingresar unicamente datos numericos!")
            exit()

        if eleccionUsuario == 0:
            print("¡Gracias por usar Calculadora!")
            exit()

        ejecutarOperaciones()

menuFunction()
    

