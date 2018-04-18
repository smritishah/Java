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
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b=a,sum=0;
		int arr[]=new int[10];
		while(b>0)
		{
			int d=b%10;
			b=b/10;
			arr[d]++;
		}		
		for (int i=9;i>=0;i--)
		{
			for (int j=0;j<arr[i];j++)
				System.out.print(i);
		}
		for(int i=8;i>=0;i=i-2)
		{
			sum+=i*arr[i];
		}
		System.out.println("Sum of even numbers:"+sum);
		System.out.println((sum>15)?"true":"false");
	}
}
