/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Outer
{
	Outer() {
		System.out.println("Message from outer default constructor");
	}
	class Inner {
		
		Inner() {
			System.out.println("Message from inner default constructor");
		}
	}
	public static void main(String[] args)
	{	
		Outer obj = new Outer();
		Inner inObj = obj.method();
	}
	Inner method() {
		return new Inner();
	}
	
}
