def is_palindrome(s):
    n = len(s)
    for i in range(n // 2):
        if s[i] != s[n - i - 1]:
            return False
    return True

strrringg= input("Enter a string: ")
if is_palindrome(strrringg):
    print(f'"{strrringg}" is a palindrome!')
else:
    print(f'"{strrringg}" is not a palindrome.')
