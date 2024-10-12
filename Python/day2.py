import string
alph=input("enter an alphabet:")
b=string.ascii_lowercase
c=string.ascii_uppercase
if alph in b or alph in c:
    print(alph + " is an alphabet")
else:
    print("not alphabet")


# built-in string methods 
#alph = input("Enter an alphabet: ")
# if alph.isalpha() and len(alph) == 1:
#     print(alph + " is an alphabet")
# else:
#     print(alph + " is not an alphabet")
