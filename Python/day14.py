num = int(input("Enter number to be reversed: "))
rev = 0
while num > 0:
    dig= num % 10  
    rev = rev * 10 + dig
    num = num // 10  
print("Reversed number is:", rev)


# num = input("Enter number to be reversed: ")
# rev = num[::-1] 
# print("Reversed number is:", rev)
