/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PE7
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		long f=1;
		for(int i=1;;i++)
		{
			f=1;
			for (int j=1;j<=i;j++)
				f=f*j;
			if(f<=Integer.MAX_VALUE)
				System.out.println("Factorial of "+i+" is: "+f);
			else
				{System.out.println("Factorial of "+i+" is out of range");break;}
		     
		}
	
	}
}
