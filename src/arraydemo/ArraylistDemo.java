package arraydemo;

//https://beginnersbook.com/2013/12/difference-between-arraylist-and-linkedlist-in-java/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
//https://www.callicoder.com/java-arraylist/
public class ArraylistDemo {
	public static void main(String[] args) {
		System.out.println("This is ArrayList demo");

		// Creating an ArrayList of String
		List<String> animals = new ArrayList<>();

		// Adding new elements to the ArrayList
		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Cat");
		animals.add("Dog");

		System.out.println(animals);
		
		// Adding an element at a particular index in an ArrayList
		
		animals.add(2,"elephant");
		
		System.out.println("----------1");
		System.out.println(animals);
		System.out.println("----------2");
		
		//Accessing elements from an ArrayList
		System.out.println(animals.get(0));
		System.out.println(animals.get(1));
		System.out.println(animals.get(2));
		System.out.println(animals.get(3));
		System.out.println(animals.get(4));
		System.out.println("----------3");
		
		//Removing elements from an ArrayList
		System.out.println(animals.remove(2));
		System.out.println("----------4");
		
		
		
		System.out.println("----------5");
		
		System.out.println(animals.get(1));
		System.out.println(animals.get(2));
		System.out.println(animals.get(3));
		
		//Iterating over an ArrayList

		animals.forEach(a -> {
	            System.out.println("--> "+ a);
	        });
		
		//itereator 
	    Iterator<String> numbersIterator = animals.iterator();
	   
        while (numbersIterator.hasNext()) {
            String ani = numbersIterator.next();
            System.out.println("->-> "+ani);
        }

        //search within array 
        
        System.out.println("index of cat in animals --> "+animals.indexOf("Cat"));
		
		//List<String> birds = new IndexList<>();

		List<String> birds = new ArrayList<>();
		birds.add("Sparrow");
		birds.add("crow");
		birds.add("parrot");
		System.out.println(birds);
		
		
		
		
		System.out.println("***********************************");
		ArrayList al = new ArrayList();
		al.add(3);
		al.add(2);
		al.add(1);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(6);

		Iterator iter1 = al.iterator();
		while(iter1.hasNext()){
		System.out.println(iter1.next());
		}
		
		System.out.println("##################################");
		LinkedList ll = new LinkedList();
		ll.add(3);
		ll.add(2);
		ll.add(1);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		ll.add(6);

		Iterator iter2 = al.iterator();
		while(iter2.hasNext()){
		System.out.println(iter2.next());
		}
		
	}
}
