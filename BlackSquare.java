//link to problem: http://codeforces.com/contest/431/problem/A
//Code:

import java.util.Scanner;
public class Black_Square
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char ch;
		int i, l, cal = 0;
		int[] ar = new int[4];
		for(i = 0 ; i < 4; i++)
		{
			ar[i] = sc.nextInt();
		}
		sc.nextLine();
		String s = sc.nextLine();
		l = s.length();
		for(i = 0; i < l ; i++)
		{
			ch = s.charAt(i);
			if (ch == '1')
				cal += ar[0];
			else if (ch == '2')
				cal += ar[1];
			else if (ch == '3')
				cal += ar[2];
			else if (ch == '4')
				cal += ar[3];
		}
		
		System.out.print(cal);
	}
}
