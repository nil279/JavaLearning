package arraydemo;
import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		  /* Linked List Declaration */
	       LinkedList<String> items = new LinkedList<>();

	       /*add(String Element) is used for adding 
	        * the elements to the linked list*/
	       items.add("Item1");
	       items.add("Item5");
	       items.add("Item3");
	       items.add("Item6");
	       items.add("Item2");
	       
	       System.out.println(items);
	       items.add(2, "item10");
	       System.out.println("@@@@@@@");
	       System.out.println(items);	            
	}
}
