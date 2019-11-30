# link to problem: https://codeforces.com/contest/9/problem/A

y, w = map(int, input().split())
f = 7  - max(y, w) #number of favourable outcomes

#pre-calculated fractions based on the value of favourable outcomes:

if (f == 6):
	print("1/1")
elif (f == 5):
	print("5/6")
elif (f == 4):
	print("2/3")
elif (f == 3):
	print("1/2")
elif (f == 2):
	print("1/3")
elif (f == 1):
	print("1/6")
else:
	print("0/1")
