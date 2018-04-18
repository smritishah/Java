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
		Map<String,String> hm = new HashMap<String,String>();
		// System.out.println("Enter key-value pair separated by space");
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			String s = sc.nextLine();
			hm.put(s.split(" ")[0],s.split(" ")[1]);
		}
		List<String> li = new ArrayList<String>(hm.keySet());
		if(hm.get(li.get(0)) != null)
		{
			hm.put(li.get(1),hm.get(li.get(0)));
			hm.put(li.get(0),"");			
		}
		for(int i=0;i<li.size();i++)
		{	
			
			System.out.println(li.get(i)+":"+hm.get(li.get(i)));
		}
	}
}
