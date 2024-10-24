def factorial(n):
    fact = 1
    for i in range(1, n + 1):
        fact *= i
    return fact

def strng(num):
    sof = 0
    temp = num  

    while temp > 0:
        digit = temp % 10  
        sof += factorial(digit) 
        temp //= 10  

    return sof == num

number = int(input("Enter a number: "))
if strng(number):
    print(f"{number} is a Strong number.")
else:
    print(f"{number} is not a Strong number.")
