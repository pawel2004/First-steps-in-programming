import random
random.seed()

print('Odgadnij moją ocenę!')
ocena = random.randint(1,6)
while 1:
    try:
       user_input = int(input(': '))
       int(user_input)
       if user_input == ocena:
          print('Brawo! Zgadłes!')
          print('Moją oceną było:', ocena,'.')
          break
       else:
          print('Nie odgadłes! Probuj dalej!')
    except:
        ValueError
        print('Wystąpił błąd!')


