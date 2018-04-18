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
		ArrayList<String> c1= new ArrayList<String>();
		ArrayList<String> c2= new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements for first arraySet. Press 0 when done!");
		while(sc.hasNext())
		{
			String s = sc.next();
			if(s.equals("0"))
				break;
			else
				c1.add(s);
		}
		System.out.println("Enter elements for second ArraySet");
		while(sc.hasNext())
			c2.add(sc.next());
		ArrayList<String> r= new ArrayList<String>();
		for(int i=0;i<c1.size();i++)
		{	
			if (c2.contains(c1.get(i)))
				r.add("Yes");
			else
				r.add("No");
		}
		for(int i=0;i<r.size();i++)
			System.out.print(r.get(i)+" ");	
	}
}
