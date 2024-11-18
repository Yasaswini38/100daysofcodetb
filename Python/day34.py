import re

def rembraces(expression):
    return re.sub(r"[(){}\[\]]", "", expression)

exp = input("Enter the algebraic expression: ")
result = rembraces(exp)
print("Expression without brackets:", result)
