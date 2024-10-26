def perf(n):
    return n > 0 and sum(i for i in range(1, n) if n % i == 0) == n

number = int(input("Enter a positive integer: "))

if perf(number):
    print(f"{number} is a perfect number.")
else:
    print(f"{number} is not a perfect number.")
