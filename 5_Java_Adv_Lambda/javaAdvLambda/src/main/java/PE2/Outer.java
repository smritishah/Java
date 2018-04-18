package PE2;

public class Outer {

	public class Inner {
		
		private String Msg;
		Inner(String Msg) {
			this.Msg=Msg;
		}
		String getMsg() {
			return this.Msg;
		}
	}
	
	Inner getObj() {
		Inner innerObj = new Inner("Hi I am inner Object");
		return innerObj;
	}
}
