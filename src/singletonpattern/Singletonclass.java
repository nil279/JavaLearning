 package singletonpattern;

/*
 In object-oriented programming, a singleton class is a class that can have only one object (an instance of the class) at a time.
 After first time, if we try to instantiate the Singleton class, the new variable also points to the first instance created. So whatever modifications we do to any variable inside the class through any instance, it affects the variable of the single instance created and is visible if we access that variable through any variable of that class type defined.

 To design a singleton class:
 Make constructor as private.

 Normal class vs Singleton class: Difference in normal and singleton class in terms of instantiation is that, For normal class we use constructor, whereas for singleton class we use getInstance() method (Example code:I). In general, to avoid confusion we may also use the class name as method name while defining this method (Example code:II).

 */

/*
 Lazy initialization :
 Write a static method that has return type object of this singleton class. Here, the concept of Lazy initialization in used to write this static method.

 */
public class Singletonclass {

	// static variable singleinstance of type Singleton
	private static Singletonclass singleinstance = new Singletonclass();
	//public static Singletonclass singleinstance = new Singletonclass();

	// variable of type String
	public String s;

	private String s2;

	private static String s3;

	// private constructor restricted to this class itself
	//private Singletonclass() {
	 Singletonclass() {
		s = "Hello I am a string part of Singleton class";
	}

	// static method to create instance of Singleton class
	public static Singletonclass getInstance() {

		if (singleinstance == null){
			System.out.println("there is no instance of this class");
			singleinstance = new Singletonclass();		
		}
		return singleinstance;	
	}

}

// Driver Class
class Main {
	public static void main(String[] args) {

		// instantiating Singleton class with variable x
		Singletonclass x = Singletonclass.getInstance();

		// instantiating Singleton class with variable y
		Singletonclass y = Singletonclass.getInstance();

		// instantiating Singleton class with variable z
		Singletonclass z = Singletonclass.getInstance();

		// changing variable of instance x
		x.s = (x.s).toUpperCase();
		y.s ="Nilesh";
		z.s ="patel";

		System.out.println("String from x is " + x.s);
		System.out.println("String from y is " + y.s);
		System.out.println("String from z is " + z.s);
		System.out.println("\n");

		// changing variable of instance z
		z.s = (z.s).toLowerCase();

		System.out.println("String from x is " + x.s);
		System.out.println("String from y is " + y.s);
		System.out.println("String from z is " + z.s);
	}
}