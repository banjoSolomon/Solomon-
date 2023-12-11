def largestFunc(anyList):
	largest = float('-inf')
	for iteams in anyList:
		if iteams > largest:
			largest = iteams
	return largest
myList =[1,400,32,2,5,6,9]

this_second_list = [-100, -1, -4, -9, -7, -9, -20]
print(largestFunc(this_second_list))
print(largestFunc(myList))