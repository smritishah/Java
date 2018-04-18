/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PE10
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		String w = sc.next();
		int a = sc.nextInt();
		System.out.print(w);
		if (a < w.length()) {
		for (int i=1;i<=a;i++) {
		System.out.print(w.substring(w.length()-a));
		} }
		else {
			System.out.println("Error");
		}
	}
}
