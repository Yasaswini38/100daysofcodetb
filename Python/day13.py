n = int(input("Enter a value: "))
if n <= 0:
    print("Only natural numbers are allowed.")
else:
    sum = 0
    for i in range(1, n + 1):
        sum += i
    print(f"The sum of the first {n} natural numbers is: {sum}")
