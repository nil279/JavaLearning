package oopsconcept;

//Encapsulation simply means binding object state(fields) and behaviour(methods) together. If you are creating class, you are doing encapsulation.
//The whole idea behind encapsulation is to hide the implementation details from users. If a data member is private it means it can only be accessed within the same class. No outside class can access private data member (variable) of other class.

public class EncapsulationDemo {

	private String Empname;
	private int dept;

	public String getEmpname() {
		return "Empolyee name : "+ Empname;
	}

	public void setEmpname(String empname) {
		Empname = empname;
	}

	public int getDept() {
		
		return dept;
	}

	public void setDept(int dept) {
		this.dept = dept;
	}

}
