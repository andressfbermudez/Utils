import random

# Attacks Availables
rock = 'rock'
paper = 'paper'
scissors = 'scissors'

# Score players
score_user = 0
score_machine = 0

# Attacks players
user_attack = ''
machine_attack = ''

def random_attack():
    global machine_attack
    number = random.randint(1, 3)
    if number == 1:
        machine_attack = rock
    elif number == 2:
        machine_attack = paper
    elif number == 3:
        machine_attack = scissors
    return machine_attack

def combat():
    global score_user, score_machine
    print()
    if user_attack == machine_attack:
        print('¡Draw!')
    elif user_attack == rock:
        if machine_attack == paper:
            score_machine += 1
            print('¡Machine wins!')
        elif machine_attack == scissors:
            score_user += 1
            print('¡User wins!')
    elif user_attack == paper:
        if machine_attack == rock:
            score_user += 1
            print('¡User wins!')
        elif machine_attack == scissors:
            score_machine += 1
            print('¡Machine wins!')
    elif user_attack == scissors:
        if machine_attack == rock:
            score_machine += 1
            print('¡Machine wins!')
        elif machine_attack == paper:
            score_user += 1
            print('¡User wins!')

def menu():
    global user_attack, score_user, score_machine, rock, paper, scissors
    game = True

    while game == True:
        print()
        print('--------------------------------------------------------------')
        print(f'Score user: {score_user}       Score machine: {score_machine}')
        print('Enter your attack:')
        user_attack = input('Your choice: ')

        # Verify valid attack 
        if user_attack != rock and user_attack != paper and user_attack != scissors:
            print()
            print('Invalid Attack')
            menu()

        machine_attack = random_attack()
        print(f'The machine choice: {machine_attack}')
        combat()

        # Verify score players
        if score_user == 3 or score_machine == 3:
            game = False
            print()
            print('--------------------------------------------------------------')
            print('¡End of Game!')
            print(f'Score user: {score_user}       Score machine: {score_machine}')
            print()

            if score_user == 3:
                print('User Wins Game')
            else:
                print('Machine Wins Game')
        
menu()