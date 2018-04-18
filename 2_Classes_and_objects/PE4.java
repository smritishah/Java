/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PE4
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new FileReader("file.txt"));
		String s="";
		while((s=br.readLine())!=null)
			System.out.println(s.toUpperCase());
	}
}
