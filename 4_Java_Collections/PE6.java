/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PE6
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		SortedSet<String> hs = new TreeSet<String>();
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			hs.add(sc.next());
		}
//		hs.add("Harry");
//		hs.add("Olive");
//		hs.add("Alice");
//		hs.add("Bluto");
//		hs.add("Eugene")
		System.out.print("Sorted set: ");
		Iterator<String> iterator = hs.iterator();
		while(iterator.hasNext())
		{
  			String element = (String) iterator.next();
			System.out.print(element+" ");
		}
		List<String> li = new ArrayList<String>();
		li.addAll(hs);
		System.out.print("\n"+"ArrayList from set: ");
		for(int i=0;i<li.size();i++)
			System.out.print(li.get(i)+" ");
	}
}
