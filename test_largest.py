import largest
this_List = [22,56,99,101,3,6,7]

this_second_list = [-100, -1, -5, -9, -6, -8, -17]

def test_largest():
	assert largest.largestFunc(this_List)== 101

def test_largest():
	assert largest.largestFunc(this_second_list) == -1

print(largest.largestFunc(this_List))

print(largest.largestFunc(this_second_list))
	
