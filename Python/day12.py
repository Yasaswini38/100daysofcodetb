number=int(input("Enter number: "))
sod=0
while number > 0:
    digit = number % 10  
    sod += digit  
    number = number // 10 
    
print("Sum of digits:", sod)


# number = int(input("Enter number: "))
# sod= sum(int(digit) for digit in str(number))
# print("Sum of digits:", sod)
