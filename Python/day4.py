#Write a program to identify of the a number is positive or negative
a=int(input("Enter a number: "))
if a>0:
    print(str(a)+" is a positive number")
elif a<0 :
    print(str(a)+" is a negative number")
else:
    print(str(a)+" is neither +ve nor -ve")
