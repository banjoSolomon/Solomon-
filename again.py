def cashier_name():
	name = input("What is your name? : ")
	discout = float(input(" How many discount will he get: "))


def repeat_menu():
	user_buy = input(" What did the user buy?: ")
	pieces = int(input(" How many pieces?: "))
	unit = float(input(" How much per unit: "))
	items = input(" Add more Items? Yes or No : ")
	
	if items.casefold()== "No".casefold():
		cashier_name()
		

def menu():
	customer_name = input(" What is the customer name: ")
	user_buy = input(" What did the user buy?: ")
	pieces = int(input(" How many pieces?: "))
	unit = float(input(" How much per unit: "))
	items = input(" Add more Items? Yes or No : ").casefold()
	if items == "yes":
		repeat_menu()





menu()    


	
		