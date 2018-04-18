/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PE4
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try {
			int[] arr = new int[-1];
		}
		catch(NegativeArraySizeException e) {
			System.out.println(e);
		}
		int[] arr = new int[5];
		try {
			System.out.println(arr[5]);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println(e);
		}
		String s = null;
		try {
			if(s.equals("abc"))
				System.out.println("A match found");
			else
				System.out.println("No Match exists");
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		//for(int i: arr)
			//System.out.println(arr[5]);
	}
}
