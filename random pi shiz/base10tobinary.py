
def to_binary():
    x = int(input("enter the decimal number: "))
    binary = ""
    while x != 0:
        if x % 2 == 0:
            binary = "0" + binary
        else:
            binary = "1" + binary
        x = x // 2
    print(binary)

def to_decimal():
    x = input("enter the binary number: ")
    x = str(x)
    decimal = 0
    for i in range(len(x)):
        decimal += int(x[i]) * 2 ** (len(x) - 1 - i)
    print(decimal)

function = input("Enter 'b' for binary to decimal or 'd' for decimal to binary: ")
if function == "b":
    to_decimal()
elif function == "d":
    to_binary()