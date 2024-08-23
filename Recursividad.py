# Hallar el factorial de un numero
def factorial(number):
    # Caso base
    if number == 0:
        return 1
    # Caso recursivo
    else:
        return number * factorial(number - 1)

# Imprimir el resultado
print(factorial(5))



# Hallar la suma de una serie de numeros naturales
def sum_numbers(number):
    # Caso base: si number es 0, la suma es 0
    if number == 0:
        return 0
    # Caso recursivo: n + suma de (n-1)
    else:
        return number + sum_numbers(number - 1)

# Llamada a la función
result = sum_numbers(5)
print(f"Suma de los primeros 5 números es: {result}")
