#link to problem: http://codeforces.com/contest/381/problem/A

#code:
n = int(input())
ar = list(map(int, input().split()))
i, j, s, d, c = 0, n - 1, 0, 0, 0
while(i <= j):
	if(c % 2 == 0):
		if (ar[i] > ar[j]):
			s += ar[i]
			i += 1
		else:
			s += ar[j]
			j -= 1
	else:
		if (ar[i] > ar[j]):
			d += ar[i]
			i += 1
		else:
			d += ar[j]
			j -= 1
	c += 1

print(str(s) + " " + str(d))
