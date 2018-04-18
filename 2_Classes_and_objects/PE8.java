/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PE8
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		long f=1;
		for(int i=1;;i++)
		{
			f=f*i;
			System.out.println("Factorial of "+i+" is: "+f);
			if (f>Long.MAX_VALUE/(i+1))
			{
				System.out.println("Factorial of "+(i+1)+" is out of range!");
				break;
			}
		}
	}
}
