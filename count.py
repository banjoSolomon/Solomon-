oddCount = 0
evenCount = 0
for number in range (1, 100):
	if number % 2 == 0:
		evenCount+=1
	elif number % 2 != 0:
		oddCount+=1
print("Number of even numbers: ", evenCount)
print("Number of odd numbers: ", oddCount)
