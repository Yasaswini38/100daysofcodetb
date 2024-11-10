def palindrome(n):
    rev=0
    ori=n
    while(n!=0):
        rev=rev*10+(n%10)
        n//=10
    return rev==ori

n=int(input("Enter a number "))
if(palindrome(n)):
    print("A palindromee")
else:
    print("not onnee")
