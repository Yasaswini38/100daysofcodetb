# Write a program to find ASCII values of a character
alph = input("Enter a character: ")
if len(alph) == 1:
    ascii_value = ord(alph)
    print("ASCII value of " + alph + " is " + str(ascii_value))
else:
    print("Please enter a single character.")
