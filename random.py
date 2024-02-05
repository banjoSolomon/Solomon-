import random
numberOfGuess = 0
userGuess = int(input('Enter a numuber: '))

randomNumber = random.randint(1, 10)

for numberOfGuess in range (2):
	if userGuess != randomNumber:
		print('try again')
		userGuess = int(input('Enter a numuber: '))
	else:
		print('you win!!')





