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
		String w =sc.next(),new_w="";
		int n=w.length(),i;
		for (i=n-1;i>=0;i--)
			new_w=new_w+w.charAt(i);
		if (new_w.equals(w))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}
}
