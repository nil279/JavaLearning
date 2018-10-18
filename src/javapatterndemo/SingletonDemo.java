package javapatterndemo;

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
public class SingletonDemo {

	// static variable single instance of type Singleton
	private static SingletonDemo singleinstance = new SingletonDemo();

	// variable of type String
	public String name;

	// private constructor restricted to this class itself
	private SingletonDemo() {
		name = "Hello I am a string part of Singleton class";
	}

	// static method to create instance of Singleton class
	public static SingletonDemo getInstance() {

		if (singleinstance == null) {
			System.out.println("there is no instance of this class");
			singleinstance = new SingletonDemo();
		}
		return singleinstance;
	}

}

// Driver Class
class Main {
	public static void main(String[] args) {

		// instantiating Singleton class with variable x
		SingletonDemo x = SingletonDemo.getInstance();

		// instantiating Singleton class with variable y
		SingletonDemo y = SingletonDemo.getInstance();

		// instantiating Singleton class with variable z
		SingletonDemo z = SingletonDemo.getInstance();

		// changing variable of instance x
		x.name = (x.name).toUpperCase();
		y.name = "Nilesh";
		z.name = "patel";

		System.out.println("String from x is " + x.name);
		System.out.println("String from y is " + y.name);
		System.out.println("String from z is " + z.name);
		System.out.println("\n");

		// changing variable of instance z
		z.name = (z.name).toLowerCase();

		System.out.println("String from x is " + x.name);
		System.out.println("String from y is " + y.name);
		System.out.println("String from z is " + z.name);
	}
}