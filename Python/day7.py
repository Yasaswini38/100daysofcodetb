#Write a program to find Number of days in a given month of a given year
def yrchk(year):
    if (year % 400 == 0) or (year % 100 != 0 and year % 4 == 0):
        return True
    return False
    
def daizz(month, year):
    mon31 = ["January", "March", "May", "July", "August", "October", "December"]
    mon30 = ["April", "June", "September", "November"]
    month = month.capitalize()
    if month in mon31:
        return 31
    elif month in mon30:
        return 30
    elif month == "February":
        return 29 if yrchk(year) else 28
    else:
        return "Invalid month" 

month = input("Enter the name of the month: ")
year = int(input("Enter the year: "))
days = daizz(month, year)
print(f"{month} {year} has {days} days.")


