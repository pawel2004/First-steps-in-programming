import random

class Loteria:

    def __str__(self):
        return 'Welcome to our Lottery! You can win up to 200 zł!\nDo you want to choose your numbers?- 1 or Do you want to draw them?- 2'


    def __init__(self):
        self.nums = []
        self.wnums = []
        self.hit = []
        self.score = 0

    def draw(self):
        random.seed()
        for a in range(5):
            self.number = random.randint(1,45)
            self.nums.append(self.number)
        print("These are your numbers: ", self.nums)

    def choose(self):
        print("Tell me your numbers. From 1 to 45.")
        for i in range(5):
            self.number = int(input(": "))
            self.nums.append(self.number)
        print("These are your numbers: ", self.nums)

    def winning_numbers(self):
        random.seed()
        for b in range(5):
            self.wnumber = random.randint(1,45)
            self.wnums.append(self.wnumber)

    def check(self):
        for c in self.wnums:
            if c == self.nums[0]:
                self.score = self.score + 1
                self.hit.append(c)
            elif c == self.nums[1]:
                self.score = self.score + 1
                self.hit.append(c)
            elif c == self.nums[2]:
                self.score = self.score + 1
                self.hit.append(c)
            elif c == self.nums[3]:
                self.score = self.score + 1
                self.hit.append(c)
            elif c == self.nums[4]:
                self.score = self.score + 1
                self.hit.append(c)
            else:
                continue
    def results(self):
        print("These are winning numbers: ", self.wnums)
        print("You have hit: ", self.score, "numbers!")
        if self.score != 0:
            print("Here they are: ", self.hit)
        if self.score == 5:
            print("Congratulations! You have won 200 zł!")
        else:
            print('Try again!')


Lotto = Loteria()
print(Loteria())
choice = int(input("1 or 2: "))
if choice == 1:
    Lotto.choose()
elif choice == 2:
    Lotto.draw()
Lotto.winning_numbers()
Lotto.check()
Lotto.results()




