# Determinar cual es el valor maximo y el valor minimo dentro
# de una coleccion de datos, sin utilizar funciones propias
# del lenguaje que realicen esta tarea.

precios_vehiculo = [1500, 2003, 800, 950, 5678, 1675, 3765, 450, 2800]

precio_mas_alto = precios_vehiculo[0]
precio_mas_bajo = precios_vehiculo[0]

contador = 0
while contador < len(precios_vehiculo):
    if precios_vehiculo[contador] > precio_mas_alto:
        precio_mas_alto = precios_vehiculo[contador]
    
    if precios_vehiculo[contador] < precio_mas_bajo:
        precio_mas_bajo = precios_vehiculo[contador]

    contador += 1

print(f'Precio mas alto: {precio_mas_alto} \nPrecio mas bajo: {precio_mas_bajo}')
