import random
random.seed()

print('Odgadnij moją ocenę!')
ocena = random.randint(1,6)
while 1:
    user_input = int(input(': '))
    if user_input == ocena:
        print('Brawo! Zgadłes!')
        break
    else:
        print('Nie odgadłes! Probuj dalej!')

