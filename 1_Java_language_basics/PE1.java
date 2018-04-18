/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PE1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int m=N,n=0;
		while (m>0)
		{
			int d=m%10;
			m=m/10;
			n=n*10+d;
		}
		if (n!=N)
			System.out.println("No. is not a palindrome");
		else
		{
			m=N;
			int sum=0;
			while (m>0)
			{
				int d =m%10;
				if (d%2==0)
					sum=sum+d;
				m=m/10;
			}
			if (sum>25)
				System.out.println("No. is palindrome and sum of even digits is more than 25");
			else
				System.out.println("No. is palindrome and sum of even digits is less than 25");
		}
	}
}
