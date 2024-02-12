new_number = []
for numbers in range(10):
    userInput = int(input("Enter ten number: "))
    if userInput not in new_number:
        new_number.append(userInput)
    else:
        print("Duplicate Number")
print(new_number)


def sum_collection(my_numbers):
    total_sum = sum(my_numbers)
    return total_sum


number = {2, 10, 15, 20, 23, 26}
result = sum_collection(number)

print(result)


def remove_item(items, element):
    if element in items:
        items.remove(element)
        return element
    else:
        return None


my_items = {2, 4, 6, 8, 15, 19, 10}
result = remove_item(my_items, 8)
remove_value = remove_item(my_items, 8)

print(result)
print(my_items)
print(remove_value)


def find_intersection(element_one, element_two):
    view_one = set(element_one)
    view_two = set(element_two)
    new_element = view_one.union(view_two)
    return new_element


set_one = {2, 4, 6, 7, 13, 15}
set_two = {23, 34, 12, 45, 3}
result = find_intersection(set_one, set_two)
print(result)
