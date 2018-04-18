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
		if ((n%2)!=0 && n>20 && n<30)
			System.out.println("Tom");
		else if ((n%2)==0 && n>20 && n<30)
			System.out.println("Jerry");
		else
			System.out.println("No matching Output");
	}
}
