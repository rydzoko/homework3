#theheader
print(f"{'n':<4} | {'2**n':<6} | {'Binary Form':<12}")
print("-" * 28)

#loop from n = 0 to 10
for n in range(11):
    value = 2 ** n
    #bin(value)[2:] removes the '0b' prefix
    binary_str = bin(value)[2:]
    print(f"{n:<4} | {value:<6} | {binary_str:<12}")
