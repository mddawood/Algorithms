//link to problem: http://codeforces.com/contest/427/problem/A
//Code:

import java.util.Scanner;
public class Police_recruits
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i, crime = 0, rec = 0;
		int n = sc.nextInt();
		int[] ar = new int[n];
		for(i = 0; i < n ; i++)
		{
			ar[i] = sc.nextInt();
		}
		
		for(i = 0; i < n; i++)
		{
			if(ar[i] == -1)
			{
				if(rec == 0)
				{
					crime++;
				}
				else
				{
					rec--;
				}
			}
			else
			{
				rec += ar[i];
			}
		}
		
		System.out.print(crime);
	}
}
