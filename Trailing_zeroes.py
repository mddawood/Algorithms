#link to the problem: https://practice.geeksforgeeks.org/problems/trailing-zeroes-in-factorial/0

import math
for i in range(int(input())):
	n = int(input())
	f = math.factorial(n)
	c = 0
	ar = list(map(int, str(f)))
	d = ar.pop()
	while(d == 0):
		c += 1
		d = ar.pop()
	print(c)
