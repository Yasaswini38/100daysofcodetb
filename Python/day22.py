def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, n):
        if n % i == 0:
            return False
    return True

def find_two_primes(number):
    for i in range(2, number):
        if is_prime(i) and is_prime(number - i):
            print(f"{number} can be expressed as the sum of {i} and {number - i}, which are both prime.")
            return
    print(f"{number} cannot be expressed as the sum of two prime numbers.")

number = int(input("Enter a number: "))
find_two_primes(number)
