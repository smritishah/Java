/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PE2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		String[] w = st.split("[ ,\\.\\*@?_-]+");
		Map<String, Integer> hm = new HashMap<String, Integer>();
		for (int i=0;i<w.length;i++)
		{
			if(hm.get(w[i])==null)
				hm.put(w[i],1);
			else
				hm.put(w[i],(hm.get(w[i]))+1);
		}
		List<String> li = new ArrayList<String>(hm.keySet());
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i)+":"+hm.get(li.get(i)));
		}
	}
}
