package oopsconcept;

import org.apache.log4j.Logger;

public class InterfaceDemo implements Interfaceanimal {

	Logger logger = Logger.getLogger(InterfaceDemo.class);

	@Override
	public void eat() {
		logger.info("Mammal eats");
	}

	@Override
	public void travel() {
		logger.info("Mammal travels");
	}

	public int noOfLegs() {
		return 0;
	}

	@Override
	public String origin() {
		logger.info("Mammal origin");
		return null;
	}


	public static void main(String[] args) {
		
		Logger logger = Logger.getLogger(InterfaceDemo.class);
		
		logger.info("");

		InterfaceDemo obj = new InterfaceDemo();
		obj.eat();
		obj.travel();
	}

}
