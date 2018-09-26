package oopsconcept;

import org.apache.log4j.*;

public class InheritanceChild extends InheritanceParent {
	
	 String mainSubject = "Physics";
	 public void myfun(){
		 Logger logger = Logger.getLogger(InheritanceChild.class);
		 logger.info("Teaching from child class");
	 }
	 
	 public static void main(String args[]){
		 
		 Logger logger = Logger.getLogger(InheritanceChild.class);
		 
		 InheritanceChild obj = new InheritanceChild();
		 logger.info(obj.designation);
		 logger.info(obj.collegeName);
		 obj.myfun();
		 InheritanceParent obj2 = new InheritanceParent();
		 obj2.myfun();
	 }
}
