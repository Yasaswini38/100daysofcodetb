def noofdigi(n):
    count = 0
    n = abs(n)
    
    if n == 0:
        return 1
    
    while n > 0:
        n = n // 10
        count += 1
    
    return count

number = int(input("Enter an integer: "))
print("Number of digits:", noofdigi(number))
