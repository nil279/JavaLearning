package oopsconcept;

import org.apache.log4j.Logger;


public class Overriding2 extends Overriding1 {

	Logger logger = Logger.getLogger(InterfaceMamal.class);
	public String add(String a){
		logger.info("");
		return a;
	}
	
	public int add(int a, int b){
		return a*b;
	}
		
	public static void main(String args[]){
		Logger logger = Logger.getLogger(Overriding2.class);
	
		Overriding1 obj = new Overriding1();   // parent class's object 
		logger.info(obj.add(4, 5));
		
		Overriding2 obj2 = new Overriding2();  // current class object 
		logger.info(obj2.add(4,5));
		
		
	}
}
