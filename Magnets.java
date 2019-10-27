//link to the problem: http://codeforces.com/contest/344/problem/A

import java.util.Scanner;
public class Magnets
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n, g = 1, i;
		n  = sc.nextInt();
		int[] ar = new int[n];
		for (i = 0 ; i < n; i++)
		{
			ar[i] = sc.nextInt();
		}
		
		for (i = 0; i < n -1 ; i++)
		{
			if (ar[i] == ar[i+1])
			{
				continue;
			}
			else
			{
				g++;
			}
		}
		
		System.out.print(g);
	}
}
