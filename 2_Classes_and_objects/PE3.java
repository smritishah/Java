/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Member
{		
	public String name;
	public int age;
	public double salary;
	Member() {}
	Member(String name,int age,double salary) {
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
}
class MemberVariable
{
	public static void main (String[] args) throws java.lang.Exception
	{
		method();
	}
	public static void method() {
		Member obj = new Member("Harry Potter",30,2500.3);
	System.out.println("Name:"+obj.name+'\n'+"Age:"+obj.age+'\n'+"Salary:"+obj.salary);
	}
}
