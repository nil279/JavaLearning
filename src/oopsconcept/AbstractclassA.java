package oopsconcept;

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
		 AbstractclassA obj = new AbstractclassA("Nilesh", 70, 40);	    
		 AbstractclassB obj2 = new AbstractclassB("Poonam",5);
	      System.out.println(obj.calculateSalary());
	      System.out.println(obj.empname());
	      System.out.println(obj2.empdetails());
	      
	      
	   }
}
