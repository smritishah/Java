/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PE1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int r,c,i,j;
		System.out.print("Enter no. of rows: ");
		r=sc.nextInt();
		System.out.print("Enter no. of columns: ");
		c=sc.nextInt();
		int arr1[]=new int[r*c];
		int arr2[]=new int[r*c];
		for(j=0;j<r*c;j++)
			arr1[j]=sc.nextInt();
		for(j=0;j<r*c;j++)
			arr2[j]=sc.nextInt();
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
				System.out.print(arr1[i*c+j]+arr2[i*c+j]+" ");
			System.out.println();
		}
	}
}
