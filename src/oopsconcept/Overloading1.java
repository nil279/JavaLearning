package oopsconcept;

public class Overloading1 {

	public static void main(String args[]) {
		System.out.println("main method");
		Overloading1 obj = new Overloading1();
		System.out.println(obj.add(5,7));
		System.out.println(obj.add("nilesh","patel"));
		System.out.println(obj.add(6,7));
		System.out.println(obj.add(5,8));
	}
	
	public String add(String a, String b) {
		System.out.println("String");
		return a+"---"+b;
	}
	
	public int add(int a , int b) {
		System.out.println("Integer ");
		return a + b ;
	
	}
}
