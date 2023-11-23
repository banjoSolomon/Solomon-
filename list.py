numbers = list(range(6))
squares = []
for numbers in numbers:
	squares.append(numbers * numbers)

cube = []
for numbers in numbers:
	cubes.append(number * number * number)

print("Number	| Square     | Cube")
print("---------|------------|------")
for i in range(len(numbers)):
	print(numbers[i], " | ", cubes[i])

