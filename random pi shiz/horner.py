
# lowest coefficient is 1
# highest coefficient is n - 1
# highest power is n + 1
# lowest power is 1

k = 0x55
p = 257
y = (k**4 + k**3 * 0x26 + k**2 * 0x14 + k * 0x04) % p
print(y)