package oopsconcept;

import org.apache.log4j.*;

public class EncapsulationTest {

	public static void main(String args[])
	{
	
		Logger logger = Logger.getLogger(EncapsulationTest.class);
		EncapsulationDemo obj = new EncapsulationDemo();
		obj.setEmpname("Nilesh");
		obj.setDept(11);
		
		
		logger.info(obj.getEmpname());
		logger.info(obj.getDept());
	}
	
	
}
