package oopsconcept;
import org.apache.log4j.Logger;

public class AbstractclassB extends Abstractclass {

	public int calculateSalary() {
		return getPaymentPerHour()*8;
  
}
	
	public String empname() {
	   return getName();
	}
	
	public AbstractclassB(String name, int paymentPerHour) {
		super(name, paymentPerHour);
	}
	
	public static void main(String args[]) {
		
		Logger logger = Logger.getLogger(AbstractclassB.class);
		
		AbstractclassA obj = new AbstractclassA("Nilesh",70,40);
		AbstractclassB objB = new AbstractclassB("Poonam",80);
		logger.info(obj.calculateSalary());
		logger.info(objB.calculateSalary());
		logger.info(obj.empdetails());
	}

	@Override
	public String empdetails() {
		return getName();
		}
	
}