language = input('Enter your prefered language: ')
people_name = input('Enter your name : ')

match language:

	case 'java':
		print('A java pro')
	case 'python':
		print('Pythonista')
	case _ :
		print('This is defult')
match people_name:

	case 'Solomon':
		print('My name is peoeple_name')
	case 'Dee':
		print('My name is people_name')
	case 'Ayomide':
		print('My name is people_name')
	case _ :
		print('This is defult')