/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PE5
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] w=s.split(",");
		int i,f=0,l=w.length;
		int[] n = new int[l];
		for(i=0;i<l;i++)
		{	n[i]=Integer.parseInt(w[i]);
			System.out.println(n[i]);
		}
		int diff=n[1]-n[0];
		for(i=2;i<l;i++)
		{
			if(n[i]-n[i-1] != diff)
			{
				f=1;
				break;
			}
		}
		if (f==0)
			System.out.println("consecutive");
		else
			System.out.println("non-consecutive");
	}
}
