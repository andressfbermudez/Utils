# Calculadora
# Repasando Python para Scripting

eleccionUsuario = 0
primerValor = 0
segundoValor = 0
resultado = 0

# Funciones de las operaciones matematicas
def sumar():
    resultado = primerValor + segundoValor
    print("Resultado:", resultado)

def restar():
    resultado = primerValor - segundoValor
    print("Resultado:", resultado)

def multiplicar():
    resultado = primerValor * segundoValor
    print("Resultado:", resultado)

def dividir():
    # Verificacion de division entre 0 para evitar errores
    if segundoValor == 0:
        print("¡No es posible dividir entre 0!")
    else:
        resultado = primerValor / segundoValor
        print("Resultado:", float(resultado))

# Tomar datos del usuario
def tomarDatos():
    global primerValor, segundoValor
    #Verificacion del tipo de dato que ingresa el usuario y manejo de errores
    try:
        primerValor = int(input("Ingresa el primer valor: "))
        segundoValor = int(input("Ingresa el segundo valor: "))
    except ValueError:
        print("¡Recuerda ingresar unicamente datos numericos!")
        exit()

# Verificacion de la entrada del usuario y ejecucion de las operaciones
def ejecutarOperaciones():
    tomarDatos()

    if eleccionUsuario == 1:
        sumar()
    elif eleccionUsuario == 2:
        restar()
    elif eleccionUsuario == 3:
        multiplicar()
    elif eleccionUsuario == 4:
        dividir()

# Menu interactivo de bienvenida
def menu():
    while True:
        print()
        print(":: Calculadora ::")
        print("     1. Sumar")
        print("     2. Restar")
        print("     3. Multiplicar")
        print("     4. Dividir")
        print("     0. Salir")

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

menu()
    


