
public class Othertest {
public static void main(String[] args) {
	int counter ;
	final int const_val=100;
	String str="Value One";
	
	str="New Value";
	System.out.println(str);
	for (counter = 0; counter < 10; counter++)
	{
	    

		if (counter == 4) {

			System.out.println("This will not get printed when counter is 4");
		    //continue;
			break;
		}
	    System.out.println(counter);

		}
}
}
