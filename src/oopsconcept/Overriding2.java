package oopsconcept;

public class Overriding2 extends Overriding1 {

	public String add(String a){
		System.out.println();
		return a;
	}
	
	public int add(int a, int b){
		return a*b;
	}
		
	public static void main(String args[]){
	
		Overriding1 obj = new Overriding1();   // parent class's object 
		System.out.println(obj.add(4, 5));
		
		Overriding2 obj2 = new Overriding2();  // current class object 
		System.out.println(obj2.add(4,5));
		
		
	}
}
