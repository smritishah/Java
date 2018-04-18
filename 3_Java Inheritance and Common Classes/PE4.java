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
		Scanner sc = new Scanner(System.in);
		String cb[][]=new String[8][8];
		for (int i=0;i<8;i++)
		{
			for (int j=0;j<8;j++)
			{
				if((i%2==0) && (j%2==0))
					cb[i][j]="WW";
				else
					cb[i][j]="BB";
				System.out.print(cb[i][j]+"|");
			}
			System.out.println();
		}
	}
}