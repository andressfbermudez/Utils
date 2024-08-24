class CuentaBancaria:
    # Metodo constructor
    def __init__(self, nombreUsuario, id, dineroCuenta):
        self.nombreUsuario = nombreUsuario
        self.id = id
        self.cuentaActiva = True
        self.dineroCuenta = dineroCuenta

    # Metodos de la clase
    def consignarDinero(self, cantidadDinero):
        if self.cuentaActiva == True and cantidadDinero > 0:
            self.dineroCuenta += cantidadDinero
            print("¡Consignacion Exitosa!")
            print(f"Dinero actual en tu cuenta: {self.dineroCuenta}")
        else:
            print("¡Tu cuenta esta inactiva!")

    def retirarDinero(self, cantidadDinero):
        if self.cuentaActiva == True and cantidadDinero <= self.dineroCuenta:
            self.dineroCuenta -= cantidadDinero
            print("¡Retiro completado!")
            print(f"Dinero actual en tu cuenta: {self.dineroCuenta}")
        else:
            print("¡Tu cuenta esta inactiva!")

    def verDinero(self):
        if self.cuentaActiva == True:
            print(f"Tu dinero: {self.dineroCuenta}")
        else:
            print("¡Tu cuenta esta inactiva!")

    def desactivarCuenta(self):
        confirmacion = input("Escribe la palabra 'Desactivar' para confirmar la operacion: ")
        if self.cuentaActiva == True and confirmacion == "Desactivar":
            self.cuentaActiva = False
            print("¡Tu cuenta ha sido desactivada!")
        else:
            print("Esta cuenta no ha podido ser desactivada")

    def activarCuenta(self):
        confirmacion = input("Escribe la palabra 'Activar' para confirmar la operacion: ")
        if self.cuentaActiva == False and confirmacion == "Activar":
            self.cuentaActiva = True
            print("¡Tu cuenta ha sido Activada!")
        else:
            print("Esta cuenta no ha podido ser activada")

# Creacion de objetos a partir de la clase
cuentaUno = CuentaBancaria("Andres", 12345678, 150000)
cuentaUno.consignarDinero(50000)
cuentaUno.retirarDinero(20000)
cuentaUno.verDinero()
cuentaUno.desactivarCuenta()

