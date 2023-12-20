def only_float (c , b):
	if c % 1 <= 0 and b % 1 <= 0:
		return 2

	elif c % 1 <= 0 or b % 1 <= 0:
		return 1

	else:
		return 0