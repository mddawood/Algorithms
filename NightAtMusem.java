//link to the problem: http://codeforces.com/contest/731/problem/A
//Code:

import java.util.Scanner;
import java.lang.Math;
public class NightAtMuseum
{
	public static void main(String args[])
	{
		int l, i, prev = 97, curr, diff, rotate = 0;
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		l = s.length();
		for( i = 0 ; i < l ; i++ )
		{
			curr = (int)s.charAt(i);
			diff = Math.abs(curr - prev);
			if (diff < 13)
			{
				rotate += diff;
			}
			else
			{
				rotate += (26 - diff);
			}
			prev = curr;
		}
		System.out.print(rotate);
	}
}
