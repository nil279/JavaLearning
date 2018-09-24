package variables;

public class VariableExample {

	public static String mystr = "static variable demo"; // static variable
	public String mystr2 = "Instance variable demo"; // instance variable

	public static void main(String[] args) {
		VariableExample obj = new VariableExample();
		VariableExample obj2 = new VariableExample();

		// static variable

		System.out.println(obj.mystr);
		System.out.println(obj2.mystr);

		obj2.mystr = "Updated Static string value ";

		System.out.println(obj.mystr);
		System.out.println(obj2.mystr);

		// Instance variables
		obj2.mystr2 = "Updated Instance string2 value ";

		System.out.println(obj.mystr2);
		System.out.println(obj2.mystr2);

		// local variable
		obj.myMethod();
		System.out.println(obj.mystr);

	}

	public void myMethod() {
		// local variable
		String mystr = "Inside Method";
		System.out.println(mystr);
	}
}
