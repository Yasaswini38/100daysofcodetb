import math

def Aoc(radius):
    return math.pi * radius ** 2

radius = float(input("Enter the radius of the circle: "))
area = Aoc(radius)
print(f"The area of the circle with radius {radius} is: {area:.2f}")
