def replace_zeros(number):
    result = int(str(number).replace('0', '1'))
    return result

number = int(input("Enter a number: "))
print("Result after replacing all 0's with 1's:", replace_zeros(number))
