/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PE3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String w = sc.next();
		int f=1;
		int c=0;
		for (int i=0;i < w.length(); i++)
		{	
			char a = w.charAt(i);
			if ((a>='A' && a<='Z') || (a>='a' && a <= 'z')) c++;
			else
			{
				System.out.println("Error");
				f=0;
				break;
			}
		}
		if (f==1)
		for (int i=0;i<w.length();i++)
		{
			char a = w.charAt(i);
			if ( a == 'a' || a == 'e' || a=='i' || a=='o' || a=='u')
				System.out.println(a+" vowel");
			else
				System.out.println(a+" constant");
		}		
	}
}
