package PE2;

import PE2.Outer.Inner;

public class PE2 {

	public static void main(String[] args) {
		Outer outerObj = new Outer();
		Inner innerObj = outerObj.getObj();
		System.out.println(innerObj.getMsg());
	}
}
