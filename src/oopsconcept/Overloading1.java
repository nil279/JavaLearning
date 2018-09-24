package oopsconcept;

public class Overloading1 {

	public int add(int a , int b){
		return a+b;
	}
	
	public String add (String a , String b){
		return a+" "+b;
	}
	
	public static void main(String args[]) {
		Overloading1 obj = new Overloading1();
		System.out.println(obj.add(3, 4));
		System.out.println(obj.add("nilesh","Patel"));
	}
}
