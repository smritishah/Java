/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of students: ");
		int n = sc.nextInt();
		boolean f=true;
		int grades[]=new int[n];
		for (int i=0;i<n;i++)
		{
			System.out.println("Enter grade for student "+(i+1)+": ");
			grades[i]=sc.nextInt();
			if (grades[i]<0 || grades[i]>100)
			{	System.out.println("Invalid input");f=false;break; }
		}
		if (!f)
			System.out.println("Program abort");
		else {
					average(grades);
					minimum(grades);
					maximum(grades);
				}
	}
	public static void average(int[] arr)
	{	
		int sum=0;
		for (int i=0;i<arr.length;i++)
			sum+=arr[i];
		System.out.println("Average is:"+sum/arr.length);
	}
	public static void maximum(int[] arr)
	{
		int max=arr[0];
		for (int i=1;i<arr.length;i++)
		{	
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("Maximum is:"+max);
	}
	public static void minimum(int[] arr)
	{	
		int min=arr[0];
		for (int i=1;i<arr.length;i++)
		{	
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Minimum is:"+min);
	}
}
