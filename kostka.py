from random import randint
from random import seed
		
user_input = int(input('Ilość rzutów: '))
for i in range(user_input):
	number = randint( 1, 6)
	if number == 1:
		print(11*'-')
		print('-         -')
		print('-         -')
		print('-    o    -')
		print('-         -')
		print('-         -')
		print(11*'-')
	elif number == 2:
		print(11*'-')
		print('-         -')
		print('- o       -')
		print('-         -')
		print('-       o -')
		print('-         -')
		print(11*'-')
	elif number == 3:
		print(11*'-')
		print('- o       -')
		print('-         -')
		print('-    o    -')
		print('-         -')
		print('-       o -')
		print(11*'-')
	elif number == 4:
		print(11*'-')
		print('-         -')
		print('- o     o -')
		print('-         -')
		print('- o     o -')
		print('-         -')
		print(11*'-')
	elif number == 5:
		print(11*'-')
		print('- o     o -')
		print('-         -')
		print('-    o    -')
		print('-         -')
		print('- o     o -')
		print(11*'-')
	else:
		print(11*'-')
		print('- o     o -')
		print('-         -')
		print('- o     o -')
		print('-         -')
		print('- o     o -')
		print(11*'-')
		
	
	
 
