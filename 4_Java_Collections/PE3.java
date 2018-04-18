/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PE3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		List<String> li = new ArrayList<String>();
		while(sc.hasNext())
			li.add(sc.next());
		for(int i=0;i<li.size();i++)
			System.out.println(li.get(i));
		Map<String, Boolean> hm = new HashMap<String, Boolean>();
		for (int i=0;i<li.size();i++)
		{
			if(hm.get(li.get(i))==null)
				hm.put(li.get(i),false);
			else if(hm.get(li.get(i))==false)
				hm.put(li.get(i),true);
		}
		List<String> KS = new ArrayList<String>(hm.keySet());
		for(int i=0;i<KS.size();i++)
		{
			System.out.println(KS.get(i)+":"+hm.get(KS.get(i)));
		}
	}
}
