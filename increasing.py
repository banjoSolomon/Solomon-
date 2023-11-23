def increasing_order(num1, num2, num3):
    if num1 <= num2 and num1 <= num3:
        if num2 <= num3:
            return num1, num2, num3
        else:
            return num1, num3, num2
    elif num2 <= num1 and num2 <= num3:
        if num1 <= num3:
            return num2, num1, num3
        else:
            return num2, num3, num1
    else:
        if num1 <= num2:
            return num3, num1, num2
        else:
            return num3, num2, num1


num1 = float(input("Enter the first number: "))
num2 = float(input("Enter the second number: "))
num3 = float(input("Enter the third number: "))


sorted_numbers = increasing_order(num1, num2, num3)


print("The numbers in increasing order are:", sorted_numbers)
