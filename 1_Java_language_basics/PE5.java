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
		System.out.println("To exit press 0");
		int sum=0,a=0,flag=0;
		try {
			a = sc.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid Input"+'\n'+"Program Aborts");	
			flag=1;
		}
		while (a != 0)
		{	
			sum=sum+a;
			try {
				a = sc.nextInt();	
			}
			catch(InputMismatchException e) {
				System.out.println("Invalid Input"+'\n'+"Program Aborts");	
				System.out.println("Sum is:"+sum);
				a=0;
				flag=1;
			}
		}
		if (a==0 && flag==0)
			System.out.println("Sum is:"+sum);		
	}
}
