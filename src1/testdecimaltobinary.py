# 1. Get the number from the user
number = int(input("Enter a decimal number: "))

# 2. Create an empty string to hold our binary digits
binary_result = ""

# 3. Your while loop
while number > 0:
    remainder = number % 2
    
    # We glue the new digit to the FRONT of our string
    binary_result = str(remainder) + binary_result 
    
    # Shrink the number for the next round
    number = number // 2

# 4. Print the final result
print("Binary equivalent:", binary_result)
