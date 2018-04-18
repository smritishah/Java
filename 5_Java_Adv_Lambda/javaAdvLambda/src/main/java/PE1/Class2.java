package PE1;

public class Class2 {

	public Class1 getObj() {
		Class1 obj = new Class1() {
			public void print() {
				System.out.println("Hello from Inner class 1");
			}
		};
		return obj;
	}
}
