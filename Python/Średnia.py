import numpy as np

user_input = int(input('Z ilu liczb chcesz obliczyc srednią?'))

liczby = []

for i in range(1, user_input+1):
    user_number = int(input('Podaj liczbę:' ))
    liczby.append(user_number)
numbers = np.array(liczby)
print('Twoja średnia to: ', np.average(numbers))
