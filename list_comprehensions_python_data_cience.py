lista_de_listas = [[4, 6, 5, 9],[1, 0, 7, 2],[3, 4, 1, 8]]
new_lista = [sum(fila) for fila in lista_de_listas]
print(new_lista)


lista_de_tuplas = [('Pedro', 1.74, 81), ('Júlia', 1.65, 67), ('Otávio', 1.81, 83)]
lista_tercer_elemento = [tercer_elemento[2] for tercer_elemento in lista_de_tuplas]
print(lista_tercer_elemento)


lista_nombres = ['Pedro', 'Júlia', 'Otávio', 'Eduardo']
lista_posicion_nombres = [i for i in range(len(lista_nombres))]
lista_pares = list(zip(lista_posicion_nombres, lista_nombres))
print(lista_pares)


alquiler = [('Apartamento', 1700), ('Apartamento', 1400), ('Casa', 2150), ('Apartamento', 1900), ('Casa', 1100)]
valores_apartamentos = [elemento[1] for elemento in alquiler if elemento[0] == 'Apartamento']
print(valores_apartamentos)


meses = ['Jan', 'Feb', 'Mar', 'Abr', 'May', 'Jun', 'Jul', 'Ago', 'Sep', 'Oct', 'Nov', 'Dic']
gasto = [860, 490, 1010, 780, 900, 630, 590, 770, 620, 560, 840, 360]
meses_gasto = dict(zip(meses, gasto))
print(meses_gasto)


ventas = [('2023', 4093), ('2021', 4320), ('2021', 5959), ('2022', 8883), ('2023', 9859), ('2022', 5141), ('2022', 7688), ('2022', 9544), ('2023', 4794), ('2021', 7178), ('2022', 3030), ('2021', 7471), ('2022', 4226), ('2022', 8190), ('2021', 9680), ('2022', 5616)]
ventas_filtrada = [elemento[1] for elemento in ventas if elemento[0] == '2022' and elemento[1] >= 6000]
print(ventas_filtrada)


glicemia = [129, 82, 60, 97, 101, 65, 62, 167, 87, 53, 58, 92, 66, 120, 109, 62, 86, 96, 103, 88, 155, 52, 89, 73]
resultados = [
    'Hipoglicemia' if glucosa <= 70 else
    'Normal' if glucosa < 99 else
    'Aterada' if glucosa <= 125 else
    'Diabetes'
    for glucosa in glicemia
]
valores_resultados = list(zip(resultados, glicemia))
print(valores_resultados)


id = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
cantidad = [15, 12, 1, 15, 2, 11, 2, 12, 2, 4]
precio = [93.0, 102.0, 18.0, 41.0, 122.0, 14.0, 71.0, 48.0, 14.0, 144.0]
union_cantidad_precio = list(zip(cantidad, precio))
total = [cant * prec for cant, prec in union_cantidad_precio]
datos_tabla = list(zip(id, cantidad, precio, total))
encabezado_tabla = ('id', 'cantidad', 'precio', 'total')
tabla = [encabezado_tabla]
for i in datos_tabla:
    tabla.append(i)
print(tabla)


estados =['CMX', 'OAX', 'PUE', 'PUE', 'CMX', 'PUE', 'OAX', 'OAX', 'OAX', 'CMX', 'CMX', 'PUE', 'OAX', 'CMX',
           'VER', 'PUE', 'VER', 'CMX', 'PUE', 'CMX', 'OAX', 'CMX', 'PUE']
conteo = {}
for elem in estados:
    if elem in conteo:
        conteo[elem] += 1
    else:
        conteo[elem] = 1
print(conteo)


empleados = [('CMX', 16), ('OAX', 8), ('PUE', 9), ('PUE', 6), ('CMX', 10), ('PUE', 4), ('OAX',9),  ('OAX', 7),
            ('OAX', 12), ('CMX', 7), ('CMX', 11), ('PUE',8), ('OAX',8), ('CMX',9), ('VER', 13), ('PUE', 5),
            ('VER', 9), ('CMX', 12), ('PUE', 10), ('CMX', 7), ('OAX', 14), ('CMX', 10), ('PUE', 12)]
empleados_estado = {}
for estado, cantidad in empleados:
    if estado not in empleados_estado:
        empleados_estado[estado] = []
    empleados_estado[estado].append(cantidad)
empleados_estado = {estado: sum(cantidades) for estado, cantidades in empleados_estado.items()}
print(empleados_estado)
