total = 0
grade_counter = 0

grade = int(input('Enter grade: '))

while grade != 1:
	total += grade
	grade_counter += 1
	grade = int(input('Enter grade: '))
	
	if grade_counter != 0:
		average = total / grade_counter
		print(f'Class average is {average:.2f}')

else:
	print('No grade were entered')