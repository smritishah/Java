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
		int size=-2;
		try
		{
			String[] arr = new String[size];
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println("Negative size Error: "+e);
		}
		String[] A=null;
		try
		{
			System.out.println(A[3]);	
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer: "+e);
		}
		String[] arr={"apple","boy","cat"};
		try
		{
			System.out.println(arr[3]);
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Out of Bounds: "+ e);
		}
		
	}
}
