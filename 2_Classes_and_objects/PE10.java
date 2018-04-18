/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PE10
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new FileReader("file10.txt"));
		Map<String,Integer> map = new HashMap<String,Integer>();
		String s="",file="";
		while((s=br.readLine())!=null)
			file=file+s;
		System.out.println(file);
		String[] str=file.split("[ ,.]");
		for(String i:str) {
			//System.out.println(s);
			if(map.get(i) != null)
				map.put(i, map.get(i)+1);
			else
				map.put(i, 1);
		}
		for(String i:map.keySet()) {
			System.out.println(i+" -> "+map.get(i));
		}
	}
}
