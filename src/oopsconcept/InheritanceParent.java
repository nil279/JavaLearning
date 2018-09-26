package oopsconcept;
import org.apache.log4j.*;

/*
Inheritance is a process of defining a new class based on an existing class by extending its common data members and methods.
Inheritance allows us to reuse of code, it improves reusability in your java application.
*/
public class InheritanceParent {
	Logger logger = Logger.getLogger(InheritanceParent.class);
	
	String designation = "Teacher";
	String collegeName = "Beginnersbook";
	
	void myfun(){
		logger.info("Teaching");
	   }

}
