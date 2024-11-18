import math

# Politecnico Grancolombiano
# Calculo 1 - Escenario 5 - Ley de Harvesine

# Tomar los datos de las ubicaciones a calcular
nombre_ciudad1 = input('\nIngresa el nombre de la primer ciudad: ')
latitud_ciudad1 = float(input(f'Ingresa la latitud de {nombre_ciudad1}: '))
longitud_ciudad1 = float(input(f'Ingresa la longitud de {nombre_ciudad1}: '))

nombre_ciudad2 = input('\nIngresa el nombre de la segunda ciudad: ')
latitud_ciudad2 = float(input(f'Ingresa la latitud de {nombre_ciudad2}: '))
longitud_ciudad2 = float(input(f'Ingresa la longitud de {nombre_ciudad2}: '))

# Función que calcula las distancias mediante la ley de Haversine
def haversine(latitud1, longitud1, latitud2, longitud2):
    # Convertir grados a radianes
    latitud1, longitud1, latitud2, longitud2 = map(math.radians, [latitud1, longitud1, latitud2, longitud2])

    # Diferencias de coordenadas
    dlatitud = latitud2 - latitud1
    dlongitud = longitud2 - longitud1

    # Fórmula de Haversine
    a = math.sin(dlatitud / 2)**2 + math.cos(latitud1) * math.cos(latitud2) * math.sin(dlongitud / 2)**2
    c = 2 * math.atan2(math.sqrt(a), math.sqrt(1 - a))
    r = 6378  # Radio de la Tierra en kilómetros
    return r * c

# Iniciar cálculos y mostrar los resultados
distancia = haversine(latitud_ciudad1, longitud_ciudad1, latitud_ciudad2, longitud_ciudad2)
print(f"\nLa distancia entre {nombre_ciudad1} y {nombre_ciudad2} es de {distancia:.2f} km aproximadamente.")
