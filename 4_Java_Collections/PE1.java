/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PE1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr = {1,2,3,4,5}; 
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
			arrlist.add(arr[i]);
		for (int i=0;i<arrlist.size();i++)
		{
			System.out.println(arrlist.get(i));
		}
	}
}
