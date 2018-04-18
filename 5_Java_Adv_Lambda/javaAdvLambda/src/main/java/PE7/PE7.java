package PE7;

import java.util.Scanner;

public class PE7 {
	
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	 
	MyFactor isafactor = (p,q) -> (q%p==0)?true:false;
	
	if(isafactor.compute(num1, num2))
		System.out.println(num1 +" is a factor of "+ num2);
	else
		System.out.println(num1 +" is not a factor of "+ num2);
	}
}
