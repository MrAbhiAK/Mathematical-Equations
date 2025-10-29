import math
n = int(input())
p = int(math.log2(n))
a = 2**p
l = n-a
Joseph = 2*l + 1
print(Joseph)
