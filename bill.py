units = int(input("Enter electricty bill: "))

if units == 100:
	print("0 charge")
elif units <100:
	print("0 charge")
if units > 100 and units <= 200:
	print(10 *(units-100))
if units > 200 and units >= 200:
	print(20 * (units - 200) + 10 * 100)
