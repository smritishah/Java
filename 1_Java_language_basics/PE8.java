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
		Scanner sc = new Scanner(System.in);
		int guess=0;
		// int target = 50;
		int target=(int)Math.ceil(Math.random()*100);
		while (guess!=target)
		{	
			System.out.println("Type a no:");
			guess=sc.nextInt();
			if (guess==target)
			{
				System.out.println("Correct Guess");
				break;
			}

			else if (guess > target)
				System.out.println("Guess is more than target");
			else if (guess < target )
				System.out.println("Guess is less than target");
			else
				System.out.println("Only nos. are accepted");
			
		}
	}
}
