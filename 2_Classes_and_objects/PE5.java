/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class EvenNumTest
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		boolean b = isEven(a);
		if(b)
			System.out.println("Even No.");
		else
			System.out.println("Odd No.");
	}
	public static boolean isEven(int no) {
		boolean var;
		var=(no%2==0)?true:false;
		return var;
}
}
