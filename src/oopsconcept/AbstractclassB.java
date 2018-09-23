package oopsconcept;

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
		AbstractclassA obj = new AbstractclassA("Nilesh",70,40);
		AbstractclassB objB = new AbstractclassB("Poonam",80);
		System.out.println(obj.calculateSalary());
		System.out.println(objB.calculateSalary());
		System.out.println(obj.empdetails());
	}

	@Override
	public String empdetails() {
		return getName();
		}
	
}