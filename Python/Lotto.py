import random
print('Welcome to our Lottery! You can win up to 200 zł!')
print("Do you want to choose your numbers?- 1 or Do you want to draw them?- 2")
choice = int(input("1 or 2: "))
if choice == 1:
  print("Tell me your numbers. From 1 to 45.")
  number1 = int(input("First number: "))
  number2 = int(input("Second number: "))
  number3 = int(input("Third number: "))
  number4 = int(input("Fourth number: "))
  number5 = int(input("Fifth number: "))
  nums = (number1 , number2, number3, number4, number5)
  print("These are your numbers: ", nums)
elif choice == 2:
    random.seed()
    number1 = random.randint(1,45)
    number2 = random.randint(1,45)
    number3 = random.randint(1,45)
    number4 = random.randint(1,45)
    number5 = random.randint(1,45)
    nums = (number1 , number2, number3, number4, number5)
    print("These are your numbers: ", nums)
print("Let's begin!")
random.seed()
wnumber1 = random.randint(1,45)
wnumber2 = random.randint(1,45)
wnumber3 = random.randint(1,45)
wnumber4 = random.randint(1,45)
wnumber5 = random.randint(1,45)
winning_numbers = (wnumber1, wnumber2, wnumber3, wnumber4, wnumber5)
score = 0
hit = []
for a in winning_numbers:
    if a == number1:
        score = score + 1
        hit.append(a)
    elif a == number2:
        score = score + 1
        hit.append(a)
    elif a == number3:
        score = score + 1
        hit.append(a)
    elif a == number4:
        score = score + 1
        hit.append(a)
    elif a == number5:
        score = score + 1
        hit.append(a)
    else:
       continue
print("These are winning numbers: ",winning_numbers)
print("You have hit: ",score,"numbers!")
if score != 0:
  print("Here they are: ",hit )
if score == 5:
    print("Congratulations! You have won 200 zł!")
else:
    print('Try again!')



