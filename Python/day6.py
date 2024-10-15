#Write a program to find the Quadrants in which coordinates lie
x=int(input("Enter X Coordinate: "))
y=int(input("Enter Y Coordinate: "))
#Quadrant I has positive x and y values, Quadrant II has negative x and positive y, Quadrant III has negative x and y, 
#and Quadrant IV has positive x and negative y.
if (x>=0 and y>=0 ):
    print(f"({x},{y}) are in Q1")
elif (x<0 and y<0):
    print(f"({x},{y}) are in Q3")
elif(x<0 and y>0):
    print(f"({x},{y}) are in Q2")
else:
    print(f"({x},{y})are Q4")

# def quad(x, y):
#     if x == 0 and y == 0:
#         return "Origin"
#     elif x == 0:
#         return "Y-axis"
#     elif y == 0:
#         return "X-axis"
    
#     switch = {
#         (True, True): "I Quadrant",    
#         (False, True): "II Quadrant",  
#         (False, False): "III Quadrant",
#         (True, False): "IV Quadrant"   
#     }
#     return switch[(x > 0, y > 0)]
    
# x = int(input("Enter X Coord: "))
# y = int(input("Enter Y Coord: "))
# res = quad(x, y)
# print(f"({x}, {y}) are in the {res}")
