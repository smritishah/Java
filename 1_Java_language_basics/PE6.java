/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PE6
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		char a = A.charAt(0);
		if(a>='A' && a<='Z')
			System.out.println("Uppercase Letter");
	    else if(a>='a' && a<='z')
			System.out.println("Lowercase Letter");
		else if(a>=48 && a<=57)
			System.out.println("Digits");
		else
			System.out.println("Special Letter");
}
}
