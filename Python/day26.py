def calculate_handshakes(n):
    return n * (n - 1) // 2  
  
n = int(input("Enter the number of people in the room: "))
if n < 0:
    print("The number of people cannot be negative.")
else:
    total_handshakes = calculate_handshakes(n)
    print(f"The maximum number of handshakes possible among {n} people is: {total_handshakes}")

# To calculate the maximum number of handshakes possible among N people in a room, you can use the formula for the sum of the first N−1N-1N−1 natural numbers, which can be calculated using the formula:

# Total Handshakes=N×(N−1)2\Total Handshakes = N \(N - 1){2}Total Handshakes=2N×(N−1)​This is because each person can shake hands with every other person exactly once.
