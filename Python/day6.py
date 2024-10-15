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
