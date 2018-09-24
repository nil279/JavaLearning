package oopsconcept;

//Polymorphism allows us to perform a single action in different ways. For example, lets say we have a class Animal that has a method sound(). Since this is a generic class so we can’t give it a implementation like: Roar, Meow, Oink etc. We had to give a generic message.

//Compile time Polymorphism or Static Ploymorphism

public class Overloading1 {
	// compile  time polymorphism
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
