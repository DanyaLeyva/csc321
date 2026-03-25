# CSC-321 Lab #6 - Python Variables and Selection Statements
# Your name: Danya
# Date: February 2026

# 1. Create an interger, a float, and a string variable ( implicit type- no "int", "float", or "String" keywords)

x = 6
y = 5.5
z = "California" 


# String Comparison
if z == "California": 
    print ("Variable z is California")

else:
    print("Variable z is not California")

# Integer comparison

if x < 5:
    print ("x is less than 5")

elif x == 6:
    print("x is equal to 6")

elif x > 7:
    print("x is greater than 7")

else:
    print("x is between 5 and 7 but not 6")


# float comparison 
 
if y > 6.0:
    print("y is greater than 6.0")
elif y == 5.5:
    print("y is exactly 5.5")
elif y < 5.0:
    print("y is less than 5.0")
else:
    print("y is between 5.0 and 6.0 but not exactly 5.5")




