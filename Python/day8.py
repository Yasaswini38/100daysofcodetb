import math

def rootsof(a, b, c):
    dis = b**2 - 4*a*c
    
    if dis > 0:
        root1 = (-b + math.sqrt(dis)) / (2*a)
        root2 = (-b - math.sqrt(dis)) / (2*a)
        print(f"Two real roots: {root1} and {root2}")
    elif dis == 0:
        root = -b / (2*a)
        print(f"One real root: {root}")
    else:
        real = -b / (2*a)
        imag = math.sqrt(-dis) / (2*a)
        print(f"Two complex roots: {real} + {imag}i and {real} - {imag}i")

a = float(input("Enter a: "))
b = float(input("Enter b: "))
c = float(input("Enter c: "))
rootsof(a, b, c)
