import positions

my_new_list = [9,11,5,-5,14,22,7,8]

this_second_list = [-100, -1, -5, -9, -6, -8, -17]

def test_positions():
	assert positions.even_positions_func(my_new_list) == [9, 5, 14, 7]