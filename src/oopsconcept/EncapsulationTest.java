package oopsconcept;

public class EncapsulationTest {

	public static void main(String args[]){
		
		EncapsulationDemo obj = new EncapsulationDemo();
		obj.setEmpname("Nilesh");
		obj.setDept(11);
		
		
		System.out.println(obj.getEmpname());
		System.out.println(obj.getDept());
	}
	
	
}
