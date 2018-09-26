package oopsconcept;

import org.apache.log4j.Logger;

public class InterfaceMamal implements Interfaceanimal {

	Logger logger = Logger.getLogger(InterfaceMamal.class);

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
		
		Logger logger = Logger.getLogger(InterfaceMamal.class);
		
		logger.info("");

		InterfaceMamal obj = new InterfaceMamal();
		obj.eat();
		obj.travel();
	}

}
