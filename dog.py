dogsAgeInYears = int(input("Enter dog age in human years: "))
if dogsAgeInYears <=2:
	age = dogAgeInYears * 10.5
if dogsAgeInYears > 2:
	age = ((dogsAgeInYears -2) * 5) + 21
print("The dog age in dog years is: ", age);