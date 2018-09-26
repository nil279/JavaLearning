package variables;

import org.apache.log4j.Logger;

public class VariableExample {

	public static String mystr = "static variable demo"; // static variable
	public String mystr2 = "Instance variable demo"; // instance variable

	public static void main(String[] args) {

		Logger logger = Logger.getLogger(VariableExample.class);

		VariableExample obj = new VariableExample();
		VariableExample obj2 = new VariableExample();

		// static variable

		logger.info(obj.mystr);
		logger.info(obj2.mystr);

		obj2.mystr = "Updated Static string value ";

		logger.info(obj.mystr);
		logger.info(obj2.mystr);

		// Instance variables
		obj2.mystr2 = "Updated Instance string2 value ";

		logger.info(obj.mystr2);
		logger.info(obj2.mystr2);

		// local variable
		obj.myMethod();
		logger.info(obj.mystr);

	}

	public void myMethod() {

		Logger logger = Logger.getLogger(VariableExample.class);
		String mystr = "Inside Method"; // local variable
		logger.info(mystr);
	}
}
