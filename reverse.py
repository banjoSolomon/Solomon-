def reverse(name):
	number = len(name)-1
	name2 =""
	for num in range(number, -1, -1):
		name2 += name[num]
	return name2
print(reverse('solomon'))