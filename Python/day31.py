def toggle_case(input_str):
    result = []
    for char in input_str:
        if char.isupper():
            result.append(char.lower())
        elif char.islower():
            result.append(char.upper())
        else:
            result.append(char)  
    return ''.join(result)

input_str = input("Enter any String: ")
toggled = toggle_case(input_str)
print("Toggled String:", toggled)
