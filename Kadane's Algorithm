for i in range(int(input())):
	n = int(input())
	ar = list(map(int, input().split()))
	max_c = max_g = ar[0]
	for j in range(1, n):
		max_c = max(ar[j], max_c + ar[j])
		if (max_c > max_g):
			max_g = max_c
	print(max_g)
