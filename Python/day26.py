# Get the number of people in the room as input from the user. 
# Then calculate the maximum number of handshakes possible among that people.
# For e.g. If there are N people in the room then the first person 
# has to shake hand with N-1 people and second person has to shake hand 
# with N-1-1 people i.e., N-2 handshakes are possible. Thus, it goes on.
# So total hand shakes = N-1 + N-2 + N-3 +………+1 + 0 

def maxhandshakes(n):
    return (n*(n-1))//2 

a=int(input("Enter the number of people in the room: " ))
print("The maximum number of handshakes possible is: ",maxhandshakes(a))
        
