price = int(input("price of the car"));
if price < 1000000:
	price = (100000)* 10/100;
	print (price)
elif price >=  1000000 and price < 3000000:
	print(0.15 * price)
elif price >= 3000000 and price < 5000000:
	print(0.20 * price)
elif price >= 5000000: 
	print(0.25 * price)