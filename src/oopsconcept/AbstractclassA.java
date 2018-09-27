package oopsconcept;
import org.apache.log4j.Logger;
public class AbstractclassA extends Abstractclass {

	private int workingHours;
	
	public AbstractclassA(String name, int paymentPerHour, int workingHours) {
		super(name, paymentPerHour);
		this.workingHours = workingHours;
	}

	@Override
	public int calculateSalary() {
		return getPaymentPerHour() * workingHours;
	}

	public String empname() {
		return getName();
	}
	

	@Override
	public String empdetails() {
		// TODO Auto-generated method stub
		return "in the class A";
	}

	 public static void main(String args[]){ 
		 
		 Logger logger = Logger.getLogger(AbstractclassA.class);
		 
		 AbstractclassA obj = new AbstractclassA("Nilesh", 70, 40);	    
		 AbstractclassB obj2 = new AbstractclassB("Poonam",5);
	      logger.info(obj.calculateSalary());
	      logger.info(obj.empname());	
	      logger.info(obj2.empdetails());
	      logger.info("test");      
	      
	   }
}
