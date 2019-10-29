#link to the problem: http://codeforces.com/contest/266/problem/A
#code:
n = int(input())
s = input()
c = 0
for i in range(n-1):
	if(s[i] == s[i+1]):
		c += 1
print(c)
