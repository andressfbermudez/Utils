"""
Comprenhensions
"""

# List Comprenhension
# Sintax: name_list = [element for elemento in iterable if condition]
numbers = [i for i in range(0, 21) if i % 2 == 0]
print(numbers)

# Dictionary Comprenhension
# Sintax: name_dict = {key : value for i in iterable if condition}
customers = {}

for i in range(1, 11):
    customers[i] = i * 2
    
customers_comprenhension = {i * 2 : i for i in range(0, 10)}
print(customers_comprenhension)

names = ["Andres", "Laura", "Cesar", "Albeiro"]
id_students = list(range(1, len(names) + 1))

students_list = list(zip(id_students, names))

students = {id_students : names for (id_students, names) in students_list if id_students > 3}
students_v2 = dict(students_list)
print(students)
