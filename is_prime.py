number = int(input("Ingresa un numero: "))
numbers_list = list(range(1, number + 1))
prime_numbers = []

for i in numbers_list:
    if i < 2:
        continue
    if i == 2 or i == 3:
        prime_numbers.append(i)
        continue
    
    is_prime = True
    for n in range(2, int(i**0.5) + 1):
        if i % n == 0:
            is_prime = False
            break 

    if is_prime:
        prime_numbers.append(i)

print(prime_numbers)
