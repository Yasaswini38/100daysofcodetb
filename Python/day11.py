def fibonacci(n):
    a, b = 0, 1
    while a <= n:
        print(a, end=" ")
        a, b = b, a + b
      
number = int(input("Enter the value of n: "))

fibonacci(number)
