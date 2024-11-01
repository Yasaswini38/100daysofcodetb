def is_palindrome(number):
    number_str = str(number)
    return number_str == number_str[::-1]

number = int(input("Enter a number: "))
if is_palindrome(number):
    print(f"{number} is a palindrome.")
else:
    print(f"{number} is not a palindrome.")

# def is_palindrome(number):
#     original = number
#     reversed_num = 0
#     while number > 0:
#         digit = number % 10
#         reversed_num = reversed_num * 10 + digit
#         number //= 10
#     return original == reversed_num

# number = int(input("Enter a number: "))
# if is_palindrome(number):
#     print(f"{number} is a palindrome.")
# else:
#     print(f"{number} is not a palindrome.")
