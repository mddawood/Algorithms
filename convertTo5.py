#link to problem: https://practice.geeksforgeeks.org/problems/replace-all-0-with-5-in-an-input-integer/1

#code
n = int(input())
ar = list(map(int, str(n)))
for i in range(len(ar)):
	if (ar[i] == 0):
		ar[i] = 5
m = int("".join(map(str, ar)))
print(m)
