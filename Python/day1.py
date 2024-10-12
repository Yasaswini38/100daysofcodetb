alph=input("enter an alphabet:")
vowels=['a','e','i','o','u']
if alph.lower( ) in vowels:
    print(alph + " is an vowel")
else:
    print("consonant")


#verifies that the input consists of exactly one character
# alph = input("Enter an alphabet: ")
# vowels = ['a', 'e', 'i', 'o', 'u']
# if len(alph) == 1 and alph.isalpha():
#     if alph.lower() in vowels:
#         print(alph + " is a vowel")
#     else:
#         print(alph + " is a consonant")
# else:
#     print("Please enter a valid single alphabet.")
