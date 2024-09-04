"""
Python Introduction continue...
"""

# Conjuntos:
# Son estructuras de datos NO ordenadas, mutables de elementos unicos.

# Declaracion
countries = {"EE.UU"} # Se utilizan las llaves {} para declarar conjuntos

# Agregar elementos a un conjunto
countries.add("Colombia")
countries.add("Cannada")
countries.add("Australia")
countries.add("North Korea")

# Agregar una estructura de datos a un conjunto
countries.update(["Israel", "Rusia", "España"])

# Eliminacion de elementos en un conjunto
countries.remove("North Korea")
    # El metodo discard() se ejecuta sin causar una 'Exeption' en caso de no encontrar el elemento
countries.discard("EE.UU")

# Eliminar todos los elementos de un conjunto
countries.clear()

# Imprimir el conjunto
print(countries)

# Iterar sobre un conjunto
for i in countries:
    print(i)
       
# Obtener el tamaño de un conjunto
print(len(countries))


# OPERACIONES ENTRE CONJUNTOS
names_A = {"Andres", "Laura", "Cesar", "Natalia", "Carolina"}
names_B = {"Vanessa", "Angie", "Natalia", "Carlos"}

# Union entre conjuntos
names_C = names_A.union(names_B)
names_D = names_A | names_B

print(names_C) # {'Carlos', 'Vanessa', 'Natalia', 'Cesar', 'Carolina', 'Angie', 'Laura', 'Andres'}
print(names_D) # {'Carlos', 'Vanessa', 'Natalia', 'Cesar', 'Carolina', 'Angie', 'Laura', 'Andres'}


# Intersecion entre conjuntos
names_F = names_A.intersection(names_B)
names_G = names_A & names_B

print(names_F) # {'Natalia'}
print(names_G) # {'Natalia'}

# Diferencia entre conjuntos
names_H = names_A.difference(names_B)
names_I = names_A - names_B

print(names_H) # {'Cesar', 'Andres', 'Carolina', 'Laura'}
print(names_I) # {'Cesar', 'Andres', 'Carolina', 'Laura'}

# Diferencia simetrica entre conjuntos
names_J = names_A.symmetric_difference(names_B)
names_K = names_A ^ names_B
