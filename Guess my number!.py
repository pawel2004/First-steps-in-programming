while 1:
	print('Welcome to "Guess my number!"')
	print('If you want to play, enter "start".')
	print('If you want to end program, enter "exit".')
	user_input = input(': ')
	if user_input == 'start':
	    print('Choose range of a draw.')
	    range_of_draw = int(input('from 1 to: '))
	    print('Choose a number of chances.')
	    chance = int(input(': '))
	    import random
	    random.seed()
	    print('Guess my number!')
	    print('You have ',chance, 'chances.')
	    computersnumber =  random.randint(1,range_of_draw)
	    score = 1
	    while 1:
        	user_number = int(input())
        	if computersnumber == user_number:
        		print('Hurra! You have guessed in',score, 'steps!')
        		break
        	if computersnumber>user_number:
        		print('My number is bigger.')
        		score = score + 1
        	if computersnumber<user_number:
        		print('My number is smaller.')
        		score = score + 1
        	if score == chance + 1:
        		print('Out of chances! Game over!')
        		break
	elif user_input == 'exit':
		break



