/* package whatever; // don't place package name! */

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PE5
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String w = sc.next();
		Pattern p = Pattern.compile("[ ]"+w+"[^A-Za-z]");
		Matcher m = p.matcher(S);
		while(m.find())
		{
			System.out.println("Is "+w+" here ? : "+"true");
			break;
		}
	}
}
