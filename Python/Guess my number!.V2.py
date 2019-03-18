import random

class Game:

    def main_menu(self):
        print('Welcome to "Guess my number!"')
        print('If you want to play, enter "start".')
        print('If you want to end program, enter "exit".')

    def settings(self):
        print('Choose range of a draw.')
        self.range_of_draw = int(input('from 1 to: '))
        print('Choose a number of chances.')
        self.chance = int(input(': '))

    def game(self):
        random.seed()
        print('Guess my number!')
        print('You have ', self.chance, 'chances.')
        computersnumber = random.randint(1, self.range_of_draw)
        score = 1
        while True:
            user_number = int(input())
            if computersnumber == user_number:
                print('Hurra! You have guessed in', score, 'steps!')
                break
            if computersnumber > user_number:
                print('My number is bigger.')
                score = score + 1
            if computersnumber < user_number:
                print('My number is smaller.')
                score = score + 1
            if score == self.chance + 1:
                print('Out of chances! Game over!')
                break

G = Game()
while True:
    G.main_menu()
    user_input = input(': ')
    if user_input == "start":
        G.settings()
        G.game()
    elif user_input == "exit":
        break
