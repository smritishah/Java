/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PE2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double b=Math.log(n)/Math.log(4);	
			System.out.println(b);
		if(b-Math.floor(b)==0)
			System.out.println("Power of 4");
		else
			System.out.println("Not power of 4");
	}
}
