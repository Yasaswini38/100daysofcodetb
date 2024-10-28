num = int(input("Enter a number: "))

sop = sum(int(digit) ** len(str(num)) for digit in str(num))

if sop == num:
    print(f"{num} is an Armstrong number.")
else:
    print(f"{num} is not an Armstrong number.")
