x = 123456789
binary = ""
while x != 0:
    if x % 2 == 0:
        binary = "0" + binary
    else:
        binary = "1" + binary
    x = x // 2
print(binary)