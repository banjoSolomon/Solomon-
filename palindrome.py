def my_palindrome_func(myString):
	my_lower_string = myString.lower()
	myList = list(my_lower_string)
	length = len(myList)
	if myList[length::-1] == myList:
		return True
	else:
		return False

	this_string = ("noon")
	print(my_palindrome_func(this_string))	